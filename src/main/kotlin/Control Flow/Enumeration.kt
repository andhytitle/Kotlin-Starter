package `Control Flow`

fun main() {
    // Enumeration
    /*Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah
    didefinisikan menjadi tipe data konstanta. Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah variabel
    dengan cara yang lebih efisien. Selain itu, Enumeration juga dapat digunakan untuk meminimalisir kesalahan dalam
    pengetikan nilai sebuah variabel, misalnya:
    */
//    val colorRed = 0xFF0000
//    val colorGreen = 0x00FF00
//    val colorBlue = 0x0000FF

    // Cara Pertama
//    val warnaRed = Warna.RED
//    val warnaGreen = Warna.GREEN
//    val colorBlue = Warna.BLUE
//    println(warnaRed)

    // Cara Kedua Code lebih bersih
//    val warna: Warna = Warna.RED
//    println(warna)

    //Menampilkan anonymous
//    Color.GREEN.printValue()

    // Pin 3
    //Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama
    // dari tiap Enum itu sendiri.
//    val colors : Array<Colors> = Colors.values()
//    colors.forEach {
//        warna ->
//        println(warna)
//    }

    // Pin 4
//    val warna1: Color = Color.valueOf("RED")
//    println("Color is $warna1")

    // Pin 5
    /*Selain menggunakan fungsi values() dan fungsi valueOf(), kita bisa mendapatkan daftar objek Enum dan nama dari
    objek Enum dengan cara yang lebih umum. Caranya, gunakan fungsi enumValues() dan fungsi enumValueOf(). Contoh
    penggunaan kedua fungsi tersebut adalah sebagai berikut:*/
//    val colors: Array<Color> = enumValues()
//    colors.forEach { color -> println(color) }
//    val color: Color = enumValueOf("GREEN")
//    println("Color is $color")

    // pin 6
    /*Konsep dari Enumeration sendiri sama seperti Array. Oleh karena itu, selain mendapatkan daftar dan nama dari
    tiap objek Enum, kita juga bisa mendapatkan posisi tiap objek menggunakan properti ordinal seperti berikut:
     */
//    val color: Color = Color.GREEN
//    println("Position GREEN is ${color.ordinal}")

    // pin 7
    /*Di atas telah disebutkan bahwa setiap objek merupakan instance dari enum class yang kita definisikan. Lantas
    bagaimana cara kita mengecek instance dari Enum itu sendiri? Nah, untuk mengeceknya, gunakan When Expression
    seperti berikut:
    */
    val color : Color = Color.GREEN
    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

// Cara Pertama enum class
//enum class Warna(val apa: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}

//  Selain meminimalisir terjadinya kesalahan pengetikan, Enumeration juga membuat kode yang kita tulis jadi lebih bersih
//  dan mudah dibaca.

/*Untuk mendefinisikan sebuah kelas Enum, kita bisa menggunakan kata kunci enum dan setiap objek yang berada di
dalamnya dipisahkan oleh karakter koma (,). Selain itu, objek yang berada di dalam Enum secara implisit bersifat
static dan final sehingga kita tidak dapat mengubahnya setelah dideklarasikan. Berikut contoh implementasi yang
paling mendasar dari sebuah Enum:*/

// Cara kedua enum clas
//enum class Warna {
//    RED, GREEN, BLUE
//}

// Mendeklarasikan anonymous class untuk setiap objek Enum
//enum class Color(val nilai: Int) {
//    RED(0xFF0000) {
//        override fun printValue() {
//            println("value of RED is $nilai")
//        }
//    },
//    GREEN(0x00FF00) {
//        override fun printValue() {
//            println("value of GREEN is $nilai")
//        }
//    },
//    BLUE(0x0000FF) {
//        override fun printValue() {
//            println("value of BLUE is $nilai")
//        }
//    };
//
//    abstract fun printValue()
//}

//pin 3
////Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan
//// nama dari tiap Enum itu sendiri.
//enum class Colors(val nilai1: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}


//pin 4 dan bisa di gunakan di pin 5 dan pin 6
/*Perhatikan. Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values(). Sedangkan untuk mendapatkan
nama dari objek Enum kita bisa menggunakan fungsi valueOf() seperti berikut:
*/
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}