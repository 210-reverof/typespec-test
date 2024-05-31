package org.openapitools.api

import org.openapitools.model.Post
import org.openapitools.model.PostsListRequest
import org.openapitools.model.PostsPostRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class PostsApiTest {

    private val api: PostsApiController = PostsApiController()

    /**
     * To test PostsApiController.postsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postsListTest() {
        val postsListRequest: PostsListRequest = TODO()
        val response: ResponseEntity<List<Post>> = api.postsList(postsListRequest)

        // TODO: test validations
    }

    /**
     * To test PostsApiController.postsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postsPostTest() {
        val postsPostRequest: PostsPostRequest = TODO()
        val response: ResponseEntity<Post> = api.postsPost(postsPostRequest)

        // TODO: test validations
    }
}
