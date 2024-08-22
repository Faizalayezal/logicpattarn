class SudokuSolvers(private val board: Array<IntArray>) {

    fun solves():Boolean{
        val dataisEmptry=findemptyData()

        if(dataisEmptry==null){
            //println("ffggffg${dataisEmptry}")
            return true
        }

        val (row,col)=dataisEmptry

        for(num in 1..9){
            if(isSafe(row,col,num)){
                board[row][col]=num

                if(solves()){
                    return true
                }
                board[row][col]=0

            }
        }
        return false

    }

    private fun isSafe(row: Int, col: Int, num: Int): Boolean {
        for(i in 0 until  9){
            if(board[row][i] == num || board[i][col]==num){
                return false
            }
        }

        val startRow=row - row % 3
        val startCol=col - col % 3

        for(r in 0 until 3){
            for(c in 0 until 3){
                if(board[startRow+r][startCol+c]==num){
                    return false
                }
            }
        }
        return true
    }


    private fun findemptyData(): Pair<Int,Int>? {

        for(row in board.indices){
            for(col in board[row].indices){
                if(board[row][col]==0){
                    return Pair(row,col)
                }
            }
        }
        return null
    }

    fun printBoards() {
        for(row in board){
            println(row.joinToString("|"))
        }

    }

}







