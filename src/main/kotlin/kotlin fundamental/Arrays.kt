package `kotlin fundamental`

import java.lang.reflect.Array

fun main() {
    /*Array, yakni tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel.
     Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size. Untuk
      membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:
     */
    val array = arrayOf(1, 3, 5, 7)
    // Kita juga dapat memasukkan nilai dengan berbagai jenis tipe data ke dalam arrayOf() misalnya:
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)


    // Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi
    // spesifik berikut:
    //intArrayOf() : IntArray
    //booleanArrayOf() : BooleanArray
    //charArrayOf() : CharArray
    //longArrayOf() : LongArray
    //shortArrayOf() : ShortArray
    //byteArrayOf() : ByteArray
    val intArray = intArrayOf(1, 3, 5, 7)
    // Kita juga bisa mendapatkan nilai tunggal dari sekumpulan nilai yang berada di dalam sebuah Array dengan
    // memanfaatkan indexing seperti berikut:
    val intArray1 = intArrayOf(1, 3, 5, 7)
    println(intArray[2])

    // Mengubah nilai array tunggal
    val intArray2 = intArrayOf(1, 3, 5, 7)
    intArray2[2] = 11
    println(intArray[2])

    for (i in intArray2) {
        println(i)
    }

    //Selain menggunakan library function arrayOf() dalam pembuatan objek Array, kita juga bisa menggunakan Array().
    // Constructor pada Array() membutuhkan 2 argumen yaitu size dan fungsi lambda. Contoh untuk membuat Array
    // menggunakan Array() adalah seperti berikut:
    val intArray3 = Array(5, { i -> i * i }) // [0, 1, 4, 9]
    for (i in intArray3){
        println(i)
    }
    //Pada kode di atas kita menentukan angka 4 sebagai size Array. Fungsi lambda di atas ada dua. Pertama, untuk
// mengambil indeks Array yang akan digunakan sebagai argumen. Kedua, menentukan elemen Array yang akan dimasukkan
// ke dalam indeks tersebut.


}