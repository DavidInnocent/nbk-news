package com.nbk.news.cucumberglue

import com.nbk.news.entity.BaseResponse
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate


class SourcesFetchingSteps {

    private lateinit var response: BaseResponse

    @LocalServerPort
    lateinit var port: String

    private val restTemplate: RestTemplate = RestTemplate()


    @When("I send a GET request to sources {string}")
    fun i_send_a_get_request_to(string: String) {
        response = restTemplate.exchange(
            "http://localhost:$port$string",
            HttpMethod.GET,
            null,
            BaseResponse::class.java
        ).body as BaseResponse
    }

    @Then("I should receive a sources with totalResults not equal to zero")
    fun i_should_receive_a_response_total_results() {
        Assert.assertNotNull(response)
    }

}
