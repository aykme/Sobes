package com.example.sobes.di

import androidx.lifecycle.ViewModel
import com.example.sobes.ui.start.StartFragment
import com.example.sobes.ui.start.StartViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ApplicationModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeStartInjector(): StartFragment

    @Binds
    @IntoMap
    @ViewModelKey(StartViewModel::class)
    abstract fun bindAStartViewModel(startViewModel: StartViewModel): ViewModel
}