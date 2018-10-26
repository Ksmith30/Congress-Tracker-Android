package com.example.kylesmith.congresstracker

import android.os.Parcel
import android.os.Parcelable

data class Results (
        val congress: String?,
        val chamber: String?,
        val num_results: Int?,
        val offset: Int?,
        val members: Array<CongressMember>?
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.createTypedArray(CongressMember)
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(congress)
        parcel.writeString(chamber)
        parcel.writeValue(num_results)
        parcel.writeValue(offset)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Results> {
        override fun createFromParcel(parcel: Parcel): Results {
            return Results(parcel)
        }

        override fun newArray(size: Int): Array<Results?> {
            return arrayOfNulls(size)
        }
    }
}