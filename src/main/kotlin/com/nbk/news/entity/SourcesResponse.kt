package com.nbk.news.entity

data class SourcesResponse(
    override val status: String,
    override val totalResults: Int,
    val sources: List<Source>
) : BaseResponse(status, totalResults)

