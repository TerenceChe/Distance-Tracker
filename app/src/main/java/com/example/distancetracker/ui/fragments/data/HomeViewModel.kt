package com.example.distancetracker.ui.fragments.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {


    private var clubArray = arrayOf("3 wood", "5 iron", "Driver")

    private var mutableClubArray = MutableLiveData<Array<String>>().apply{
        value = clubArray
    }
    val liveClubArray: LiveData<Array<String>> = mutableClubArray

    fun addClub(clubName: String) {
        clubArray = clubArray.plus(clubName)
        mutableClubArray.value = clubArray
    }

}