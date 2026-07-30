fun interviewquestion() {

    val list2 = listOf(1, 2, 3, 4, 5)
    val list1 = listOf(1, 6, 9, 10, 11)

    //  val result=(list1 + list2).toSet().toList()
    val result = mutableListOf<Int>()

    for (item in list1) {
        if (!result.contains(item)) {
            result.add(item)
        }
    }

    for (item in list2) {
        if (!result.contains(item)) {
            result.add(item)
        }
    }

    //  bubbleSort(result,result.size)
    //  print("Sorted array:${result.joinToString()}")

    println(result)

}

fun commanQuestion() {

    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6, 2, 3, 8, 12)

    val result = mutableListOf<Int>()

    /*  list1.forEach { it->

          list2.forEach{it2->

              if(it==it2){
                  result.add(it)
                  result.add(it2)

              }

          }


      }*/

    for (i in list1) {

        if (result.contains(i)) continue   // avoid duplicate result

        for (j in list2) {
            if (i == j) {
                result.add(i)
                break
            }
        }
    }
    print(result)


}


fun findMissingNumber(list: List<Int>): Int {
    val n = list.size + 1   // ek number missing hai
    val expectedSum = n * (n + 1) / 2

    var actualSum = 0
    for (num in list) {
        actualSum += num
    }

    return expectedSum - actualSum
}

fun longestString() {

    val data=listOf("faizalaa","ayesha","me")
    var longString:String?=null

    for(s in data){
        if(s.length > (longString?.length ?: 0)){
            longString=s
        }
    }
    print(longString)


}

fun main() {
   // val list1 = listOf(1, 2, 3, 5)
   // println(findMissingNumber(list1))
    longestString()
}
