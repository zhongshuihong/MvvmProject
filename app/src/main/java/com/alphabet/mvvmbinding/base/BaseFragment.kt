package com.alphabet.mvvmbinding.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 *
 */
abstract class BaseFragment<T: ViewDataBinding>: Fragment() {

    lateinit var binding: T

    open var attachToParent: Boolean = false

    abstract fun getContentLayout(): Int

    abstract fun initViewModel(binding: T)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getContentLayout(), container, attachToParent)
        binding.lifecycleOwner = this
        initViewModel(binding)
        return binding.root
    }
}