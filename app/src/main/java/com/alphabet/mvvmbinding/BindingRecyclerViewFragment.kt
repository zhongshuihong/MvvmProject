package com.alphabet.mvvmbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.alphabet.mvvmbinding.databinding.BindingRecyclerViewBinding

class BindingRecyclerViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<BindingRecyclerViewBinding>(
            inflater,
            R.layout.binding_recycler_view,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.viewModel = RecyclerViewModel()
        return binding.root
    }
}