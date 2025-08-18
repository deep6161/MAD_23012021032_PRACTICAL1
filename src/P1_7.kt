fun factorial(x: Int): Int{
    return if (x == 1){
        1
    }
    else{
        x * factorial(x-1)
    }
}

fun main(){
    print("enter number:")
    val x: Int=readln().toInt()

   val ans: Int=factorial(x)
    print("factorial:${ans}")
}