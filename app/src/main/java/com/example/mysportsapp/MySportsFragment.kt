package com.example.mysportsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mysportsapp.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private var _binding: FragmentMySportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMySportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFootball.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_footballFragment)
        }

        binding.btnBasketball.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_basketballFragment)
        }

        binding.btnTennis.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_tennisFragment)
        }

        binding.btnBaseball.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_baseballFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}