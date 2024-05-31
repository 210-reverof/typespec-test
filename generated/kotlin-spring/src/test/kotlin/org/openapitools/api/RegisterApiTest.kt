package org.openapitools.api

import org.openapitools.model.RegisterPostRequest
import org.openapitools.model.User
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class RegisterApiTest {

    private val api: RegisterApiController = RegisterApiController()

    /**
     * To test RegisterApiController.registerPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun registerPostTest() {
        val registerPostRequest: RegisterPostRequest = TODO()
        val response: ResponseEntity<User> = api.registerPost(registerPostRequest)

        // TODO: test validations
    }
}
