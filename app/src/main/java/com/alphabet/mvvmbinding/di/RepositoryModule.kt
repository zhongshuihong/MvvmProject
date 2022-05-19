package com.alphabet.mvvmbinding.di

import com.alphabet.mvvmbinding.repository.Repository
import com.alphabet.mvvmbinding.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author: shuihongzhong
 * @date: 2022/5/15
 * @description:
 */
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideTaskRepository(
    ): Repository {
        return RepositoryImpl()
    }
}