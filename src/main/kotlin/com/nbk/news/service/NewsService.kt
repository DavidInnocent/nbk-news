package com.nbk.news.service

import com.nbk.news.entity.BaseResponse


interface NewsService {
    fun getArticlesOnCountry(country: String): BaseResponse
    fun getSources(): BaseResponse
}