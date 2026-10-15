package edu.temple.dicethrow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class DieViewModel : ViewModel() {
    val currentRoll = MutableLiveData<Int>().apply {
        value = 0
    }

    fun setRoll(roll: Int) {
        currentRoll.value = roll
    }

    fun getRoll(): LiveData<Int> = currentRoll
}