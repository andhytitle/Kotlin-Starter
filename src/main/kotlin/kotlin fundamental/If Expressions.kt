package `kotlin fundamental`

fun main() {
    val openHouse = 7
    val now = 20
    val office: String
    // tanpa mengembalikan nilai
    if (now > openHouse) {
        println("office already open")
    }

    // Else dijalankan ketika hasil expression yang diberikan menghasilakn nilai false
    if (now > openHouse) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }
    println(office)

    // Menggabungkan else if
    val openHours = 7
    val now1 = 7
    val office1: String
    office1 = if (now1 > 7) {
        "Office already open"
    } else if (now1 == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    print(office1)

}