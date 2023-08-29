package com.example.distancetracker.ui.fragments.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _clubNameArray = MutableLiveData<Array<String>>().apply{
        value = arrayOf("3 wood", "5 iron", "Driver")
    }
    val clubNameArray: LiveData<Array<String>> = _clubNameArray
}