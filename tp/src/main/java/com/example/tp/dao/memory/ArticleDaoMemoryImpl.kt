package com.example.tp.dao.memory

import com.example.tp.bo.Article
import com.example.tp.dao.ArticleDao

class ArticleDaoMemoryImpl : ArticleDao {
    companion object{
        val listArticles = mutableListOf(
            Article(0L,
                "Ordinateur Dell",
                "Ordinateur qui calcule",
                850.0,
                4,"https://www.dell.com/fr-fr/shop/ordinateurs-portables-et-2-en-1/ordinateur-portable-xps-15/spd/xps-15-9530-laptop/cn95304cc",null,null
            )
        )
    }
    override fun selectById(id: Long) :Article?{
        return listArticles.find { it.id == id }
    }

    override fun update(article: Article) {
        listArticles.removeIf { it.id == article.id }
        listArticles.add(article)
    }

}







