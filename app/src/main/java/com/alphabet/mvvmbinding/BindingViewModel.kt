package com.alphabet.mvvmbinding

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

class BindingViewModel {

    var count = 0
    val bindText by lazy { MutableLiveData<String>("Binding test") }

    val bindSkip by lazy { MutableLiveData<Boolean>() }

    val bindMotion by lazy { MutableLiveData<Boolean>() }

    fun onClick(v: View) {
        when(v.id) {
            R.id.btn_click -> {
                count ++
                bindText.value = "Binding test $count"
            }
            R.id.btn_skip -> {
                //
                bindSkip.value = true
//                findNavController()
            }
            R.id.btn_motion -> {
                bindMotion.value = true
            }
        }
    }
}