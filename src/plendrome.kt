fun isPalindrome(num: Int): Boolean {
    val str = num.toString()
    return str == str.reversed()
}

fun generatePalindromeSeries(start: Int, end: Int): List<Int> {
    val palindromeSeries = mutableListOf<Int>()
    for (i in start..end) {
        if (isPalindrome(i)) {
            palindromeSeries.add(i)
        }
    }
    return palindromeSeries
}

//agad pachhad no aksar same hova joy