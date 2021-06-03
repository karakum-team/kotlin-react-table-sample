import component.Header
import component.UserTable
import component.UsersModule
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        Header {}
        UsersModule {
            UserTable {}
        }
    }
}
