package com.alphabet.mvvmbinding.constraintlayout

import com.alphabet.mvvmbinding.R
import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.FragmentMotionBinding

/**
 *@author: shuihongzhong
 *@date: 2022/4/22
 *@description:
 */
class MotionFragment: BaseFragment<FragmentMotionBinding>() {
    override fun getContentLayout(): Int {
        return R.layout.fragment_motion
    }

    override fun initViewModel(binding: FragmentMotionBinding) {
    }
}