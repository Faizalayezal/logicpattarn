fun forePattern() {

/*
* * * * * * * * * *
 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *



1 2 3 4 5 6 7 8 9 10
 1 2 3 4 5 6 7 8 9
  1 2 3 4 5 6 7 8
   1 2 3 4 5 6 7
    1 2 3 4 5 6
     1 2 3 4 5
      1 2 3 4
       1 2 3
        1 2
         1

*/

    for(r in 10 downTo  1){
        for(s in r..9){//s ni value r ni value krta moti hoy to print thase

            print(" ")//*,c
        }
        for(c in 1..r){
            print("$c ")
        }
        println()
    }


}