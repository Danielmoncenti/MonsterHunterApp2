package com.example.monsterhunter_companion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.monsterhunter_companion.databinding.ActivityMonsterInfoBinding


class MonsterInfoActivity : AppCompatActivity() {
    lateinit var binding:ActivityMonsterInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonsterInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.monsterNameInfo.text= intent.getStringExtra("name")
        binding.monsterTypeInfo.text= intent.getStringExtra("type")
        binding.monsterWeaknessInfo.text= intent.getStringExtra("weakness")
        binding.monsterMapInfo.text= intent.getStringExtra("map")
        binding.monsterImageInfo.setImageResource(intent.getIntExtra("image",0))

    }
}