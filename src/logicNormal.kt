fun logicNormal() {
    var a=1
    var b=10
    var c=5

    a=b++
    println("a+---->$a")//10
    b=++c
    println("b+---->$b")//6
    c=++a//11

    println("a---->$a")//11
    println("b---->$b")//6
    println("c---->$c")//11
}
fun swipeValue() {

    var a=2
    var b=5



  /*  a=b.also {
        b=a
    }

    println("a---->$a")
    println("b---->$b")
*/

    a=a+b
    b=a-b
    a=a-b

    println("a35---->$a")
    println("b36---->$b")


}
