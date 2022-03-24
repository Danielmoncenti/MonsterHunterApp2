package com.example.monsterhunter_companion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monsterhunter_companion.data.Weapons
import com.example.monsterhunter_companion.databinding.ActivityWeaponInfoBinding

class WeaponInfoActivity(): AppCompatActivity() {

    lateinit var binding:ActivityWeaponInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeaponInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.text = intent.getStringExtra("name")
        binding.tvRarityDetails.text = intent.getStringExtra("rarity")
        binding.tvDamageDetails.text = intent.getStringExtra("damage")
        binding.tvElementalDamageDetails.text = intent.getStringExtra("elemental_damage")
        binding.tvAffiniryDetails.text = intent.getStringExtra("affinity ")
        binding.tvMaterialsDetails.text = intent.getStringExtra("materials")
        binding.tvImageDetails.setImageResource(intent.getIntExtra("type", 0))
        binding.tvElementDetails.setImageResource(intent.getIntExtra("element", 0))

    }
}