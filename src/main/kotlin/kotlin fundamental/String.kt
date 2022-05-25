package `kotlin fundamental`

fun main() {
    // String ambil data array
    // For looping objek string
    val text = "kotlin"
    val firstChar = text[0]
    println("First character of $text is $firstChar")

    for (char in text) {
        print("$char")
    }

    // Catatan Tanda escaped
//    \: Mengurangi ambigu
//    val statement = "Kotlin is \"Awesome!\""
//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    // Unicode
    val name = "Unicode test: \u00A9"
    println(name)

    // Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
    """.trimIndent()
    println(line)
}