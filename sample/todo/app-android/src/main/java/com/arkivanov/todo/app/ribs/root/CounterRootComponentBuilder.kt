package com.arkivanov.todo.app.ribs.root

import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Recomposer
import androidx.compose.ui.platform.setContent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.sample.counter.shared.invoke
import com.arkivanov.sample.counter.shared.root.CounterRootContainer
import com.arkivanov.todo.app.ribs.interop.DecomposeComponentBuilder
import com.arkivanov.todo.app.ribs.interop.DecomposeLifecycle

internal class CounterRootComponentBuilder : DecomposeComponentBuilder<CounterRootContainer> {

    override fun createComponent(componentContext: ComponentContext): CounterRootContainer =
        CounterRootContainer(componentContext)

    override fun attachView(parent: ViewGroup, viewLifecycle: DecomposeLifecycle, component: CounterRootContainer) {
        parent.setContent(Recomposer.current()) {
            MaterialTheme { component.model() }
        }
    }
}
