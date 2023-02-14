package com.nbk.news.entity

data class Article(
        val source: BaseSourceType?,
        val author: String?,
        val title: String?,
        val description: String?,
        val url: String?,
        val urlToImage: String?,
        val publishedAt: String?
)