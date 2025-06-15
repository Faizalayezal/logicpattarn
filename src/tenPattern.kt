fun tenPattern() {


/*


     1
    12
   123
  1234
 12345




     1
    22
   333
  4444
 55555
*/



    for(r in 1..5){
        for(s in 5 downTo  r){
            print(" ")
        }
        for(c in 1..r){
            print(c)//r
        }

        println()
    }
}