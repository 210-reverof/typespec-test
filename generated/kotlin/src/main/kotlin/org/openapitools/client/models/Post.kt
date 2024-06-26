/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param title 
 * @param content 
 * @param author 
 * @param createdAt 
 * @param updatedAt 
 */


data class Post (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "content")
    val content: kotlin.String,

    @Json(name = "author")
    val author: User,

    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime

) {


}

