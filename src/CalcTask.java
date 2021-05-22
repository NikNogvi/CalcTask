import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;
//Задание калькулятор
public class CalcTask {
    public static void main(String[] args) {
        Operation calculation = new Operation();//объкт Класс для вызова функции, которая производит операции вычисления
        Error error = new Error();//объкт Класс для обработки ошибок
        Output output = new Output(); //объкт Класс для вывода результата
        RomeToArab rta = new RomeToArab(); //  объкт Класс для вывода ответа в виде римских цифр
        Numbers num = new Numbers();

        System.out.println("Калькулятор умеет работать с арабскими и римскими цифрами." + "\n" + "Введите пример в одну строчку, через пробел (Например:\"1 + 2\") " + "\n" + "Числа должны быть целыми в диапозонах от 1-10 или от I до X." + "\n" + "Одновременно должны быть либо арабские, либо римские цифры.");
        // Условия работы

        System.out.print("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String enter = sc.nextLine();

        String[] strSplit = enter.split(" "); // Режу строку на все значения, кроме проблов и они получают индекс

        // boolean isArab = strSplit[0].matches("^([1-9]|1[0])$");  // Провеяем какой вид числа, если true, то это число арабское
        if (strSplit.length!=3) {
            System.out.println("Пропущены пробелы");
            System.exit(0);
        }
        boolean isArab = strSplit[0].matches( "(?<numbers>[0-9]+)");
        //boolean isArabMatch = strSplit[2].matches("^([1-9]|1[0])$");
        boolean isArabMatch = strSplit[2].matches("(?<numbers>[0-9]+)");
        boolean isRome = strSplit[0].matches("\\b[I II III IV V VI VII VIII IX X]*");  // Проверяем на римские цифры, true дает нам римские цифры.
        boolean isRomeMatch = strSplit[2].matches("\\b[I II III IV V VI VII VIII IX X]*");
        boolean isOperator = strSplit[1].matches("[+-/*]");
        // Звездочка в конфе разрешает искать совпадение до бесконечности

        error.isError(isOperator,strSplit);// Проверяем ошибки

        List romeNum = Arrays.asList(new String[] {"I", "II", "III","IV","V","VI","VII","VIII","IX","X"});
        List arabNum = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        //Создал листы вместо массивов, чтобы использовать метод indexOf() и избежать цикла по поиску числа

        num.numCount(isRome,isRomeMatch,isArab,isArabMatch,romeNum,arabNum,strSplit);// метода для получения чисел из строки
        int valueOne=num.valueOne;
        int valueTwo = num.valueTwo;

        char operator = strSplit[1].charAt(0); // Вытаскиваем знак операции из строки

        int result=calculation.operatorResult(operator,valueOne,valueTwo); //Вызов метода для подсчета

        String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"}; // Уникальные цифры Римские
        int[] arab = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100};

        String resultRome = rta.isRomeToArabe(result,isRome,arab,romans); // Метод, выводящий результат римскими цифрами + при отрицательном значении добавляет минус к римскому результату
        boolean MINUS = rta.MINUS; // возвращаем минус или не минус, для понимания отрицательный ответ или нет
        output.output(isArab,isRome,result,MINUS,resultRome);// Ответ

    }

}

