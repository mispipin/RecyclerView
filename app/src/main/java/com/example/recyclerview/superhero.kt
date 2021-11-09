package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String,
):Parcelable

