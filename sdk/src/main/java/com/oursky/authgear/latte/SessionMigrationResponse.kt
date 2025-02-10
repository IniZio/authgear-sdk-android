package com.oursky.authgear.latte

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SessionMigrationResponse(
    @SerialName("token_type")
    val tokenType: String? = null,
    @SerialName("access_token")
    val accessToken: String? = null,
    @SerialName("expires_in")
    val expiresIn: Long? = null,
    @SerialName("refresh_token")
    val refreshToken: String? = null,
)

