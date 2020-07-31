package com.mukesh.myapplication.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mukesh.myapplication.model.ScansModel

class ScansViewModel(application: Application) : AndroidViewModel(application) {

    fun downloadData(): LiveData<ScansModel> {
        val liveData = MutableLiveData<ScansModel>()



        return liveData
    }
}