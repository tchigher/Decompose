package com.arkivanov.todo.app.ribs.interop

import com.badoo.ribs.core.Rib
import com.badoo.ribs.core.builder.BuildContext

@Suppress("FunctionName")
fun <T : Any> DecomposeRib(decomposeComponentBuilder: DecomposeComponentBuilder<T>, buildContext: BuildContext): Rib =
    DecomposeRibBuilder(decomposeComponentBuilder).build(buildContext, null)
