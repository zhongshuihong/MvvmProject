package com.alphabet.mvvmbinding.constraintlayout

import com.alphabet.mvvmbinding.R
import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.FragmentConstraintBinding

/**
 *@author: Administrator
 *@date: 2022/4/21
 *@description:
 */
class ConstraintFragment: BaseFragment<FragmentConstraintBinding>() {
    override fun getContentLayout(): Int {
        return R.layout.fragment_constraint
    }

    override fun initViewModel(binding: FragmentConstraintBinding) {
    }
}