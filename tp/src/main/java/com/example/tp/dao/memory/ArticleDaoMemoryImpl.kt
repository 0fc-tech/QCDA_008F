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
                4,null,null,null
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







