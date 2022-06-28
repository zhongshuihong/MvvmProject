package com.alphabet.mvvmbinding.ui

import com.alphabet.mvvmbinding.R
import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.BindingRecyclerViewBinding

class BindingRecyclerViewFragment : BaseFragment<BindingRecyclerViewBinding>() {

    override fun getContentLayout(): Int = R.layout.binding_recycler_view

    override fun initViewModel(binding: BindingRecyclerViewBinding) {
        binding.viewModel = RecyclerViewModel()
    }

}