package com.example.tp.dao

import com.example.tp.dao.memory.ArticleDaoMemoryImpl

object DaoFactory {
    fun createDaoByType(type: DaoType): ArticleDao {
        return when(type){
            DaoType.MEMORY -> ArticleDaoMemoryImpl()
        }
    }
}