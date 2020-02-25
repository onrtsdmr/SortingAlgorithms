package algorithms

class SortingAlgorithms {
    fun Array<Int>.insertionSort(): Array<Int> {
        for (i in 1 until this.size) {
            val key = this[i]
            var j = i - 1
            while (j >= 0 && key < this[j]) {
                this[j + 1] = this[j]
                j--
            }
            this[j + 1] = key
        }
        return this
    }
    fun mergeSort(){

    }
}