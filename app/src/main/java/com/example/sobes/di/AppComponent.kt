package com.example.sobes.di

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.sobes.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(modules = [ApplicationModule::class, /*AndroidInjectionModule::class,*/ ViewModelBuilder::class])
interface AppComponent {
    fun inject(fragment: Fragment)

    /*@Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }*/
}