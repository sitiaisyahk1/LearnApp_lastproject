package com.aisyah.learnapp.model.liststudent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListTopStudentModel(
    var name: String,
    var rank: String,
    var point: String,
    var img: Int
) : Parcelable