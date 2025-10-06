
class Matrix(private val data: Array<IntArray>) {

    private val rows = data.size
    private val cols = data[0].size

    // Matrix addition
    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must match for addition"
        }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must match for subtraction"
        }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Matrix multiplication
    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) {
            "Matrix A columns must equal Matrix B rows for multiplication"
        }
        val result = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result)
    }

    // Print matrix neatly
    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString("\t")
        }
    }
}

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
