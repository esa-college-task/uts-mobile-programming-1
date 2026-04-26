package com.example.uts_mobile_programming_1.ui.gamelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uts_mobile_programming_1.databinding.FragmentGameListBinding
import com.example.uts_mobile_programming_1.ui.adapter.GameAdapter

class GameListFragment : Fragment() {

    private var _binding: FragmentGameListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GameListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gameAdapter = GameAdapter(isHorizontal = false) { game ->
            val action = GameListFragmentDirections.actionGameListFragmentToAchievementDetailFragment(game)
            findNavController().navigate(action)
        }

        binding.rvGameList.apply {
            adapter = gameAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        viewModel.allGames.observe(viewLifecycleOwner) {
            gameAdapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
