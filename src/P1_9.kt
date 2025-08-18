fun main ()
{
    println("Enter array size : ")
    val size = readln().toInt()

    val bhavya = IntArray(size)

    println("Enter $size number : ")
    for(i in 0 until size)
    {
        bhavya[i] = readln().toInt()
    }

    println("your array : ${bhavya.contentToString()}")

    val maxnum = bhavya.maxOrNull()

    println("max number is : $maxnum")

}