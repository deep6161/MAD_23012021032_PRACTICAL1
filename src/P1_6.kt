fun addition(a: Int,b: Int): Int{
   return a+b
}

fun mul(a: Int,b: Int): Int{
    return a * b
}

fun sub(a: Int,b: Int): Int{
    return a-b
}

fun div(a: Int,b: Int): Int{
    return if (b == 0){
        print("/0 not allowed")
        0
    }
    else{
    a/b}
}


fun main(){
print("enter 1st number:")
val x: Int=readln().toInt()

    print("enter 2st number:")
    val y: Int=readln().toInt()

    println("addition:${addition(x,y)}")
    println("substraction:${sub(x,y)}")
    println("multiplicaton:${mul(x,y)}")
    println("divison:${div(x,y)}")
}
