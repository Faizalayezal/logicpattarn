fun doublePeramed() {

   /*

      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *


    */


    for( i in 0 .. 10){
        var ab = ""

        if(i<5){
            for( c in i..5){
                ab += " "
            }
            for( c in 0..i){
                ab += "* "
            }
        }else{
            for( c in 0..(i-5)){
                ab += " "
            }
            for( c in i..10){
                ab += "* "
            }
        }
        println("$ab")

    }
}

/*
//Christmas tree logic
for (i in 0..8) {
    var ab = ""

    if (i < 5) {
        for (c in i..5) {
            ab += " "
        }
        for (c in 0..i) {
            ab += "* "
        }
    } else {
        for (c in 0.. 4) {
            ab += " "
        }
        for (c in 0..1) {
            ab += "* "
        }



    }
    println("$ab")

}
}*/
