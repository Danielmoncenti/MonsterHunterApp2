package com.example.monsterhunter_companion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monsterhunter_companion.databinding.ActivityArmorInfoBinding



class ArmorInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityArmorInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArmorInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.armorNameInfo.text= intent.getStringExtra("name")
        binding.armorRarityInfo.text= intent.getStringExtra("rarity")
        binding.armorDefenseInfo.text= intent.getStringExtra("defense")
        binding.armorMaterialsInfo.text= intent.getStringExtra("materials")
        binding.armorIconInfo.setImageResource(intent.getIntExtra("image", 0))
    }
}