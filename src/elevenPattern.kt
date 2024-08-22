fun elevenPattern() {


/*
 12345
  1234
   123
    12
     1


 55555
  4444
   333
    22
     1
*/



    for(r in 5 downTo 1){
        for(s in r ..  5){
            print(" ")
        }
        for(c in 1..r){
            print(c)//c r
        }

        println()
    }
}