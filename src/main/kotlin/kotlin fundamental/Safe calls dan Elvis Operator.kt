package `kotlin fundamental`

fun main() {
    //Safe calls operator (?.)
    /*
    Yang pertama akan kita pelajari adalah Safe Calls. Seperti namanya, safe call akan menjamin kode yang kita tulis
    aman dari NullPointerException. Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.)
    saat mengakses atau mengelola nilai dari objek nullable. Seperti ini:
    * */

    val text: String? = null
    text?.length
    println(text)
    // Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.

    // Elvis Operator (?:)
    // Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    val text1: String? = null
    val textLenght = text1?.length ?: 7
    println(textLenght)

    //Kode di atas sebenarnya sama seperti ketika kita menggunakan if/else berikut:
    val textLenght1 = if (text1 != null) text1.length else 7
    // Elvis akan mengembalikan nilai text.length jika text tidak bernilai null. Sebaliknya, jika text bernilai null
    // maka default value yang akan dikembalikan.

    // non-null assertion(!!)
//    val text2: String? = null
//    val textLength3 = text2!!.length // ready to go ???
//    println(textLength3)

    // Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari
    // sebuah objek nullable. Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah
    // objek menjadi non-null. Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.

}