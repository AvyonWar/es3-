fun main(){ 
    val num1/*: Float */ = 5.5f  
    val num2/*: Double */ = 6.002
    val num3/*: Long */ = 500000009993 
    val num4 = "7777"
    
    val result = ((num1 + num2) / num3) * num4.toInt()
    println("Result is $result")
    
    //Result is 1.789021044244625E-7  ------>  senza specificare i valori
    //Result is 1.789021044244625E-7  ------>  specificando i valori
    
    val comparation = num1 < num2
    val comparation1 = num1 > num2
    
   // val comparation2 = num1 == num2  // *
   // val comparation3 = num1 != num2  // *

    
    println("is < ? - $comparation")
    println("is > ? - $comparation1")
    
   // println("is == ? - $comparation2")  // Operator '==' cannot be applied to 'Float' and 'Double'
   // println("is != ? - $comparation3")  // Operator '!=' cannot be applied to 'Float' and 'Double'
    
    
    val isResultDouble = result !is Double
    println("Is Double? - $isResultDouble")
    
   // val isResultInt = result is Int
   // println("Is Integer? - $isResultInt")  // Incompatible types: Int and Double
    
   // val isResultFloat = result is Float
   // println("Is Float? - $isResultFloat")  // Incompatible types: Float and Double

}
