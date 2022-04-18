package com.alphabet.mvvmbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.alphabet.mvvmbinding.databinding.FragmentBindingBinding


/**
 * fragment to bind data
 */
class BindingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentBindingBinding>(
            inflater,
            R.layout.fragment_binding,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.viewModel = BindingViewModel()
        return binding.root
    }

}