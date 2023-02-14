package com.nbk.news.service

import com.nbk.news.repository.FileDownloaderRepository
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service

@Service
class FileDownloaderServiceImpl(private val newsRepository: FileDownloaderRepository) : FileDownloaderService {
    private val logger = LogManager.getLogger(FileDownloaderServiceImpl::class.java)
    override fun getFile(url: String): ByteArray {
        logger.info("Inside getFile()")
        return newsRepository.getFile(url)
    }
}