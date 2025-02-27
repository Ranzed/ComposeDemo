package ru.ranzed.composedemo.di

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.ranzed.composedemo.data.datasource.RemoteEventsDataSource
import ru.ranzed.composedemo.data.repository.EventsRepository
import ru.ranzed.composedemo.data.repository.IEventsRepository

object AwesomeSingletoneDI {

    val component: AppDiComponent = AppDiComponent()
}

class AppDiComponent {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://kudago.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient())
        .build()

    val repository: IEventsRepository =
        EventsRepository(
            RemoteEventsDataSource(
                retrofit
            )
        )
}