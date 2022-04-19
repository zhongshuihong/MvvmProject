package com.alphabet.mvvmbinding

import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.BindingRecyclerViewBinding
import com.alphabet.mvvmbinding.databinding.FragmentBindingBinding

class BindingRecyclerViewFragment : BaseFragment<BindingRecyclerViewBinding>() {

    override fun getContentLayout(): Int = R.layout.binding_recycler_view

    override fun initViewModel(binding: BindingRecyclerViewBinding) {
        binding.viewModel = RecyclerViewModel()
    }

}