package com.example.monsterhunter_companion.armors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.ArmorInfoActivity
import com.example.monsterhunter_companion.MonsterInfoActivity
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.data.Armors

class ArmorsRecycleViewAdapter(val context: Context, private val armors: List<Armors>) : RecyclerView.Adapter<ArmorsRecycleViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_armors,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val armor = armors[position]
        holder.name.text = armor.name
        holder.rarity.text = armor.rarity
        holder.defense.text = armor.defense.toString()
        holder.icon.setImageResource(armor.type)
        holder.defenseicon.setImageResource(R.drawable.defense_icon)


        holder.itemView.setOnClickListener {
            val intent = Intent(this.context, ArmorInfoActivity()::class.java)
            intent.putExtra("name",armor.name)
            intent.putExtra("rarity",armor.rarity)
            intent.putExtra("defense",armor.defense.toString())
            intent.putExtra("materials",armor.materials)
            intent.putExtra("image",armor.type)
            this.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = armors.size

    inner class ViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        val name : TextView= view.findViewById(R.id.armor_name)
        val rarity: TextView= view.findViewById(R.id.armor_rarity)
        val defense: TextView= view.findViewById(R.id.defense)
        val icon : ImageView = view.findViewById(R.id.armor_icon)
        val defenseicon: ImageView = view.findViewById(R.id.defense_icon)

    }


}