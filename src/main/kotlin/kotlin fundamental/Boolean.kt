package `kotlin fundamental`

fun main() {
    // Conjunction atau AND (&&)
    /*Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi
     expression yang diberikan bernilai true. */

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    // Penyederhanaan If expressions
    val isOpen1 = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")

    // Disjunction atau OR (||)
    /* Berbeda dengan operator AND (&&), operator OR (||) akan mengembalikan nilai true jika hasil evaluasi dari salah
     satu expressions yang diberikan bernilai true.*/

    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose")

    // Negation atau NOT (!)
    /*Berbeda dengan operator AND (&&) dan operator OR(||), operator NOT(!) digunakan untuk melakukan negasi pada hasil
    evaluasi expression yang diberikan. Contoh, Jika hasil expressions setelah dievaluasi bernilai true, maka operator
    NOT akan mengembalikan nilai false. */

    val officeOpen1 = 7
    val now1 = 10
    val isOpen2 = now1 > officeOpen1
    if (!isOpen2){
        print("Office is closed")
    }else{
        print("Office is open")
    }

}