
fun main(cod:Array<String>) {
    var code = readLine()!!.toString()
    if (code == 257.toString()) {
        println("open")
    } else {
        println("Closed")
    }
    ma(arrayOf())
 }

fun ma(args: Array<String>) {
    var hour = readLine()!!.toInt()
    if(hour<=18){
        println("Open")
    }
    else {
        println("Closed")
    }

}



