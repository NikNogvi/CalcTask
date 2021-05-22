//Класс ошибок
public class Error {
    public void isError (boolean isOperator, String [] strSplit) {

        if (strSplit.length != 3) {
            System.out.println("Прочитайте условия! Числа должны быть введены через один пробел или должна быть всего одна операция");
            System.exit(0);
        } // Проверяем, есть ли лишние знаки

        if (!isOperator) {
            System.out.println("Неверно введен математический оператор");
            System.exit(0);
        } // Проверяем математический знак
    }

}
