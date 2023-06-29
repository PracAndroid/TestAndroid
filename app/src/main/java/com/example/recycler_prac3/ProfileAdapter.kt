package com.example.recycler_prac3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter (val itemList:ArrayList<Profile>):RecyclerView.Adapter<ProfileAdapter.VH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return VH(view). apply {
            itemView.setOnClickListener {
                val curpos=adapterPosition
                val profile:Profile=itemList.get(curpos)
                Toast.makeText(parent.context, profile.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.image.setImageResource(itemList.get(position).image)
        holder.name.text=itemList.get(position).name
        holder.age.text=itemList.get(position).age.toString()
        holder.job.text=itemList.get(position).job

    }

    override fun getItemCount(): Int =itemList.size

    class VH(itemView:View):RecyclerView.ViewHolder(itemView){
        val image:ImageView=itemView.findViewById(R.id.iv_profile)
        val name:TextView=itemView.findViewById(R.id.tv_name)
        val age:TextView=itemView.findViewById(R.id.tv_age)
        val job:TextView=itemView.findViewById(R.id.tv_job)
    }
}