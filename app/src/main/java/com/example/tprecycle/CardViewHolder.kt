package com.example.tprecycle

import androidx.recyclerview.widget.RecyclerView
import com.example.tprecycle.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: GovClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindGov(Gov: Gov)
    {
        cardCellBinding.cover.setImageResource(Gov.cover)
        cardCellBinding.title.text = Gov.title

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(Gov)
        }
    }
}