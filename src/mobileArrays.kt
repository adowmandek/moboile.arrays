import java.util.*

fun main() {
        collegenames()
    citiesName()
    numbers()
    var name=names("mandek","sadia","maryan")
    println(Arrays.toString(name))




    }
    fun collegenames() {
        var collegenamesArray= arrayOf("waberi","faulu", "bidii","akirachix")
        println(Arrays.toString(collegenamesArray))

    }
    fun citiesName() {
        var cities=arrayOf("harare","mumbai","dodoma","jakarta")
        println("harare".capitalize())
        println("mumbai".capitalize())
        println("dodoma".capitalize())
        println("jakarta".capitalize())
    }
fun numbers() {
    var numbersarray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
        var sum=numbersarray[2]+numbersarray[5]
    println(sum)
    var index=numbersarray.indexOf(158)
        println(index)
    var sortednumbers=numbersarray.sortedArray()
    println(Arrays.toString(sortednumbers))
}
fun names(name1:String,name2:String,name3:String):Arrays<String> {
    var namesArrays= arrayOf("mandek","sadia","maryan")
    return namesArrays
}

