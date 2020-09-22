package com.arkivanov.todo.app.ribs.interop

import android.view.ViewGroup
import com.arkivanov.decompose.ComponentContext

interface DecomposeComponentBuilder<T : Any> {

    fun createComponent(componentContext: ComponentContext): T

    fun attachView(parent: ViewGroup, viewLifecycle: DecomposeLifecycle, component: T)
}
