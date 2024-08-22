class SudokuSolver(private val board: Array<IntArray>) {
    fun solve(): Boolean {
        val emptyCell = findEmptyCell()

        if (emptyCell == null) {
            println(emptyCell)
            // If no empty cell is found, the Sudoku is solved
            return true
        }

        val (row, col) = emptyCell

        // Try filling the empty cell with numbers 1 to 9
        for (num in 1..9) {
            if (isValid(row, col, num)) {
                // If the number is valid, assign it to the empty cell
                board[row][col] = num

                // Recursively solve the rest of the Sudoku
                if (solve()) {
                    return true
                }

                // If the recursive call fails, backtrack and try another number
                board[row][col] = 0
            }
        }

        // If no number is valid, backtrack to the previous cell
        return false
    }

    private fun findEmptyCell(): Pair<Int, Int>? {
        for (row in board.indices) {
            for (col in board[row].indices) {
                if (board[row][col] == 0) {
                    return Pair(row, col)
                }
            }
        }
        return null
    }

    private fun isValid(row: Int, col: Int, num: Int): Boolean {
        // Check if the number is already in the row or column
        for (i in 0 until 9) {
            if (board[row][i] == num || board[i][col] == num) {
                return false
            }
        }

        // Check if the number is already in the 3x3 grid
        val startRow = row - row % 3
        val startCol = col - col % 3
        for (r in 0 until 3) {
            for (c in 0 until 3) {
                if (board[startRow + r][startCol + c] == num) {
                    return false
                }
            }
        }

        return true
    }

    fun printBoard() {
        for (row in board) {
            println(row.joinToString("|"))
        }
    }


}







