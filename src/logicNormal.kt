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