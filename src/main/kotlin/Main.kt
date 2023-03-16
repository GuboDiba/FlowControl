fun main() {
    oddNumber()
    var result=names(arrayOf("Purity","Esther","Clarine","Gubo","Masian","Joy"))
    println(result)

    robot(4)
    robot(10)
    robot(56)

    numCheck()


}
//No 1
fun oddNumber(){
    for (y in 1..100)
        if (y%2!=0){
            println(y)

        }
}
//No 2
fun names(name:Array<String>):Int{
    var a=0
    for (b in name){
        if (b.length>5){
            a++
        }
    }
    return a
}
//No 3
fun robot(age:Int){
    when(age){
        in 0..6 -> println("Serve Milk")
        in 7..15 -> println("Serve Fanta Orange")
        else -> println("Serve Cocacola")
    }
}
//No 4
fun numCheck(){
    for(x in 1..100)
        if (x%3==0 && x%5==0){
            println("FizzBuzz")

        }else if(x%3==0){
            println("Fizz")
        }else if(x%5==0){
            println("Buzz")
        }else{
            println(x)
        }

}