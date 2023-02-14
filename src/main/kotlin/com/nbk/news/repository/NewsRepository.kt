package com.nbk.news.repository

import com.nbk.news.entity.BaseResponse
import org.springframework.stereotype.Repository

@Repository
interface NewsRepository {
    fun getArticlesOnCountry(country: String): BaseResponse
    fun getSources(): BaseResponse
}