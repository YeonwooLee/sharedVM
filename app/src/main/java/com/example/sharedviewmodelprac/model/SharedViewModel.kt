package com.example.sharedviewmodelprac.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SharedViewModel: ViewModel() {
    private val _backSet = MutableLiveData<Int>(0)
    val backSet: LiveData<Int> = _backSet

    private val _chestSet = MutableLiveData<Int>(0)
    val chestSet: LiveData<Int> = _chestSet

    private val _legSet = MutableLiveData<Int>(0)
    val legSet : LiveData<Int> =_legSet


    fun setBackSet(set:Int){
        _backSet.value = set
    }

    fun setChestSet(set:Int){
        _chestSet.value = set
    }

    fun setLeg(set:Int){
        _legSet.value = set
    }

    val backSetList:List<Int> = mutableListOf<Int>(1,3,5)
    val chestSetList:List<Int> = mutableListOf<Int>(2,4,6)
}