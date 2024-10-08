package io.github.aerialist7

import io.github.aerialist7.components.Header
import io.github.aerialist7.components.LoadingIndicator
import io.github.aerialist7.components.UserInfo
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import tanstack.query.core.QueryClient
import tanstack.react.query.QueryClientProvider
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
    document.body.appendChild(root)

    createRoot(root)
        .render(App.create())
}

private val QueryClient = QueryClient()

private val App = FC<Props> {
    QueryClientProvider {
        client = QueryClient

        Header()
        LoadingIndicator()
        UserInfo()
    }
}
