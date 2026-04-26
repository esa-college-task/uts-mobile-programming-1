package com.example.uts_mobile_programming_1.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.uts_mobile_programming_1.data.DummyData
import com.example.uts_mobile_programming_1.data.model.Game

class DashboardViewModel : ViewModel() {

    private val _trendingGames = MutableLiveData<List<Game>>()
    val trendingGames: LiveData<List<Game>> = _trendingGames

    private val _masteredGames = MutableLiveData<List<Game>>()
    val masteredGames: LiveData<List<Game>> = _masteredGames

    init {
        loadDashboardData()
    }

    private fun loadDashboardData() {
        _trendingGames.value = DummyData.games.filter { it.statuses.contains("Trending") }
        _masteredGames.value = DummyData.games.filter { it.statuses.contains("Mastered") }
    }
}
