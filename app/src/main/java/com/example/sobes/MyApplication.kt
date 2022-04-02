package com.example.sobes

import android.app.Application
import com.example.sobes.di.AppComponent
import com.example.sobes.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application()/*, HasAndroidInjector*/ {
    /*@Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Any>*/
    val dagger: AppComponent = DaggerAppComponent.create()

    /*override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.factory().create(applicationContext)
            .inject(this)
    }*/

    //override fun androidInjector(): AndroidInjector<Any> = fragmentInjector
}