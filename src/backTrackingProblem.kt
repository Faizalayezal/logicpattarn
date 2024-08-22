fun backTrackingProblemSolve(str: String, prem: String, index: Int) {
        if(str.length==0){
            println(prem)
            return
        }
        for (i in 0 until str.length) {
            val currChar = str[i]
            val newChar = str.substring(0, i) + str.substring(i + 1)
            backTrackingProblemSolve(newChar,prem+currChar,index+1)
        }

    }



//nQueensProblem