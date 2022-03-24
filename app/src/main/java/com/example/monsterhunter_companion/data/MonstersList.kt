package com.example.monsterhunter_companion.data

import com.example.monsterhunter_companion.R

object MonstersList: ArrayList<Monsters>() {
init{
    add(Monsters("Gran Jaggi", "Wyvern Pajaro", "Fuego", "Llanuras", R.drawable.great_jaggi_icon))
    add(Monsters("Gran Jagrass", "Bestia","Electricidad","Pantano", R.drawable.great_jagrass_icon))
    add(Monsters("Kirin", "Dragon Anciano", "Fuego","Altiplanos Coralinos", R.drawable.kirin_icon))
}

}