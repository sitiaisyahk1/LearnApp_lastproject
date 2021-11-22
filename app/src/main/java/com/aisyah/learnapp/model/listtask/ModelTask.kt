package com.aisyah.learnapp.model.listtask

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelTask(
    var title: String = "",
    var category: String = "",
    var time: String = "",
    var desc: String = "",
    var img: Int = 0
) : Parcelable