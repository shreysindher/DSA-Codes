fun binSearch(arr: Array<Int>, l: Int, r: Int, key: Int): Int {
    if (r >= l) {
        val mid = l + (r - l) / 2
        return if (key == arr[mid]) mid
        else if (key < arr[mid]) binSearch(arr, l, mid - 1, key)
        else binSearch(arr, mid + 1, r, key)
    }
    return -1
}

fun main() {
    val arr = arrayOf(10, 20, 30, 50, 60, 80, 100, 110, 130, 170)
    val key = 110

    val pos = binSearch(arr, 0, arr.size - 1, key)
    println(if (pos == -1) "Element not found" else "Element found at $pos")
}