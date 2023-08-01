package com.example.tp.ui.fragment

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.tp.bo.Article
import com.example.tp.databinding.FragmentArticleViewBinding
import com.example.tp.repository.ArticleRepository
import com.example.tp.ui.vm.ArticleViewViewModel
import com.google.android.material.snackbar.Snackbar


class ArticleViewFragment : Fragment() {
    val vm by viewModels<ArticleViewViewModel>()

    val launcherPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()){
        if(it){
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:0612345678")
            intent.putExtra("sms_body", "Pour me faire un cadeau, tu peux m'offrir ça : " +
                        "${binding.vm?.article?.intitule}.\n" +
                        "    Cela ne coute que 85 euros et cela me fera vraiment plaisir :) Merci ! \n")

            startActivity(intent)
        }
    }
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
        binding.vm = vm
        binding.imageButtonEdit.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
            builder.setMessage("Voulez-vous modifier cet article")
                .setTitle("Edition article")
                .setPositiveButton("Oui"){ _: DialogInterface, _: Int ->
                    binding.vm?.article?.let{article->
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
            val intentToWeb = Intent(Intent.ACTION_VIEW, Uri.parse(binding.vm?.article?.url))
            startActivity(intentToWeb)
            Toast.makeText(requireContext(), binding.vm?.article?.url ?: "Pas d'URL", Toast.LENGTH_SHORT).show()
        }
        binding.imageButtonSend.setOnClickListener {
            launcherPermission.launch(Manifest.permission.SEND_SMS)
            Snackbar.make(binding.root,
                "Le message est envoyé (frais estimés 50.65€)",
                Snackbar.LENGTH_LONG).show()
        }
    }

}