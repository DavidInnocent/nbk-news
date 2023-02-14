package com.nbk.news.repository

import org.springframework.stereotype.Repository

@Repository
interface FileDownloaderRepository {
    fun getFile(url: String): ByteArray
}