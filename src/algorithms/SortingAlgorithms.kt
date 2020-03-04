package algorithms

class SortingAlgorithms {
    fun Array<Int>.extInsertionSort(): Array<Int> {
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

    private fun Array<Int>.merge(p: Int, q: Int, r: Int) {
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

    fun Array<Int>.extMergeSort(p: Int, r: Int): Array<Int> {
        if (p < r) {
            val q = (p + r) / 2
            this.apply {
                extMergeSort(p, q)
                extMergeSort(q + 1, r)
                merge(p, q, r)
            }
        }
        return this
    }


    fun Array<Int>.extQuickSort(p: Int, r: Int): Array<Int> {
        if (p < r) {
            var q: Int = this.partition(p, r)
            this.apply {
                extQuickSort(q + 1, r)
                extQuickSort(p, q - 1)
            }
        }
        return this
    }

    private fun Array<Int>.partition(p: Int, r: Int): Int {
        var x = this[r]
        var i = p - 1
        for (j in p until r) {
            if (this[j] <= x) {
                i++
                this.swapArray(i, j)
            }
        }
        this.swapArray(i + 1, r)
        return i + 1
    }

    private fun Array<Int>.swapArray(b: Int, c: Int) {
        val temp = this[b]
        this[b] = this[c]
        this[c] = temp
    }
}