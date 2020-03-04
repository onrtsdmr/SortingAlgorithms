import algorithms.SortingAlgorithms
import enums.SortingAlgorithmsType
import util.extArrayPrint


fun main() {
    val sortingAlgorithms = SortingAlgorithms()
    val array = arrayOf(10,9,8,7,6,5,4,3,2,1)
    sortingAlgorithms.apply {
        array.extInsertionSort() extArrayPrint SortingAlgorithmsType.INSERTIONSORT.toString()
        array.extMergeSort(0,array.size - 1) extArrayPrint SortingAlgorithmsType.MERGESORT.toString()
        array.extQuickSort(0,array.size-1) extArrayPrint SortingAlgorithmsType.QUICKSORT.toString()
    }
}
