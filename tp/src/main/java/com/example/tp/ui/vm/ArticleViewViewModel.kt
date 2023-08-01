package com.example.tp.ui.vm

import androidx.lifecycle.ViewModel
import com.example.tp.repository.ArticleRepository

class ArticleViewViewModel : ViewModel(){
    var article = ArticleRepository.getArticle(0)
}