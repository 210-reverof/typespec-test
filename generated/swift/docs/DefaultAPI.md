# DefaultAPI

All URIs are relative to *https://post-example.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](DefaultAPI.md#loginpost) | **POST** /login | 
[**postsList**](DefaultAPI.md#postslist) | **GET** /posts | 
[**postsPost**](DefaultAPI.md#postspost) | **POST** /posts | 
[**registerPost**](DefaultAPI.md#registerpost) | **POST** /register | 


# **loginPost**
```swift
    open class func loginPost(loginPostRequest: LoginPostRequest, completion: @escaping (_ data: AuthToken?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let loginPostRequest = Login_post_request(credentials: LoginCredentials(username: "username_example", password: "password_example")) // LoginPostRequest | 

DefaultAPI.loginPost(loginPostRequest: loginPostRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginPostRequest** | [**LoginPostRequest**](LoginPostRequest.md) |  | 

### Return type

[**AuthToken**](AuthToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postsList**
```swift
    open class func postsList(postsListRequest: PostsListRequest, completion: @escaping (_ data: [Post]?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let postsListRequest = Posts_list_request(authorization: "authorization_example") // PostsListRequest | 

DefaultAPI.postsList(postsListRequest: postsListRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postsListRequest** | [**PostsListRequest**](PostsListRequest.md) |  | 

### Return type

[**[Post]**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postsPost**
```swift
    open class func postsPost(postsPostRequest: PostsPostRequest, completion: @escaping (_ data: Post?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let postsPostRequest = Posts_post_request(post: NewPost(title: "title_example", content: "content_example"), authorization: "authorization_example") // PostsPostRequest | 

DefaultAPI.postsPost(postsPostRequest: postsPostRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postsPostRequest** | [**PostsPostRequest**](PostsPostRequest.md) |  | 

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **registerPost**
```swift
    open class func registerPost(registerPostRequest: RegisterPostRequest, completion: @escaping (_ data: User?, _ error: Error?) -> Void)
```



### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let registerPostRequest = Register_post_request(user: NewUser(username: "username_example", email: "email_example", password: "password_example")) // RegisterPostRequest | 

DefaultAPI.registerPost(registerPostRequest: registerPostRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerPostRequest** | [**RegisterPostRequest**](RegisterPostRequest.md) |  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

