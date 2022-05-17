fun main(): Unit {
    var nama: String = "Fathu Danur Prabaswara"
    var usia: Int = 13
    var alamat: String = """
        |Jln. Bendungan Hilir gang 7 dalam
        |No.155A RT/RW 004/001
        |Tanah Abang, Jakarta Pusat
       """.trimMargin()
    //atau
    var alamat2: String = """
        >Jln. Bendungan Hilir gang 7 dalam
        >No.155A RT/RW 004/001
        >Tanah Abang, Jakarta Pusat
       """.trimMargin(">")
    //atau
    println(nama)
    println(usia)
    println(alamat)
    println("alamat part 2 : \n$alamat2")
}