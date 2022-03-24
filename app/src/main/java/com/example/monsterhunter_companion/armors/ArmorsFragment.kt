package com.example.monsterhunter_companion.armors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.data.ArmorsList
import com.example.monsterhunter_companion.data.MonstersList
import com.example.monsterhunter_companion.monsters.MonstersFragment
import com.example.monsterhunter_companion.monsters.MonstersRecycleViewAdapter

class ArmorsFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_armors_list,container,false)

        if(view is RecyclerView){
            context?.let {
                view.adapter = ArmorsRecycleViewAdapter(it, ArmorsList)
            }?:activity?.finish()

            }

        return view

    }

}