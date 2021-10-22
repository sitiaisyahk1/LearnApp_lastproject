package com.aisyah.learnapp.model.listweb

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WebModulesList(
    var title: String,
    var lable: String,
    var date: String,
    var description: String,
    var img: Int
) : Parcelable