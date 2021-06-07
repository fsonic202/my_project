fun main(){
    var name1 :  Int = 1
    var name2 :  Boolean
    var name1 :  Double = 2334.094
    var name3 :  Long = 2344555666
    var name4 :  Char = "C"
    var name5 :  Short =
    var name6 :  Byte =
    var name7 :  Float = 7.363f
    var name8 :  String = "Felix"
    var name9 :



    var number1 : Int = 10
    var number2 : Int = 3

    var result : Int = number1 % number2
    println(result)

    var fnum : Int
    fnum = 6776545
    var snum : Int
    snum = 100000

    var total = fnum + snum
    println(total)


    var FirstName : String = "Oseh Onyemaechi"
    var LastName : String = "Felix"
    var age : Int = 56
    var salary : Double = 4587.0
    var sentence = "My Name is " + FirstName + " " + LastName + ", I am " +age+ " year  old, and I earn " + salary +"."
    println(sentence)



    var noOfChars : Int = FirstName.length
    print(noOfChars)

    var letter : Char = FirstName.get(2)
    println(letter)

    var isEquals : Boolean = FirstName.equals("Oseh Onyemaechi")
    println(isEquals)

    var isEqualss : Boolean = FirstName.equals("Dennis")
    println(isEqualss)

    var result  : Int = addition(1000, 2345)
    println(result)
    println(addition(2345, 8765))

    var agess = 30
    if(agess >= 12){
        println("Welcome! Your Are Successfully Login")

    }
    else{
        println("Error  Login Details")
    }
}

fun addition(fnum : Int, snum : Int) : Int{
    return fnum + snum
}

