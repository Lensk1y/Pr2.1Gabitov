fun main(args: Array<String>) {
    print("Введите количество строк: ")
    val rows = readln().toInt()
    print("Введите количество столбцов: ")
    val cols = readln().toInt()

    val array = Array(rows) { IntArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Введите элемент [$i][$j]: ")
            array[i][j] = readln().toInt()
        }
    }

    val digitsSet = mutableSetOf<Int>()

    for (row in array) {
        for (num in row) {
            var temp = num
            while (temp > 0) {
                digitsSet.add(temp % 10)
                temp /= 10
            }
        }
    }

    println("Двумерный массив:")
    for (row in array) {
        for (num in row) {
            print("$num ")
        }
        println()
    }

    println("В массиве использовано ${digitsSet.size} различных цифр")
}