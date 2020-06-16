package com.noruks.myapplication

fun inject(activity: MainActivity) {
    DaggerHomeComponent.builder()
        .homeActivity(activity)
        .taskModule(TaskModule())
        .build()
        .inject(activity)
}