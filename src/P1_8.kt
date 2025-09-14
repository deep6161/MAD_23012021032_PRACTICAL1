import java.util.Arrays

fun main() {


    println("--- 1. Working with Arrays and Printing ---")

    val twoDArray = arrayOf(
        intArrayOf(10, 90, 60, 80),
        intArrayOf(12, 1, 5, 18),
        intArrayOf(20, 30, 40, 50)
    )
    println("Using Arrays.deepToString() for a 2D array:")
    println(Arrays.deepToString(twoDArray))

    val simpleIntArray = intArrayOf(56, 23, 49, 12, 2)
    println("\nUsing contentToString() for a simple array:")
    println(simpleIntArray.contentToString())

    println("\nUsing IntArray.joinToString():")
    println(simpleIntArray.joinToString(separator = " | ", prefix = "[", postfix = "]"))


    println("\n--- 2. Manipulating Arrays with Loops ---")

    println("Using a range loop (0..4) to print elements:")
    for (i in 0..4) {
        print("${simpleIntArray[i]} ")
    }
    println()

    println("Using a downTo loop to print in reverse:")
    for (i in simpleIntArray.size - 1 downTo 0) {
        print("${simpleIntArray[i]} ")
    }
    println()

    println("Using an until loop to print until the last element:")
    for (i in 0 until simpleIntArray.size - 1) {
        print("${simpleIntArray[i]} ")
    }
    println()


    println("\n\n--- 3. Sorting an Array ---")

    val arrayToSort = intArrayOf(56, 23, 49, 12, 2)

    println("Original array before manual sort: ${arrayToSort.joinToString()}")
    for (i in 0 until arrayToSort.size - 1) {
        for (j in 0 until arrayToSort.size - i - 1) {
            if (arrayToSort[j] > arrayToSort[j + 1]) {
                // Swap elements
                val temp = arrayToSort[j]
                arrayToSort[j] = arrayToSort[j + 1]
                arrayToSort[j + 1] = temp
            }
        }
    }
    println("Array after manual sort: ${arrayToSort.joinToString()}")

    val arrayForBuiltInSort = intArrayOf(56, 23, 49, 12, 2)

    println("\nOriginal array before built-in sort: ${arrayForBuiltInSort.joinToString()}")
    arrayForBuiltInSort.sort()
    println("Array after built-in sort: ${arrayForBuiltInSort.joinToString()}")
}