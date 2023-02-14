package com.nbk.news.controller

import com.nbk.news.service.FileDownloaderService
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/file-download")
class FileDownloaderController {
    private val logger = LogManager.getLogger(NewsController::class.java)

    @Autowired
    lateinit var fileDownloaderService: FileDownloaderService

    @GetMapping
    fun getFile(@RequestParam("url") url: String): ByteArray {
        logger.info("Inside /api/file-download/getFile()")
        return fileDownloaderService.getFile(url)
    }

}