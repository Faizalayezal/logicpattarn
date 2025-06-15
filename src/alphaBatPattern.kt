fun alphaBatPattern() {

    //firstAlfabatepat()
    secondAlfabatepat()
    //threeAlfabatepat()
    // fiveAlfabatepat()

}

fun firstAlfabatepat() {
    /*
    A
    B C
    D E F
    G H I J
    K L M N O
   */
    var alphabet = 'A'
    for (i in 1..5) {
        for (j in 1..i) {
            print("${alphabet++} ")
        }
        println()
    }
}

fun secondAlfabatepat() {
    /*
        A
        B B
        C C C
        D D D D
        E E E E E

     */

    var alphabet = 'A'

    for (i in 1..5) {
        for (j in 1..i) {
            print("${alphabet + i - 1} ")
        }

        println()
    }

}

fun threeAlfabatepat() {

    /*
       A
       B C
       C D E
       D E F G
       E F G H I

     */

    val alphabet = 'A'

    for (i in 1..5) {
        for (j in 1..i) {
            print("${alphabet + i + j - 2} ")
        }

        println()
    }

}

fun fourAlfabatepat() {

    /*
       E
       D E
       C D E
       B C D E
       A B C D E

     */

    for (i in 1..5) {
        var alphabet = 'A' + 5 - i
        for (j in 1..i) {
            print("${alphabet} ")
            alphabet++
        }
        println()
    }

}

fun fiveAlfabatepat() {

    /*

    A A A A A
    B B B B B
    C C C C C
    D D D D D
    E E E E E


    A B C D E
    A B C D E
    A B C D E
    A B C D E
    A B C D E

    */

    val alphabet = 'A'

    for (i in 1..5) {
        for (j in 1..5) {
            // print("${alphabet+i-1} ")
            print("${alphabet + j - 1} ")
        }

        println()
    }

}

