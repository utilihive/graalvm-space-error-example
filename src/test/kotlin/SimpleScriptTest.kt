import org.graalvm.polyglot.Context
import org.graalvm.polyglot.PolyglotException
import org.junit.Test

class SimpleScriptTest {

    @Test
    fun `GIVEN correct input THEN data returned as expected`() {
        try {
            val context = Context.create()
            context.use {
                val result = context.eval("js", "'some result'")
                println(result)
            }
        } catch (e: PolyglotException) {
            e.printStackTrace()
            throw e
        }
    }
}
