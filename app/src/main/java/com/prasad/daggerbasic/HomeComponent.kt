package com.noruks.myapplication

import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [TaskModule::class]
)
@FeatureScope
interface HomeComponent : BaseActivityComponent<MainActivity> {

    @Component.Builder
    interface Builder {
        fun build(): HomeComponent
        @BindsInstance
        fun homeActivity(activity: MainActivity): Builder
        fun taskModule(module: TaskModule): Builder
    }
}