package com.aisyah.learnapp.model.liststudent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelStudent(
    var name: String  = "",
    var rank: String  = "",
    var like: String  = "",
    var desc: String  = "",
    var point: String  = "",
    var img: Int = 0
) : Parcelable