package com.example.soucebasemvvm.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.soucebasemvvm.R
import com.example.soucebasemvvm.bases.BaseFragment
import com.example.soucebasemvvm.bases.BaseViewModel
import com.example.soucebasemvvm.databinding.FragmentHomeBinding

private const val TAG = "HomeFragment"
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override val viewModel: HomeViewModel
        get() = ViewModelProvider(this)[HomeViewModel::class.java]


    override fun initData() {
       viewModel.getData()
    }

    override fun handleEvent() {

    }

    override fun bindData() {
      viewModel.name.observe(this){_nameFromServer ->
          Log.e(TAG, "bindData: ${_nameFromServer}", )
      }
    }

}