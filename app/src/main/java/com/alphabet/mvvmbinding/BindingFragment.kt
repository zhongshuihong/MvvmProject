package com.alphabet.mvvmbinding

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.FragmentBindingBinding


/**
 * fragment to bind data
 */
class BindingFragment : BaseFragment<FragmentBindingBinding>() {

    override fun getContentLayout(): Int = R.layout.fragment_binding

    override fun initViewModel(binding: FragmentBindingBinding) {
        binding.viewModel = BindingViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onStart() {
        super.onStart()
        binding.viewModel?.bindSkip?.observe(this) {
            if (it) {
                findNavController().navigate(R.id.bindingRecyclerViewFragment)
            }
        }
    }
}