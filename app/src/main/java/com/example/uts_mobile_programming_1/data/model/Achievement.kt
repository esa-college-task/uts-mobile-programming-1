package com.example.uts_mobile_programming_1.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Achievement(
    val id: Int,
    val title: String,
    val description: String,
    val points: Int
) : Parcelable
