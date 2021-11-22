package com.aisyah.learnapp.model.liststudent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailStudentModel(
    var name: String,
    var like: String,
    var desc: String,
    var img: Int
) : Parcelable