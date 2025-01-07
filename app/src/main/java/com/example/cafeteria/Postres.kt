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
import com.example.cafeteria.databinding.FragmentPostresBinding

class Postres : Fragment() {
    val viewModel: PostresViewModel by viewModels<PostresViewModel>()
    val sharedViewModel: SharedViewModel by activityViewModels<SharedViewModel>()

    private lateinit var binding: FragmentPostresBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostresBinding.inflate(inflater)
        val menjarAdapter = MenjarAdapter(viewModel.getPostres()) { clickedItem ->
            sharedViewModel.add(clickedItem)
        }

        binding.postresRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.postresRecyclerView.adapter = menjarAdapter
        return binding.root
    }
}