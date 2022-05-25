package `kotlin fundamental`

fun main() {
    /*Pendeklarasian fungsi pada Kotlin diawali dengan kata kunci fun kemudian dilanjutkan dengan nama fungsi yang
    dikehendaki. Selanjutnya adalah parameter yang berada pada fungsi yang dideklarasikan. Awali dengan nama parameter
    dan ikuti dengan tipe parameter itu sendiri yang dipisahkan oleh karakter colon (:). Setiap parameter yang berada
    pada sebuah fungsi dipisahkan oleh karakter koma dan berada di dalam tanda kurung. */

    // Dengan cara menggunakan variable
    val user = setUser("Andika", 26)
    println(user)
    // Langsung dengan println
    println(setUser("Andika",26))

    printUser("Andika")

}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

/*Nilai yang akan dikembalikan diikuti oleh kata kunci return. Jika di dalam suatu fungsi hanya memiliki satu
expression untuk menentukan nilai kembalian, maka fungsi tersebut bisa diubah menjadi expression body. Kita hanya
perlu menambahkan tanda = dan menuliskannya seperti berikut:*/

// Secara eksplisit
fun setUser1(name: String, age: Int): String = "Your name is $name, and you $age years old"

/*Ketika menggunakan tipe kembalian Unit, Kotlin memungkinkan kita untuk menghilangkannya. Kenapa demikian? Kompiler
 akan mendeteksinya sebagai tipe kembalian yang redundant:*/

fun printUser(name: String): Unit {
    println("Your name is $name")
}

/*Ketika menggunakan tipe kembalian Unit, Kotlin memungkinkan kita untuk menghilangkannya. Kenapa demikian? Kompiler
 akan mendeteksinya sebagai tipe kembalian yang redundant:*/

fun printUser1(name: String): Unit {
    println("Your name is $name")
}