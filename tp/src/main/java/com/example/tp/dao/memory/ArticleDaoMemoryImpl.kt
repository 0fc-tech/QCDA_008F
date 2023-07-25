package com.example.tp.dao.memory

import com.example.tp.bo.Article
import com.example.tp.dao.ArticleDao

class ArticleDaoMemoryImpl : ArticleDao {
    override fun selectById(id: Long) :Article?{
        return Article(0L,
            "Ordinateur Dell",
            "Ordinateur qui calcule",
            850.0,
            4,null,null,null
        )
    }

}