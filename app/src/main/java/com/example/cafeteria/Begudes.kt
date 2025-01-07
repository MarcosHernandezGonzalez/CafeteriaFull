package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.databinding.FragmentBegudesBinding
import com.example.cafeteria.databinding.FragmentMenjarBinding

class Begudes : Fragment() {
    val viewModel: BegudesViewModel by viewModels<BegudesViewModel>()
    val sharedViewModel: SharedViewModel by activityViewModels<SharedViewModel>()

    private lateinit var binding: FragmentBegudesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBegudesBinding.inflate(inflater)
        val menjarAdapter = MenjarAdapter(viewModel.getBebidas()) { clickedItem ->
            sharedViewModel.add(clickedItem)
        }

        binding.begudesRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.begudesRecyclerView.adapter = menjarAdapter
        return binding.root
    }
}