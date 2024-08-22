fun sixPattern() {

    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

    */
    var counter = 1
    for (r in 1..5) {

        for (c in 1..r) {
            print("$counter ")
           // counter = counter + 1
            counter += 1
        }

        println()
    }
}