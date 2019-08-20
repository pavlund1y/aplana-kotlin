fun main(args: Array<String>) {
    println("********************************\n"
            + "\t THIS IS 8th task\t\n"
            + "*******************************\n"
            + "\t- Пожалуйста введите начальную сумму вклада?\t\r\n\n");

    var start:Double = readLine()!!.toDouble();
    if(start < 1) {
        throw RuntimeException("Введено неверное значение суммы")
    }


    println("*******************************\n"
            + "\t- Пожалуйста введите срок вклада в месяцах?\t\r\n\n");

    var term:Int = readLine()!!.toInt();
    if(term < 1) {
        throw RuntimeException("Неверный срок вклада")
    }

    println("*******************************\n"
            + "\t- Пожалуйста введите ежемесячный процент по вкладу?\t\r\n\n");

    var percent:Double = readLine()!!.toDouble();
    if(percent < 0) {
        throw RuntimeException("Неверная процентная ставка")
    }

    for(n in 1..term){
        var doubt:Double = start * (percent*0.01)
        start = start + doubt;
        println("Доход в ${n} месяце: ${doubt}, \tИтоговая сумма на вкладе: ${start}")

    }
    println("Расчет актуален в случае капитализации процентов на вкладе!")
}