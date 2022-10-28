import com.sonar.magic.library.Library.add

fun main() {
    println(add(1, 2))
    println("HELLO, WORLD!")
}

@Deprecated(message = "Please stop using this method")
fun doubleValue(value: Int): Int = value * 2

fun doubleNotSuppressed(values: List<Int>): List<Int> {
    return values.map {
        @Suppress("kotlin:S1874")
        doubleValue(it)
    }
}

fun doubleSuppressed(values: List<Int>): List<Int> {
    return values.map { value ->
        @Suppress("kotlin:S1874")
        doubleValue(value)
    }
}