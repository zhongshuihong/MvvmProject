package com.alphabet.mvvmbinding.repository

import kotlinx.coroutines.flow.Flow

/**
 * @author: shuihongzhong
 * @date: 2022/5/15
 * @description:
 */
interface Repository {
    fun fetchDataList(): Flow<String>
}