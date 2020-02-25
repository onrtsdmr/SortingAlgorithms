package util

infix fun Array<Int>.extArrayPrint(algorithmName: String) {
    println("   $algorithmName   ")
    println("--------------------")
    for (i in this.indices) {
        println("${i+1}.-> ${this[i]}")
    }
}

