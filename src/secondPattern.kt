fun secondPattern() {

    /*

    *****
    ****
    ***
    **
    *

    55555
    4444
    333
    22
    1


    12345
    1234
    123
    12
    1

    */

    for (r in 5 downTo 1) {
        for (c in 1..r) {
            print(r)//*,r,c
        }

        println()
    }
}