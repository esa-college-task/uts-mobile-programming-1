package com.example.uts_mobile_programming_1.ui.gamelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.uts_mobile_programming_1.data.DummyData
import com.example.uts_mobile_programming_1.data.model.Game

class GameListViewModel : ViewModel() {

    private val _allGames = MutableLiveData<List<Game>>()
    val allGames: LiveData<List<Game>> = _allGames

    init {
        _allGames.value = DummyData.games
    }
}
