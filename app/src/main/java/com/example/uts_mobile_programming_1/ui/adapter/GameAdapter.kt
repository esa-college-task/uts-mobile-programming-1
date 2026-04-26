package com.example.uts_mobile_programming_1.ui.adapter

import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.example.uts_mobile_programming_1.R
import com.example.uts_mobile_programming_1.data.model.Game
import com.example.uts_mobile_programming_1.databinding.ItemGameHorizontalBinding
import com.example.uts_mobile_programming_1.databinding.ItemGameVerticalBinding

class GameAdapter(
    private val isHorizontal: Boolean,
    private val onItemClick: (Game) -> Unit
) : ListAdapter<Game, RecyclerView.ViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<Game>() {
        override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (isHorizontal) {
            HorizontalViewHolder(ItemGameHorizontalBinding.inflate(inflater, parent, false))
        } else {
            VerticalViewHolder(ItemGameVerticalBinding.inflate(inflater, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val game = getItem(position)
        if (holder is HorizontalViewHolder) holder.bind(game)
        else if (holder is VerticalViewHolder) holder.bind(game)
    }

    inner class HorizontalViewHolder(private val binding: ItemGameHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(game: Game) {
            binding.tvGameTitle.text = game.title
            binding.tvPlatform.text = game.platform
            binding.ivGameCover.setImageResource(game.imageResId)
            binding.root.setOnClickListener { onItemClick(game) }
        }
    }

    inner class VerticalViewHolder(private val binding: ItemGameVerticalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(game: Game) {
            binding.tvGameTitle.text = game.title
            binding.tvPlatform.text = game.platform
            
            binding.cgStatuses.removeAllViews()
            game.statuses.forEach { status ->
                val themedContext = ContextThemeWrapper(binding.root.context, R.style.Widget_App_Chip_Status)
                val chip = Chip(themedContext).apply {
                    text = status
                    setChipBackgroundColorResource(R.color.status_bg)
                }
                binding.cgStatuses.addView(chip)
            }

            binding.ivGameCover.setImageResource(game.imageResId)
            binding.root.setOnClickListener { onItemClick(game) }
        }
    }
}
