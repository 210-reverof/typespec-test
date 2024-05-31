# DefaultApi

All URIs are relative to *https://post-example.com/api*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**loginPost**](DefaultApi.md#loginPost) | **POST** /login |  |
| [**postsList**](DefaultApi.md#postsList) | **GET** /posts |  |
| [**postsPost**](DefaultApi.md#postsPost) | **POST** /posts |  |
| [**registerPost**](DefaultApi.md#registerPost) | **POST** /register |  |


<a id="loginPost"></a>
# **loginPost**
> AuthToken loginPost(loginPostRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val loginPostRequest : LoginPostRequest =  // LoginPostRequest | 
try {
    val result : AuthToken = apiInstance.loginPost(loginPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#loginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#loginPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loginPostRequest** | [**LoginPostRequest**](LoginPostRequest.md)|  | |

### Return type

[**AuthToken**](AuthToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="postsList"></a>
# **postsList**
> kotlin.collections.List&lt;Post&gt; postsList(postsListRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val postsListRequest : PostsListRequest =  // PostsListRequest | 
try {
    val result : kotlin.collections.List<Post> = apiInstance.postsList(postsListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#postsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#postsList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postsListRequest** | [**PostsListRequest**](PostsListRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="postsPost"></a>
# **postsPost**
> Post postsPost(postsPostRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val postsPostRequest : PostsPostRequest =  // PostsPostRequest | 
try {
    val result : Post = apiInstance.postsPost(postsPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#postsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#postsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postsPostRequest** | [**PostsPostRequest**](PostsPostRequest.md)|  | |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="registerPost"></a>
# **registerPost**
> User registerPost(registerPostRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val registerPostRequest : RegisterPostRequest =  // RegisterPostRequest | 
try {
    val result : User = apiInstance.registerPost(registerPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#registerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#registerPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **registerPostRequest** | [**RegisterPostRequest**](RegisterPostRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

