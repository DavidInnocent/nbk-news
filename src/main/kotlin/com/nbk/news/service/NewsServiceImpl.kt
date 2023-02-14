package com.nbk.news.service

import com.nbk.news.entity.BaseResponse
import com.nbk.news.repository.NewsRepository
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service

@Service
class NewsServiceImpl(private val newsRepository: NewsRepository) : NewsService {
    private val logger = LogManager.getLogger(NewsServiceImpl::class.java)
    override fun getArticlesOnCountry(country: String): BaseResponse {
        logger.info("Inside getArticlesOnCountry")
        return newsRepository.getArticlesOnCountry(country)
    }

    override fun getSources(): BaseResponse {
        logger.info("Inside getSources")
        return newsRepository.getSources()
    }
}