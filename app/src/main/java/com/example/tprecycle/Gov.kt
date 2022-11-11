package com.example.tprecycle

var GovList = mutableListOf<Gov>()

val GOV_ID_EXTRA = "GOVExtra"

class Gov (
    var cover: Int,
    var title: String,
    val id: Int? = GovList.size
        )