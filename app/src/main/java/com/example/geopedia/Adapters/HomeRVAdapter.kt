package com.example.geopedia.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.geopedia.Models.HomeCardData
import com.example.geopedia.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView

class HomeRVAdapter(private val cardList: ArrayList<HomeCardData>): RecyclerView.Adapter<HomeRVAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).
        inflate(R.layout.rvhome_list_item, parent,false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cardData = cardList[position]
        holder.title.text = cardData.title
        holder.subtitle.text = cardData.subtitle
        holder.description.text = cardData.description
        holder.image.setImageResource(cardData.image!!)
        /*holder.btnExplore.setOnClickListener(cardData.btnExplore)*/
        /*holder.url*/
    }

    class MyViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleitem)
        val subtitle: TextView = itemView.findViewById(R.id.secitem)
        val description: TextView = itemView.findViewById(R.id.descitem)
        val image: ImageView = itemView.findViewById(R.id.imgitem)
        /*val url: String? = null*/
        /*val btnExplore: MaterialButton = itemView.findViewById(R.id.btnExplore)*/
    }

}