fun main(args: Array<String>) {
    println("********************************\n"
            + "\t THIS IS 6th task\t\n"
            + "*******************************\n\n"
            + "\t- Please, enter any first number\t\r\n\n");

    var a: Double = readLine()!!.toDouble();

    println("*******************************\n\n"
            + "\t you type : ${a.toString()}\n"
            + "\t- Please, enter any second number\t\r\n\n");

    var b: Double = readLine()!!.toDouble();



    var result = a > b

    println("*******************************\n\n"
            + "\t you type : ${b.toString()}\n"
            + "\t- The first variable[${a.toString()}] is greater than second[${b.toString()}], it's $result\t");

}