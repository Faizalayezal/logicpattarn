fun fibonacci(n: Int): Int {//recurstion ni rit
    return if (n <= 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }

}

fun fibonacciNext(){//simple rit pachhad ni value ma plush thatu jay
    var x=0
    var y=1
    var z=0
    val n=50
    while (z<=n){
        println(z)
        x=y
        y=z
        z=x+y

    }

}

