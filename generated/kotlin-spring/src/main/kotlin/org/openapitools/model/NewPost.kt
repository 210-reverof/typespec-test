package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param title 
 * @param content 
 */
data class NewPost(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("content", required = true) val content: kotlin.String
) {

}

