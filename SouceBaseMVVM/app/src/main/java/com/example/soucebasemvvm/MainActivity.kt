package com.example.soucebasemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager
import com.example.soucebasemvvm.bases.BaseActivity
import com.example.soucebasemvvm.databinding.ActivityMainBinding
import com.example.soucebasemvvm.ui.home.HomeFragment

private const val TAG = "MainActivity"
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun initData() {

    }

    override fun handleEvent() {

    }

    override fun bindData() {
        supportFragmentManager.beginTransaction()
            .replace(binding.frameContainer.id,HomeFragment())
            .commit()
    }

}