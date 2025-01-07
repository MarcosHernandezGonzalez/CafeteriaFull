package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.databinding.FragmentBegudesBinding
import com.example.cafeteria.databinding.FragmentPagamentBinding

class Pagament : Fragment() {
    val sharedViewModel: SharedViewModel by activityViewModels<SharedViewModel>()
    private lateinit var binding: FragmentPagamentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagamentBinding.inflate(inflater)
        val menjarAdapter = sharedViewModel.getPedido()?.let {
            MenjarAdapter(it) { clickedItem ->
            }
        }

        binding.button.setOnClickListener {
            val pagament = sharedViewModel.pagar()
            if (pagament){
                Toast.makeText(requireContext(), "Pago exitoso", Toast.LENGTH_SHORT).show()
            }
        }

        binding.pagamentRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.pagamentRecyclerView.adapter = menjarAdapter
        return binding.root
    }
}