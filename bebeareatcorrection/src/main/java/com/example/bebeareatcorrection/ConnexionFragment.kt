package com.example.bebeareatcorrection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bebeareatcorrection.databinding.FragmentConnexionBinding

class ConnexionFragment : Fragment() {

    private var _binding: FragmentConnexionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConnexionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.buttonConnexion?.setOnClickListener {
            val pseudo = _binding?.editTextPseudo?.text.toString()
            val destination = ConnexionFragmentDirections.actionConnexionFragmentToCommandeFragment(
                pseudo
            )
            findNavController().navigate(destination)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}