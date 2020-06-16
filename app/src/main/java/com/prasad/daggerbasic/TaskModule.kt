package com.noruks.myapplication


import dagger.Module
import dagger.Provides

@Module
class TaskModule {

    @Provides
    fun provideDataLoad():String = "Hello Kotlin"

}
