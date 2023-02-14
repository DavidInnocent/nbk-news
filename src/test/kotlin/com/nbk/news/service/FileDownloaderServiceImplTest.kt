package com.nbk.news.service

import com.nbk.news.repository.FileDownloaderRepository
import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FileDownloaderServiceImplTest {

    @Mock
    private lateinit var newsRepository: FileDownloaderRepository

    private lateinit var fileDownloaderService: FileDownloaderService

    private val url = "http://example.com/file.txt"

    @Before
    fun setup() {
        fileDownloaderService = FileDownloaderServiceImpl(newsRepository)
    }

    @Test
    fun `getFile should call repository and return file content`() {
        // Arrange
        val expectedContent = "Test file content".toByteArray(Charsets.UTF_8)
        `when`(newsRepository.getFile(url)).thenReturn(expectedContent)

        // Act
        val result = fileDownloaderService.getFile(url)

        // Assert
        assertArrayEquals(expectedContent, result)
    }
}