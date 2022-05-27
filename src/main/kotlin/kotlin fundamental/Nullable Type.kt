package `kotlin fundamental`

fun main() {
    // Kotlin akan memaksa kita untuk menentukan nilai awal dari sebuah objek ketika dibuat dan tidak boleh bernilai
// null. Jika  ingin sebuah objek bisa bernilai null, kita bisa menambahkan tanda ? setelah menentukan tipe dari
// objek tersebut:

    val text: String? = null

    //Namun kita tidak bisa langsung mengakses atau mengelola nilai dari objek yang sudah kita tandai sebagai nullable.
    // Sebagai contoh:

    // val textLength = text.length

    // Lalu bagaimana cara kita mengakses atau mengelola nilai dari objek yang ditandai sebagai nullable? Cara mudahnya,
// periksa objek tersebut apakah bernilai null atau tidak:
    val text1: String? = null
    if (text1 != null) {
        val textLength = text1.length
    } else {
        println("Null")
    }
    // Dengan cara tradisional menggunakan if/else seperti di atas, kompiler akan mengizinkan kita untuk mengelola nilai
// dari sebuah variabel yang kita tandai sebagai nullable.
}