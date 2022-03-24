package com.example.monsterhunter_companion.data

import android.media.Image
import android.widget.ImageView

class Weapons(
    val name: String,
    val type: String,
    val damage: Int,
    val element: Int,
    val elementDamage: Int,
    val affinity: String,
    val rarity: String,
    val materials: String,
    val image: Int
) {
}