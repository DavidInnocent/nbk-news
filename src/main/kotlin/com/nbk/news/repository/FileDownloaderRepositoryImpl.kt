package com.nbk.news.repository

import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Repository
import java.io.BufferedInputStream
import java.net.URL

@Repository
class FileDownloaderRepositoryImpl : FileDownloaderRepository {
    private val logger = LogManager.getLogger(FileDownloaderRepositoryImpl::class.java)
    override fun getFile(url: String): ByteArray {
        logger.info("Inside getFile()")
        val fileUrl = URL(url)
        val connection = fileUrl.openConnection()
        connection.connect()
        val length = connection.contentLength
        val bis = BufferedInputStream(connection.getInputStream())
        val fileData = ByteArray(length)
        bis.read(fileData, 0, length)
        return fileData
    }

}