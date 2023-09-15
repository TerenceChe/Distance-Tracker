package com.example.distancetracker.ui.fragments.data

import androidx.lifecycle.ViewModel
import java.util.Calendar
import java.util.Date

class ClubDistanceViewModel : ViewModel() {
    val cal: Calendar = Calendar.getInstance()
    private val myPair1 = cal.set(Calendar.DAY_OF_MONTH, 10) to 130
    private val myPair2 = cal.set(Calendar.DAY_OF_MONTH, 15) to 140
    private val myPair3 = cal.set(Calendar.DAY_OF_MONTH, 20) to 135
    val nineIronMap = mapOf(myPair1, myPair2, myPair3)
}