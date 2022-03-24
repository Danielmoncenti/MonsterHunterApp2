package com.example.monsterhunter_companion.monsters

import android.content.Context
import android.content.Intent
import com.example.monsterhunter_companion.data.Monsters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.MonsterInfoActivity
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.WeaponInfoActivity


class MonstersRecycleViewAdapter (val context: Context, private val monsters: List<Monsters>):

    RecyclerView.Adapter<MonstersRecycleViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_monsters, parent, false  )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val monster = monsters[position]
        holder.name.text= monster.name
        holder.icon.setImageResource(monster.image)

        holder.itemView.setOnClickListener {
            val intent = Intent(this.context, MonsterInfoActivity()::class.java)
            intent.putExtra("name",monster.name)
            intent.putExtra("type",monster.type)
            intent.putExtra("weakness",monster.weakness)
            intent.putExtra("map",monster.map)
            intent.putExtra("image", monster.image)
            this.context.startActivity(intent)
        }


    }


    override fun getItemCount(): Int = monsters.size
    inner class ViewHolder(val view: View) :RecyclerView.ViewHolder(view) {
        val name : TextView = view.findViewById(R.id.monster_name)
        val icon : ImageView = view.findViewById(R.id.monster_icon)
    }

}
