// kotlin program to solve N Queen Problem using backtracking
class NQueenProblem {
    val N: Int = 4

    fun printSolution(board: Array<IntArray>) {
        for (i in 0 until N) {
            for (j in 0 until N) {
                if (board[i][j] == 1) print("Q ")
                else print(". ")
            }
            println()
        }
    }


    fun isSafe(board: Array<IntArray>, row: Int, col: Int): Boolean {
        // Check this row on left side
        var i = 0
        while (i < col) {
            if (board[row][i] == 1) return false
            i++
        }

        // Check upper diagonal on left side
        i = row
        var j = col
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) return false
            i--
            j--
        }

        // Check lower diagonal on left side
        i = row
        j = col
        while (j >= 0 && i < N) {
            if (board[i][j] == 1) return false
            i++
            j--
        }

        return true
    }

    // A recursive utility function to solve N
    // Queen problem
    fun solveNQUtil(board: Array<IntArray>, col: Int): Boolean {
        // Base case: If all queens are placed
        // then return true
        if (col >= N) return true

        // Consider this column and try placing
        // this queen in all rows one by one
        for (i in 0 until N) {
            // Check if the queen can be placed on
            // board[i][col]

            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]

                board[i][col] = 1

                // Recur to place rest of the queens
                if (solveNQUtil(board, col + 1) == true) return true

                // If placing queen in board[i][col]
                // doesn't lead to a solution then
                // remove queen from board[i][col]
                board[i][col] = 0 // BACKTRACK
            }
        }


        return false
    }


    fun solveNQ(): Boolean {
        val board = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0)
        )

        if (solveNQUtil(board, 0) == false) {
            print("Solution does not exist")
            return false
        }

        printSolution(board)
        return true
    }


} // This code is contributed by Abhishek Shankhadhar