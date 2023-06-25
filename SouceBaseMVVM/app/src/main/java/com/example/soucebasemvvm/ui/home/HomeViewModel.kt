package com.example.soucebasemvvm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.soucebasemvvm.bases.BaseViewModel
import com.example.soucebasemvvm.bases.DataResult
import kotlinx.coroutines.delay

class HomeViewModel : BaseViewModel(

) {
    private val _name = MutableLiveData<String>()
    val name:LiveData<String> get() = _name
    private suspend fun getNameFromServer(): DataResult<String> {
        delay(3000)
        return DataResult.Success<String>("Hung")
    }

    fun getData() {
        executeTask(
            request = { getNameFromServer() },
            onSuccess = { nameFromServer ->
                _name.value = nameFromServer
            },
            onError = {

            },
        )
    }


}