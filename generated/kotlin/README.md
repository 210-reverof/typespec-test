# org.openapitools.client - Kotlin client library for Post Service

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 0.0.0
- Package version: 
- Generator version: 7.7.0-SNAPSHOT
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://post-example.com/api*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *DefaultApi* | [**loginPost**](docs/DefaultApi.md#loginpost) | **POST** /login |  |
| *DefaultApi* | [**postsList**](docs/DefaultApi.md#postslist) | **GET** /posts |  |
| *DefaultApi* | [**postsPost**](docs/DefaultApi.md#postspost) | **POST** /posts |  |
| *DefaultApi* | [**registerPost**](docs/DefaultApi.md#registerpost) | **POST** /register |  |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AuthToken](docs/AuthToken.md)
 - [org.openapitools.client.models.LoginCredentials](docs/LoginCredentials.md)
 - [org.openapitools.client.models.LoginPostRequest](docs/LoginPostRequest.md)
 - [org.openapitools.client.models.NewPost](docs/NewPost.md)
 - [org.openapitools.client.models.NewUser](docs/NewUser.md)
 - [org.openapitools.client.models.Post](docs/Post.md)
 - [org.openapitools.client.models.PostsListRequest](docs/PostsListRequest.md)
 - [org.openapitools.client.models.PostsPostRequest](docs/PostsPostRequest.md)
 - [org.openapitools.client.models.RegisterPostRequest](docs/RegisterPostRequest.md)
 - [org.openapitools.client.models.Sample](docs/Sample.md)
 - [org.openapitools.client.models.User](docs/User.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.
