package com.example.bebereats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.bebereats.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {
    val args by navArgs<ConfirmationFragmentArgs>()
    private var _binding: FragmentConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConfirmationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.textViewConfirmationCommande?.text = "${args.pseudo}, vous avez commandé ${args.commande}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}