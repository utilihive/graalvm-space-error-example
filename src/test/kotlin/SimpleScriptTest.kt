import org.graalvm.polyglot.Context
import org.intellij.lang.annotations.Language
import org.junit.Test

class SimpleScriptTest {

    @Language("ES6")
    private val simpleScript = """
        (function myFun(){ return "some result";})
        """.trimIndent()

    @Test
    fun `GIVEN correct input THEN data returned as expected`() {
        val context = Context.create()
        context.use {
            val value = context.eval("js", simpleScript)
            val result = value.execute(arrayOf<Any>())
            println(result)
        }
    }
}
