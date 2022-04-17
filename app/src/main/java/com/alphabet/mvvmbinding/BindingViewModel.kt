package com.alphabet.mvvmbinding

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class BindingViewModel {

    var count = 0
    val bindText by lazy { MutableLiveData<String>("Binding test") }

    fun onClick(v: View) {
        when(v.id) {
            R.id.btn_click -> {
                count ++
                bindText.value = "Binding test $count"
            }
        }
    }
}