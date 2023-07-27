package com.example.tp.ui.fragment

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.tp.databinding.FragmentArticleViewBinding
import com.example.tp.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar


class ArticleViewFragment : Fragment() {

    lateinit var binding : FragmentArticleViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = ArticleRepository.getArticle(0)
        binding.imageButtonEdit.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
            builder.setMessage("Voulez-vous modifier cet article")
                .setTitle("Edition article")
                .setPositiveButton("Oui"){ _: DialogInterface, _: Int ->
                    binding.article?.let{article->
                        ArticleViewFragmentDirections
                            .actionArticleViewFragmentToArticleAddEditFragment(article).also {destination->
                                findNavController().navigate(destination)
                            }
                    }
                }
                .setNegativeButton("Non"){ dialogInterface: DialogInterface, i: Int -> }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        binding.imageButtonUrl.setOnClickListener {
            Toast.makeText(requireContext(), binding.article?.url ?: "Pas d'URL", Toast.LENGTH_SHORT).show()
        }
        binding.imageButtonSend.setOnClickListener {
            Snackbar.make(binding.root,
                "Le message est envoyé (frais estimés 50.65€)",
                Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onResume() {
        super.onResume()

    }

}