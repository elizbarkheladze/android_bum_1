fun main(){
    var examplestring = "ragac"
    var examplestring2 = "alla"
    fun palindromCHeker(args: String) {
        var reverseString = ""
        var length = args.length

        for (i in (length - 1) downTo 0) {
            reverseString = reverseString + args[i]
        }
        if (args.equals(reverseString, ignoreCase = true)) {
            println("strig is Palindrome")
        } else {
            println("string is not Palindrome")
        }
    }
//    *****************************************************************************************************8]
//    ##აქ ვეცადე ჯერ ცარიელ მასივიში დამემატებინა ლუწ ადგილზე მდგომები მაგრამ რატომღაც არ გამოგმდის :დ
// palindromCHeker(examplestring);
//    palindromCHeker(examplestring2);
//    var masivii : IntArray = intArrayOf(10, 20, 30, 40,50,20)
//    fun arrayLuwi(masivi: IntArray) : Double {
//
//        for ( i in 0..(masivi.size-1) step 2 ) {
//            var luwArrays = arrayOf<Int>()
//            luwArrays = append(luwArrays, masivi[i])
//        var mean : Double = luwArrays.average()
//        return mean
//        }
//        return arrayLuwi(masivi)
//    }
//    ***********************************************************************************************

    var masivii : IntArray = intArrayOf(10, 20, 30, 40,50,20,30)
    fun arrayLuwi(masivi: IntArray): Int {
        var sum : Int = 0
        var warning : Int = 0
        var count :Int = 0

            for ( i in 2..(masivi.size-1) step 2 ) {
                sum = sum + masivi[i]
                count = count + 1
            }
            var mean : Int = sum/count
            return mean
    }
    print(arrayLuwi(masivii))

}