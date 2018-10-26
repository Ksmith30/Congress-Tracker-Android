package com.example.kylesmith.congresstracker

import android.os.Parcel
import android.os.Parcelable

data class CongressMember(
    val id: String?,
    val title: String?,
    val short_title: String?,
    val api_uri : String?,
    val first_name : String?,
    val middle_name : String?,
    val last_name : String?,
    val suffix : String?,
    val date_of_birth : String?,
    val gender : String?,
    val party : String?,
    val leadership_role : String?,
    val twitter_account : String?,
    val facebook_account : String?,
    val youtube_account : String?,
    val govtrack_id : String?,
    val cspan_id : String?,
    val votesmart_id : String?,
    val icpsr_id : String?,
    val crp_id : String?,
    val google_entity_id : String?,
    val fec_candidate_id : String?,
    val url: String?,
    val rss_url: String?,
    val contact_form: String?,
    val in_office: Boolean?,
    val dw_nominate: Float?,
    val ideal_point: String?,
    val seniority: String?,
    val next_election: String?,
    val total_votes: Int?,
    val missed_votes: Int?,
    val total_present: Int?,
    val last_updated: String?,
    val ocd_id: String?,
    val office: String?,
    val phone: String?,
    val fax: String?,
    val state: String?,
    val senate_class : String?,
    val state_rank: String?,
    val lis_id : String?,
    val missed_votes_pct : Float?,
    val votes_with_party_pct : Float?
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
            parcel.readValue(Float::class.java.classLoader) as? Float,
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Float::class.java.classLoader) as? Float,
            parcel.readValue(Float::class.java.classLoader) as? Float) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(title)
        parcel.writeString(short_title)
        parcel.writeString(api_uri)
        parcel.writeString(first_name)
        parcel.writeString(middle_name)
        parcel.writeString(last_name)
        parcel.writeString(suffix)
        parcel.writeString(date_of_birth)
        parcel.writeString(gender)
        parcel.writeString(party)
        parcel.writeString(leadership_role)
        parcel.writeString(twitter_account)
        parcel.writeString(facebook_account)
        parcel.writeString(youtube_account)
        parcel.writeString(govtrack_id)
        parcel.writeString(cspan_id)
        parcel.writeString(votesmart_id)
        parcel.writeString(icpsr_id)
        parcel.writeString(crp_id)
        parcel.writeString(google_entity_id)
        parcel.writeString(fec_candidate_id)
        parcel.writeString(url)
        parcel.writeString(rss_url)
        parcel.writeString(contact_form)
        parcel.writeValue(in_office)
        parcel.writeValue(dw_nominate)
        parcel.writeString(ideal_point)
        parcel.writeString(seniority)
        parcel.writeString(next_election)
        parcel.writeValue(total_votes)
        parcel.writeValue(missed_votes)
        parcel.writeValue(total_present)
        parcel.writeString(last_updated)
        parcel.writeString(ocd_id)
        parcel.writeString(office)
        parcel.writeString(phone)
        parcel.writeString(fax)
        parcel.writeString(state)
        parcel.writeString(senate_class)
        parcel.writeString(state_rank)
        parcel.writeString(lis_id)
        parcel.writeValue(missed_votes_pct)
        parcel.writeValue(votes_with_party_pct)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CongressMember> {
        override fun createFromParcel(parcel: Parcel): CongressMember {
            return CongressMember(parcel)
        }

        override fun newArray(size: Int): Array<CongressMember?> {
            return arrayOfNulls(size)
        }
    }
}