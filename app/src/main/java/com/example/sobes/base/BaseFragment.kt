package com.example.sobes.base

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.sobes.MyApplication
import com.example.sobes.di.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

open class BaseFragment : Fragment() {
    @Inject
    lateinit var factory: ViewModelFactory

    override fun onAttach(context: Context) {

        super.onAttach(context)
        (activity?.application as MyApplication).dagger.inject(this)
    }
}