package `kotlin fundamental`

fun main() {
    // Mengetahui nilai max dan min tipe number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    // Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+), pengurangan (-),
// perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).

    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)

    // Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah. Contohnya seperti berikut:
    val number1: Int = 20
    val number2: Int = 10
    println(number1 / number2)

    // Sama seperti perhitungan matematika di mana operasi perkalian dan pembagian didahulukan, demikian halnya
    // perhitungan pada Kotlin.

    println(5 + 4 * 4)

    // Operasi 4 * 4 akan dilakukan terlebih dahulu, kemudian diikuti 5 + 16. Jika ingin operasi 5 + 4 dilakukan
    // terlebih dahulu, gunakan tanda kurung:
    println((5 + 4) * 4)

    // Di Kotlin kita tidak bisa melakukan konversi secara langsung. Contoh, ketika ingin melakukan konversi dari
    // tipe data Byte ke tipe data Int.
    // Contoh
    // val byteNumber: Byte = 1
    // val intNumber: Int = byteNumber // compile error

    // Untuk mengatasinya, lakukan konversi dengan bantuan beberapa fungsi seperti toInt() berikut:
    val byteNumber : Byte = 10
    val intNumber : Int = byteNumber.toInt()
    println(intNumber)

    // Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara eksplisit dari tipe data Byte ke tipe
    // data Int. Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:
    //toByte(): Byte
    //toShort(): Short
    //toInt(): Int
    //toLong(): Long
    //toFloat(): Float
    //toDouble(): Double
    //toChar(): Char

    // Contoh lain penggunaan konversi adalah sebagai berikut:
    val stringNumber = "23"
    val intNumber1 = 3

    println(intNumber1 + stringNumber.toInt())

    // Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable” dengan menggunakan tanda
    // underscores seperti berikut:
    val readableNumber = 1_000_000
    print(readableNumber)
}