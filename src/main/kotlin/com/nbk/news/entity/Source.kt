package com.nbk.news.entity


data class Source(
    val description: String?,
    val url: String?,
    val category: String?,
    val language: String?,
    val country: String?,
    override val id: String?,
    override val name: String?,
) : BaseSourceType(id, name)
