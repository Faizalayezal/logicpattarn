fun bubbleSort(arr: IntArray, n: Int) {

    //64, 3, 25, 12, 22, 11, 90
    if (n == 1) return

    for (i in 0 until n - 1) {


        if (arr[i] > arr[i + 1]) {
            val temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp


        }
    }

    bubbleSort(arr, n - 1)
}

//(5, 2, 8, 1, 9, 3
fun sortValuesRecursively(values: MutableList<Int>): List<Int> {
    if (values.size <= 1) {
        return values
    }

    val pivot = values[0]
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()

    for (i in 1 until values.size) {
        if (values[i] <= pivot) {
            left.add(values[i])
        } else {
            right.add(values[i])
        }
    }

    return sortValuesRecursively(left) + listOf(pivot) + sortValuesRecursively(right)
}
fun reverased(){

    val data= listOf(1,2,3,4,5)

    val reversed = mutableListOf<Int>()

    for (i in data.size - 1 downTo 0) {
        reversed.add(data[i])
    }

    println(reversed)
}

/*
final List<int> data = [1, 2, 3, 4, 5];

List<int> reversed = [];

for (int i = data.length - 1; i >= 0; i--) {
    reversed.add(data[i]);
}
print(reversed);*/
