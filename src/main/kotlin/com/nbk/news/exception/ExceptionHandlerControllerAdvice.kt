package com.nbk.news.exception

import org.apache.logging.log4j.LogManager
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ExceptionHandlerControllerAdvice {
    private val logger = LogManager.getLogger(ExceptionHandlerControllerAdvice::class.java)

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        logger.error(ex)
        val errorResponse = ExceptionResponse(errorMessage = ex.message ?: "An error occurred")
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse)
    }
}