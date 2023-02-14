package com.nbk.news.service

import com.nbk.news.entity.BaseResponse
import com.nbk.news.repository.NewsRepository
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class NewsServiceImplTest {

    @Mock
    private lateinit var newsRepository: NewsRepository

    private val country = "testCountry"

    private lateinit var newsService: NewsService

    @Test
    fun `getArticlesOnCountry should call repository and return BaseResponse`() {
        // Arrange
        val expectedResponse = BaseResponse(totalResults = 1, status = "ok")
        `when`(newsRepository.getArticlesOnCountry(country)).thenReturn(expectedResponse)

        newsService = NewsServiceImpl(newsRepository)

        // Act
        val result = newsService.getArticlesOnCountry(country)

        // Assert
        assertEquals(expectedResponse, result)
        verify(newsRepository, times(1)).getArticlesOnCountry(country)
    }

    @Test
    fun `getSources should call repository and return BaseResponse`() {
        // Arrange
        val expectedResponse = BaseResponse(totalResults = 2, status = "ok")
        `when`(newsRepository.getSources()).thenReturn(expectedResponse)

        newsService = NewsServiceImpl(newsRepository)

        // Act
        val result = newsService.getSources()

        // Assert
        assertEquals(expectedResponse, result)
        verify(newsRepository, times(1)).getSources()
    }
}