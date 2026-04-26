package com.example.uts_mobile_programming_1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uts_mobile_programming_1.databinding.FragmentDashboardBinding
import com.example.uts_mobile_programming_1.ui.adapter.GameAdapter

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private val viewModel: DashboardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trendingAdapter = GameAdapter(isHorizontal = true) { game ->
            val action = DashboardFragmentDirections.actionDashboardFragmentToAchievementDetailFragment(game)
            findNavController().navigate(action)
        }

        val masteredAdapter = GameAdapter(isHorizontal = false) { game ->
            val action = DashboardFragmentDirections.actionDashboardFragmentToAchievementDetailFragment(game)
            findNavController().navigate(action)
        }

        binding.rvTrending.apply {
            adapter = trendingAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        binding.rvMastered.apply {
            adapter = masteredAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        viewModel.trendingGames.observe(viewLifecycleOwner) {
            trendingAdapter.submitList(it)
        }

        viewModel.masteredGames.observe(viewLifecycleOwner) {
            masteredAdapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
