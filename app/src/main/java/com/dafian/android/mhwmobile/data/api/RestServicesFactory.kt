package com.dafian.android.mhwmobile.data.api

import com.dafian.android.mhwmobile.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RestServicesFactory {

    fun create(): RestServices {
        val client = makeClientService(makeLoggingInterceptor())
        return makeRestServices(client, makeGson())
    }

    private fun makeRestServices(okHttp: OkHttpClient, gson: Gson): RestServices {

        val retrofit = Retrofit.Builder()
            .baseUrl("")
            .client(okHttp)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        return retrofit.create(RestServices::class.java)
    }

    private fun makeClientService(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
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
}
