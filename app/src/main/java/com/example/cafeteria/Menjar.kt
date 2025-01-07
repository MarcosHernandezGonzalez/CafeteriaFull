package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cafeteria.databinding.FragmentMenjarBinding

class Menjar : Fragment() {
    val viewModel: MenjarViewModel by viewModels<MenjarViewModel>()
    val sharedViewModel: SharedViewModel by activityViewModels<SharedViewModel>()

    private lateinit var binding: FragmentMenjarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenjarBinding.inflate(inflater)
        val menjarAdapter = MenjarAdapter(viewModel.getPlatos()) { clickedItem ->
            sharedViewModel.add(clickedItem)
        }

        binding.menjarRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.menjarRecyclerView.adapter = menjarAdapter
        return binding.root
    }
}