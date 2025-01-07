package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.cafeteria.databinding.FragmentBegudesBinding
import com.example.cafeteria.databinding.FragmentTotalBinding

class Total : Fragment() {
    val sharedViewModel: SharedViewModel by activityViewModels<SharedViewModel>()

    private lateinit var binding: FragmentTotalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTotalBinding.inflate(inflater)
        binding.total.text = sharedViewModel.total.value.toString()
        sharedViewModel.total.observe(viewLifecycleOwner, Observer {
            binding.total.text = it.toString()
        })
        return binding.root
    }
}