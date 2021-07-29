package com.example.extracker.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()

    fun getEmptyStateText(): String {
        return if (_index.value==1){
            "Currently you have nothing due to expire soon.";
        } else{
            "Cheers! nothing has expired yet."
        }
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}