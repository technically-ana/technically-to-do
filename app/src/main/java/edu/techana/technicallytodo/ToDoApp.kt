package edu.techana.technicallytodo

import android.app.Application
import org.koin.dsl.module
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidLogger

class ToDoApp : Application() {

    private val koinModule = module {
        single { ToDoRepository() }
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            modules(koinModule)
        }
    }
}