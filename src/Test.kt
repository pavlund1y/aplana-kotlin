fun main(args: Array<String>) {

    var total:Int = 0;

    println("********************************\n"
            + "\t THIS IS 7th task\t\n"
            + "*******************************\n\n"
            + "\t- Какая планета явлеяется 3-ей в Солнечной системе?\t\r\n\n");
    // 1 st
    var s1: String = readLine()!!;

    if(s1.toLowerCase().equals("земля")) {
        total = total + 1;
        println("It's true!\n")
    } else {
        println("It's false\n")
    }

    println("*******************************\n\n"
            + "\t- Назовите название единственного естественного спутника Земли?\t\r\n\n");

    // 2 nd
    s1 = readLine()!!;
    if(s1.toLowerCase().equals("луна")) {
        total = total + 1;
        println("It's true!\n")
    } else {
        println("It's false\n")
    }

    println("*******************************\n\n"
            + "\t- Сколько всего планет в Солнечной системе?\t\r\n\n");

    // 3 rd
    s1 = readLine()!!;
    if(s1.toLowerCase().equals("8")) {
        total = total + 1;
        println("It's true!\n")
    } else if (s1.toLowerCase().equals("восемь")) {
        total = total + 1;
        println("It's true!\n")
    } else {
        println("It's false\n")
    }

    println("*******************************\n\n"
            + "\t- Какая звезда является главным компонентом Солнечной системы?\t\r\n\n");

    // 4 th
    s1 = readLine()!!;
    if(s1.toLowerCase().equals("солнце")) {
        total = total + 1;
        println("It's true!\n")
    } else {
        println("It's false\n")
    }


    println("*******************************\n\n"
            + "\t- Какая планета была открыта в 1801 году итальянским астрономом Джузеппе Пиацци?\t\r\n\n");

    // 5 th
    s1 = readLine()!!;
    if(s1.toLowerCase().equals("церера")) {
        total = total + 1;
        println("It's true!\n")
    } else {
        println("It's false\n")
    }

    var result:String = ""
    when(total) {
        0 -> result = "Завтра с родителями!"
        1 -> result = "Слабо!"
        2 -> result = "Садитесь, двойка!"
        3 -> result = "Сдал!"
        4 -> result = "Хорошо!"
        5 -> result = "Отлично!"
    }

    result = if(total < 3)"Не успешно, "+result else "Успешно, "+result;

    println("*******************************\n\n"
            + "\t- Ваша оценка: \n\n ${result}");

}