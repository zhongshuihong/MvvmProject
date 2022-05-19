package com.alphabet.mvvmbinding.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

/**
 * @author: shuihongzhong
 * @date: 2022/5/15
 * @description:
 */
class RepositoryImpl: Repository {
    override fun fetchDataList(): Flow<String> {
        return flowOf("xxx", "ttt", "aaa")
    }
}