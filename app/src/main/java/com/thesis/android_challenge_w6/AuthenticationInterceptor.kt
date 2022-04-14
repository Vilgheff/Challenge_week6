package com.thesis.android_challenge_w6

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthenticationInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val url: HttpUrl = chain.request().url()
            .newBuilder()
            .addQueryParameter("api_key", "71a728a9e9c0524d15a0359ee95cff4b")
            .build()
        val request: Request = chain.request().newBuilder().url(url).build()
        return chain.proceed(request)
    }
}