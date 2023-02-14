package com.nbk.news.repository

import com.nbk.news.entity.BaseResponse
import com.nbk.news.entity.NewsResponse
import com.nbk.news.entity.SourcesResponse
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate

@Repository
class NewsRepositoryImpl : NewsRepository {
    private val logger = LogManager.getLogger(NewsRepositoryImpl::class.java)

    @Autowired
    lateinit var restTemplate: RestTemplate

    @Value("\${apiKey}")
    private lateinit var apiKey: String

    @Value("\${apiEndpoint}")
    private lateinit var apiEndpoint: String

    override fun getArticlesOnCountry(country: String): BaseResponse {
        logger.info("Inside getArticlesOnCountry()")
        val response = restTemplate.getForEntity(
            "$apiEndpoint?country=$country&apiKey=$apiKey", NewsResponse::class.java
        ).body
        return response ?: BaseResponse(totalResults = 0, status = "")
    }

    override fun getSources(): BaseResponse {
        logger.info("Inside getSources()")
        val response = restTemplate.getForEntity(
            "$apiEndpoint/sources?&apiKey=$apiKey",
            SourcesResponse::class.java
        ).body
        return response ?: BaseResponse(totalResults = 0, status = "")
    }

}