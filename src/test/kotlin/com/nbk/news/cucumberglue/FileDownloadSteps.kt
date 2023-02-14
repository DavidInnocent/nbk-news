package com.nbk.news.cucumberglue

import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate


class FileDownloadSteps {

    private lateinit var response: ByteArray

    @LocalServerPort
    lateinit var port: String

    private val restTemplate: RestTemplate = RestTemplate()


    @When("I send a GET request to file download url {string}")
    fun i_send_a_get_request_to(string: String) {
        response = restTemplate.exchange(
            "http://localhost:$port$string",
            HttpMethod.GET,
            null,
            ByteArray::class.java
        ).body as ByteArray
    }

    @Then("I should receive a binary file that is not null")
    fun i_should_receive_a_response_not_null_array() {
        Assert.assertNotNull(response)
    }

}
