package com.nbk.news.controller

import com.nbk.news.entity.BaseResponse
import com.nbk.news.service.NewsService
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/top-headlines")
class NewsController {
    private val logger = LogManager.getLogger(NewsController::class.java)

    @Autowired
    lateinit var newsService: NewsService

    @GetMapping
    fun getTopHeadlines(@RequestParam("country") country: String): BaseResponse {
        logger.warn("Inside /api/top-headlines")
        return newsService.getArticlesOnCountry(country)
    }


    @GetMapping("/sources")
    fun getSources(): BaseResponse {
        logger.info("Inside /api/top-headlines/sources")
        return newsService.getSources()
    }

}