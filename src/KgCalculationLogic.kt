fun kgCalculationLogic() {

    val totalKg=196
    val twoKgBag=2
    val fiveKgBag=5

    val fiveKgQuotientTotalBag=totalKg/fiveKgBag//totalKg sathe 5 ne bhangi skay check kre background kri amount ape
    println("fiveKgQuotientTotalBag ${fiveKgQuotientTotalBag}")

    val sesCalculation=fiveKgQuotientTotalBag*fiveKgBag //5 sathe bhagela amount mathi 5 no gurakar kre
    println("sesCalculation $sesCalculation")

    val totalKgMinus=totalKg-sesCalculation//ses calulaion mathi totalKg ne bad krta 0 mle to 5 sathe bhangi skay nkr nhi
    println("totalKgMinus $totalKgMinus")

    if(totalKgMinus==0){
        println("5 Kg Total Bags ${fiveKgQuotientTotalBag}")
        return
    }

    val totalBagsDived=sesCalculation-totalKgMinus//total sesCalculation mathi lastSes bad kravathi ketla mle a
    println("totalBagsDived $totalBagsDived")

    val twoKgCalculation=totalKg-totalBagsDived//total sesCalculation mathi lastSes bad kravathi ketla mle a
    println("twoKgCalculation $twoKgCalculation")

    val checkQuotientOddEven=twoKgCalculation/twoKgBag//QuotientOddEven odd mle k even
    println("checkQuotientOddEven $checkQuotientOddEven")

    if(checkQuotientOddEven % 2 == 0){//even value hoy to aani ander jay 2 kg calculation mate
        //aani ander mle to 5 ne total calculation sathe bhangi ski 2 nu calculation chhe
        val totalTwoKgBag=totalKgMinus/twoKgBag//2 killo vari ketli theli mle enu calculation
        println("twoKgTotal $totalTwoKgBag")
        println("5 Kg 1 Total Bags $fiveKgQuotientTotalBag")
        println("2 Kg 1 Total Bags $totalTwoKgBag")

    }else{
        val fiveTotalKg=sesCalculation-fiveKgBag
        println("fiveTotalKg $fiveTotalKg")

        val twoKg=totalKg-fiveTotalKg
        println("twoKg $twoKg")

        val totalFiveKgBag=fiveTotalKg/fiveKgBag
        println("totalFiveKgBag $totalFiveKgBag")

        val totalTwoKgBag=twoKg/twoKgBag
        println("twoKgTotal $totalTwoKgBag")

        println("5 Kg Total Bags $totalFiveKgBag")
        println("2 Kg Total Bags $totalTwoKgBag")

    }
}