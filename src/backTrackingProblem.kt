fun backTrackingProblemSolve(str: String, prem: String, index: Int) {
    if (str.length == 0) {
        println(prem)
        return
    }
    for (i in 0 until str.length) {
        val currChar = str[i]
        val newChar = str.substring(0, i) + str.substring(i + 1)
        backTrackingProblemSolve(newChar, prem + currChar, index + 1)
    }

}


//nQueensProblem



/*
Time complexity: O(n!)

Ek function se multiple recursive calls ho rahi hain

Ek call ke baad loop continue hota hai

Matlab call ke baad bhi kaam pending hai


Tail recursion rule:

Recursive call last kaam hona chahiye
Aur sirf ek recursive call honi chahiye*/
