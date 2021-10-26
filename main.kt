fun main() {
    val input = readLine()!!.toString().split(" ")
    var temp = ""
    for (i in 0..input.lastIndex) {
        if (temp.length < input[i].length) {
            temp = input[i]
        }  
    }
    println("$temp")   
}
