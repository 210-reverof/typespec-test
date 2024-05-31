package org.openapitools.api

import org.openapitools.model.AuthToken
import org.openapitools.model.LoginPostRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class LoginApiTest {

    private val api: LoginApiController = LoginApiController()

    /**
     * To test LoginApiController.loginPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun loginPostTest() {
        val loginPostRequest: LoginPostRequest = TODO()
        val response: ResponseEntity<AuthToken> = api.loginPost(loginPostRequest)

        // TODO: test validations
    }
}
