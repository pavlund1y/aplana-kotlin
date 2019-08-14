
fun main(args: Array<String>) {
    var first:Any? = null;
    first = 12;
    var second = first/2.5;
    // type of 'second' is Double

    var h:String = "hello";
    var a:String = "aplana";
    println("$h $a");

    var five:Char = '5';
    var sFive = five.toString();
    var lFive:Long = sFive.toByte().toShort().toInt().toDouble().toFloat().toLong();
}