package com.example.uts_mobile_programming_1.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val id: Int,
    val title: String,
    val platform: String,
    @DrawableRes val imageResId: Int,
    val statuses: List<String>,
    val achievements: List<Achievement> = emptyList()
) : Parcelable
