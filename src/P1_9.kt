fun main ()
{
    println("Enter array size : ")
    val size = readln().toInt()

    val deep = IntArray(size)

    println("Enter $size number : ")
    for(i in 0 until size)
    {
        deep[i] = readln().toInt()
    }

    println("your array : ${deep.contentToString()}")

    val maxnum = deep.maxOrNull()

    println("max number is : $maxnum")

}