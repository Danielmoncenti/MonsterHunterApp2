package com.example.monsterhunter_companion.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.monsterhunter_companion.armors.ArmorsFragment
import com.example.monsterhunter_companion.monsters.MonstersFragment
import com.example.monsterhunter_companion.weapons.WeaponsFragment
import kotlin.IllegalStateException


class SectionPageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        val WEAPONS_ID = 0
        val ARMORS_ID = 1
        val MONSTERS_ID = 2
    }

    private var needsRefresh: Int? = null

    private val TAB_TITLES = arrayOf(
        "WEAPONS",
        "ARMORS",
        "MONSTERS"
    )

    override fun getItem(position: Int): Fragment {
        return when (position) {
            WEAPONS_ID -> WeaponsFragment()
            ARMORS_ID -> ArmorsFragment()
            MONSTERS_ID -> MonstersFragment()
            else -> throw IllegalStateException("There is onyl 3 tabs")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TAB_TITLES[position]
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }

    override fun getItemPosition(fragment: Any): Int {
        if (fragment is WeaponsFragment && needsRefresh == WEAPONS_ID) {
            fragment.refreshData()
        } else if (fragment is ArmorsFragment && needsRefresh == ARMORS_ID) {
        } else if (fragment is MonstersFragment && needsRefresh == MONSTERS_ID) {

        }
        return super.getItemPosition(fragment)
    }

    fun refreshData(currentFragment: Int) {
        needsRefresh = currentFragment
    }


}