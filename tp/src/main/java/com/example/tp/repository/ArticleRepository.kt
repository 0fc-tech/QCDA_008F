package com.example.tp.repository

import com.example.tp.bo.Article
import com.example.tp.dao.DaoFactory
import com.example.tp.dao.DaoType

object ArticleRepository {
    private val daoMemory = DaoFactory.createDaoByType(DaoType.MEMORY)
    fun getArticle(id: Long): Article?{
        return daoMemory.selectById(id)
    }

    fun updateArticle(articleToUpdate: Article) {
        daoMemory.update(articleToUpdate)
    }
}