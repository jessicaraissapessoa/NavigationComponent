package br.com.jessicaraissapessoa.navigation.navigation.component.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val name : String = "",
    val age : Int = 0,
    val street : String = "",
    val number: Int = 0
) : Parcelable
