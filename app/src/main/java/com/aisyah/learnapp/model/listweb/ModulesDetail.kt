package com.aisyah.learnapp.model.listweb

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModulesDetail(
    var title: String,
    var lable: String,
    var category: String,
    var date: String,
    var description: String,
    var linkModule: String,
    var img: Int
) : Parcelable