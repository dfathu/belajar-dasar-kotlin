fun main() {
    println("Integer Number")
    integerNumber()
    println()
    println("Floating Point Number")
    floatingPointNumber()
    println()
    println("Literal Number")
    literalNumber()
    println()
    println("UnderScore")
    underScore()
    println()
    println("Conversion Number")
    conversionNumber()
}

fun integerNumber() {
    var age: Byte = 30 // min_value -128 max_value 128 bit 8bits
    println(age)
    var height: Int = 170 // min_value -2pangkat31 max_value 2pangkat31 bit 32bits
    println(height)
    var distance: Short = 2000 // min_value -32768 max_value 32768 bit 16bits
    println(distance)
    var balance: Long = 1000000000L // bit 64bits min_value -2pangkat63 max_value -2pangkat63
    println(balance)
}

fun floatingPointNumber() {
    var value: Float =  10.11F // bit 32bits decimal_digit 6-7
    println(value)
    var radius: Double = 100.19999 // bit 64bits decimal_digit 15-16
    println(radius)
}

fun literalNumber() {
    var decimalLiterals : Int = 100
    println(decimalLiterals)
    var hexadecimalLiterals : Int = 0xFF
    println(hexadecimalLiterals)
    var binaryLiterals: Int = 0b010101010
    println(binaryLiterals)
}

fun underScore() {
    // untuk mempermudah dalam mendeskripsikan nilai
    var age: Byte = 3_0 // min_value -128 max_value 128 bit 8bits
    println(age)
    var height: Int = 1_7_0 // min_value -2pangkat31 max_value 2pangkat31 bit 32bits
    println(height)
    var distance: Short = 2_000 // min_value -32768 max_value 32768 bit 16bits
    println(distance)
    var balance: Long = 1_000_000_000L // bit 64bits min_value -2pangkat63 max_value -2pangkat63
    println(balance)
}

fun conversionNumber() {
    var number: Int = 100
    var binaryLiterals: Int = 0b010101010
    // conversion
    var byte: Byte = number.toByte()
    println(byte)
    var short: Short = number.toShort()
    println(short)
    var int: Int = number.toInt()
    println(int)
    var long: Long = number.toLong()
    println(long)
    var float: Float = number.toFloat()
    println(float)
    var double: Double = number.toDouble()
    println(double)
    var doubleBinary: Double = binaryLiterals.toDouble()
    println(doubleBinary)
}