package com.example.counterapplearningmvvm.ui.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


// by rotating the phone we will not get our data loss it will be their
// so this is the use of MVVM 
class CounterModelView : ViewModel() {


    private val _count= mutableStateOf(0)

    // private _count is now store in count so that it become immutable and used in other place
    val count : MutableState<Int> =_count

    fun increment()
    {
        _count.value++
    }
    fun decrement()
    {
        _count.value--
    }






}