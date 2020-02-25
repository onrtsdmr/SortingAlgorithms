package enums

enum class SortingAlgorithmsType {
    INSERTIONSORT{
        override fun toString(): String {
            return "Insertion Sort"
        }
    },
    MERGESORT{
        override fun toString(): String {
            return "Merge Sort"
        }
    },
    QUICKSORT{
        override fun toString(): String {
            return "Quick Sort"
        }
    }
}