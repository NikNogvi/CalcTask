
//Класс вычислений
public class Operation {
    public int operatorResult (char operator, int valueOne, int valueTwo) {
        int result=0; // Результирующая переменная Арабская

        try {
            switch (operator) {
                case '+':
                    result = valueOne + valueTwo;
                    break;
                case '-':
                    result = valueOne - valueTwo;
                    break;
                case '*':
                    result = valueOne * valueTwo;
                    break;
                case '/':
                    result = valueOne / valueTwo;
                    break;
                default:
                    result = 0;

            } // Математика
        } catch ( Exception e) {
            System.out.println("Delenie na nol");
            System.exit(0);
        } // Проверка на делимость на ноль
        return result;
    }
}
