package com.aisyah.learnapp.model.listtask

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListTaskModel(
    var title: String,
    var category: String,
    var time: String,
    var img: Int
) : Parcelable