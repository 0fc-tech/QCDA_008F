package com.example.bebeareatcorrection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.bebeareatcorrection.databinding.FragmentCommandeBinding

class CommandeFragment : Fragment() {
    val args by navArgs<CommandeFragmentArgs>()
    private var _binding: FragmentCommandeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommandeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.floatingActionButton?.setOnClickListener {
            val commande = _binding?.editTextTextMultiLine?.text.toString()
            val destination = CommandeFragmentDirections.actionCommandeFragmentToConfirmationFragment(
                args.pseudo,
                commande
            )
            findNavController().navigate(destination)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}