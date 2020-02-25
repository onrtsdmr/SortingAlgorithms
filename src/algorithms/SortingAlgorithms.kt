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
    fun Array<Int>.merge(p: Int, q: Int, r: Int) {
        val left = this.copyOfRange(p, q + 1)
        val right = this.copyOfRange(q + 1, r + 1)
        var i = 0
        var j = 0

        for (k in p..r) {
            if ((i <= left.size - 1) && ((j >= right.size) || (left[i] <= right[j]))) {
                this[k] = left[i];
                i++;
            } else {
                this[k] = right[j];
                j++;
            }
        }
    }
    fun Array<Int>.mergeSort(p: Int, r: Int) : Array<Int>{
        if (p < r) {
            val q = (p + r) / 2
            this.apply {
                mergeSort(p,q)
                mergeSort(q+1,r)
                merge(p,q,r)
            }
        }
        return this
    }
}