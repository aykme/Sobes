package com.example.sobes.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sobes.base.BaseFragment
import com.example.sobes.base.extensions.getViewModel
import com.example.sobes.databinding.FragmentStartBinding

class StartFragment : BaseFragment() {

    //val viewModel = getViewModel<StartViewModel>(factory)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }
}