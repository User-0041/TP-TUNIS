package com.example.tprecycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tprecycle.databinding.CardCellBinding


class CardAdapter (private val Govs: List<Gov>,private val clickListener: GovClickListener): RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.bindGov(Govs[position])
    }
    public fun  update(){
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = Govs.size

}