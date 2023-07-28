package com.example.bebereats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.bebereats.databinding.FragmentCommandeBinding

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
        _binding?.buttonJeCommande?.setOnClickListener {
            CommandeFragmentDirections.actionCommandeFragmentToConfirmationFragment(
                args.pseudo,
                _binding?.editTextCommande?.text.toString()
            ).also {
                findNavController().navigate(it)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}