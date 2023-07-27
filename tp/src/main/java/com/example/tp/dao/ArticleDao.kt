package com.example.tp.dao

import com.example.tp.bo.Article

interface ArticleDao {
    fun selectById(id: Long): Article?
    fun update(article: Article): Unit
}