package util

infix fun Array<Int>.extArrayPrint(algorithmName: String) {
    println("   $algorithmName   ")
    print("--------------------\n[ ")
    for (i in this.indices) {
        print("${this[i]} ")
    }
    print("]\n")
}

