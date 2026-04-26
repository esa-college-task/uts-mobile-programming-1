package com.example.uts_mobile_programming_1.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.uts_mobile_programming_1.databinding.FragmentAchievementDetailBinding
import com.example.uts_mobile_programming_1.ui.adapter.AchievementAdapter

class AchievementDetailFragment : Fragment() {

    private var _binding: FragmentAchievementDetailBinding? = null
    private val binding get() = _binding!!
    private val args: AchievementDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAchievementDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val game = args.game
        val achievementAdapter = AchievementAdapter()

        binding.apply {
            tvDetailTitle.text = game.title
            tvDetailPlatform.text = game.platform
            
            Glide.with(requireContext())
                .load(game.imageResId)
                .into(ivGameDetailCover)

            rvAchievements.apply {
                adapter = achievementAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }

            toolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }
        }

        achievementAdapter.submitList(game.achievements)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
