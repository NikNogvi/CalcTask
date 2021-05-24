//Класс ошибок
public class Error {

    public void IsErrorSpace (String enter) {
        int countSpace = 0;
        char[] space = enter.toCharArray();
        for (int i = 1; i < enter.length(); i++) {
            if (space[i]==' ') {
                countSpace++;
            }
        }
        if (countSpace>2){
            System.out.println("Лишние пробелы");
            System.exit(0);
        } else if (countSpace<2) {
            System.out.println("Недостает пробелов");
            System.exit(0);
        }
        // Если пробелов многовато
    }

    public void isError (boolean isOperator, String [] strSplit) {

        if (strSplit.length != 3) {
            System.out.println("Должна быть всего одна операция");
            System.exit(0);
        } // Проверяем кол-во операций

        if (!isOperator) {
            System.out.println("Неверно введен математический оператор");
            System.exit(0);
        } // Проверяем математический знак
    }

}
