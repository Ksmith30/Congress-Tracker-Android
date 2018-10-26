package com.example.kylesmith.congresstracker

import java.util.*

class PropublicaDataResponse(val meta: Meta)

class Meta(
        val status: String?,
        val copyright: String?,
        val results: Array<CongressData>
)

class CongressData (
        val congress: String?,
        val chamber: String?,
        val num_results: Int?,
        val offset: Int?,
        val members: Array<CongressMember>
)

class CongressMember(
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
)