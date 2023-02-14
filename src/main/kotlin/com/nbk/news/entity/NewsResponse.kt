package com.nbk.news.entity

data class NewsResponse(
    override val status: String,
    override val totalResults: Int,
    val articles: List<Article>,
) : BaseResponse(status, totalResults)

