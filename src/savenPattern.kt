fun sevenPattern() {

    /*
 1
 2 3
 3 4 5
 4 5 6 7
 5 6 7 8 9

          */


    for (i in 1..5) {
        var counter = i

        for (j in 1..i) {
            print(" $counter")
            counter = counter + 1
        }
        println()
    }
}