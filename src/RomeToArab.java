// Класс для получения ответа в виде Римских цифр
public class RomeToArab {
    boolean MINUS = false;// Переменная для определения меньше ли ноля ответ

    int resultModul = 0;

    int times =0; // Остаток от деления
    String resultRome = new String(); // Ответ римскими цифрами

    public String isRomeToArabe (int result, boolean isRome, int [] arab, String romans []) {
        int count = arab.length - 1;

//Сделаем результирующую по модулю, если она меньше нуля
        if (result < 0) {
            resultModul = result * (-1);
            MINUS = true;
        } else {
            resultModul = result;
        }


        if (isRome==true) {
            for (int i = count; i >= 0; i--) {
                times = resultModul / arab[i];

                resultModul = resultModul % arab[i];

                while (times > 0) {
                    resultRome = resultRome + (romans[i]);
                    times--;
                }
            }
        } // Перевод арабских цифр в римские
        return resultRome;
    }

}
