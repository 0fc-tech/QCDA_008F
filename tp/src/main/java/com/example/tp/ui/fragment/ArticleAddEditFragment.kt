package com.example.tp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.tp.R
import com.example.tp.bo.Article
import com.example.tp.databinding.FragmentArticleAddEditBinding
import com.example.tp.repository.ArticleRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ArticleAddEditFragment : Fragment() {
    lateinit var binding: FragmentArticleAddEditBinding
    val args by navArgs<ArticleAddEditFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleAddEditBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article
        binding.imageButtonSave.setOnClickListener {
            val articleToUpdate = Article(
                binding.article?.id?:0,
                binding.editTextTitle.text.toString(),
                binding.editTextDesc.text.toString(),
                binding.editTextPrix.text.toString().toDouble(),
                binding.ratingBarDegreEnvie.rating.toInt().toByte(),
                binding.editTextUrl.text.toString(),
                binding.checkBoxIsAchete.isChecked,
                LocalDate.parse(binding.editTextDateAchat.text.toString(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            )
            ArticleRepository.updateArticle(articleToUpdate)
            findNavController().popBackStack()
        }
    }
}







