fun threePattern() {

/*
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
    * * * * * * *
   * * * * * * * *
  * * * * * * * * *
 * * * * * * * * * *

         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10

*/

    for(r in 1..10){
        for(s in 9 downTo r){//s ni value r ni value krta moti hoy to print thase

            print(" ")
        }
        for(c in 1..r){
            print("$c ")//*,c
        }
        println()
    }


}