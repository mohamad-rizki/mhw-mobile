package com.dafian.android.mhwmobile.data.api

import android.content.Context
import com.dafian.android.mhwmobile.BuildConfig
import com.dafian.android.mhwmobile.config.Constant
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RestServicesFactory {

    private val cacheSize = 10 * 1024 * 1024 // 10 MB

    fun create(context: Context): RestServices {
        val client = makeClientService(makeLoggingInterceptor(), makeCache(context))
        return makeRestServices(client, makeGson())
    }

    private fun makeRestServices(okHttp: OkHttpClient, gson: Gson): RestServices {

        val retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .client(okHttp)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        return retrofit.create(RestServices::class.java)
    }

    private fun makeClientService(loggingInterceptor: HttpLoggingInterceptor, cache: Cache): OkHttpClient {
        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(loggingInterceptor)
            .build()
    }

    private fun makeLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
            .setLevel(
                if (BuildConfig.DEBUG)
                    HttpLoggingInterceptor.Level.BODY
                else
                    HttpLoggingInterceptor.Level.NONE
            )
    }

    private fun makeGson(): Gson {
        return GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create()
    }

    private fun makeCache(context: Context): Cache {
        return Cache(context.cacheDir, cacheSize.toLong())
    }
}
