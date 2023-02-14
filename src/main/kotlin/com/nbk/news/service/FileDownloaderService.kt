package com.nbk.news.service

interface FileDownloaderService {
    fun getFile(url: String): ByteArray
}