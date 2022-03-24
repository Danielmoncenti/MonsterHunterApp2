package com.example.monsterhunter_companion.data

import com.example.monsterhunter_companion.R

object ArmorsList: ArrayList<Armors>() {
init{
    add(Armors("Armadura de cuero", 15, "Rareza 1", "Gran Jaggi", R.drawable.chest_icon))
    add(Armors("Guantes de cuero", 10, "Rareza 1", "Gran Jaggi", R.drawable.arm_icon))
    add(Armors("Botas de cuero", 10, "Rareza 1", "Gran Jaggi", R.drawable.leg_icon))

    }

}