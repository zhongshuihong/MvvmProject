package com.alphabet.mvvmbinding

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.alphabet.mvvmbinding.base.BaseFragment
import com.alphabet.mvvmbinding.databinding.FragmentBindingBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * fragment to bind data
 */
@AndroidEntryPoint
class BindingFragment : BaseFragment<FragmentBindingBinding>() {

//    private val mBinding: FragmentBindingBinding by binding()
    private val mViewModel: BindingViewModel by viewModels()

    override fun getContentLayout(): Int = R.layout.fragment_binding

    override fun initViewModel(binding: FragmentBindingBinding) {
        binding.viewModel = mViewModel
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
        binding.viewModel?.bindMotion?.observe(this) {
            findNavController().navigate(R.id.motionFragment)
        }
    }
}