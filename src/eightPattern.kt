fun eightPattern() {

    /*
            1
            2 1
            3 2 1
            4 3 2 1
            5 4 3 2 1
    */

    for(i in 1..5)
    {
        var counter=i

        for(j in 1..i)
        {
            print(" $counter")
            counter=counter-1
        }
        println()
    }

}