fun main() {
    val firstMatrix = Matrix(arrayOf(
        intArrayOf(3, -2, 5),
        intArrayOf(3, 0, 4)
    ))

    val secondMatrix1 = Matrix(arrayOf(
        intArrayOf(2, 3),
        intArrayOf(-9, 0),
        intArrayOf(0, 4)
    ))

    val secondMatrix2 = Matrix(arrayOf(
        intArrayOf(6, 3),
        intArrayOf(9, 0),
        intArrayOf(5, 4)
    ))

    println("************** Addition **************")
    println("Matrix 1:\n$secondMatrix1")
    println("Matrix 2:\n$secondMatrix2")
    val addition = secondMatrix1 + secondMatrix2
    println("Result:\n$addition")

    println("************** Subtraction **************")
    val subtraction = secondMatrix1 - secondMatrix2
    println("Result:\n$subtraction")

    println("************** Multiplication **************")
    println("Matrix 1:\n$firstMatrix")
    println("Matrix 2:\n$secondMatrix1")
    val multiplication = firstMatrix * secondMatrix1
    println("Result:\n$multiplication")
}
