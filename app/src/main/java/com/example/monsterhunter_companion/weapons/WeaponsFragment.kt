package com.example.monsterhunter_companion.weapons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.data.Weapons
import com.example.monsterhunter_companion.data.WeaponsList
import com.example.monsterhunter_companion.databinding.FragmentWeaponsBinding
import com.example.monsterhunter_companion.databinding.FragmentWeaponsListBinding

class WeaponsFragment : Fragment() {

    private var weaponsToShow = ArrayList<Weapons>()
    private var weaponsFilters = ArrayList<String>()

    lateinit var binding: FragmentWeaponsListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentWeaponsListBinding.inflate(inflater)
        weaponsToShow = WeaponsList


        context?.let {
            binding.weaponList.adapter = WeaponsRecycleViewAdapter(it, weaponsToShow)
        } ?: activity?.finish()


        return binding.root
    }

    fun refreshData() {
        binding.weaponList.adapter?.notifyDataSetChanged()
    }

    fun filterWeapons(){
//    for each

    }

}
