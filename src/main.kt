import algorithms.SortingAlgorithms
import enums.SortingAlgorithmsType
import util.extArrayPrint


fun main() {
    val insertionSort = SortingAlgorithms()
    val array = arrayOf(10,9,8,7,6,5,4,3,2,1)
    insertionSort.apply {
        (array.insertionSort()) extArrayPrint SortingAlgorithmsType.INSERTIONSORT.toString()
    }
}