// Класс для получения Римских или арабских чисел из строки и проверки соответствия их диапазону значений
import java.util.List;

public class Numbers {
    int valueOne=0;
    int valueTwo =0;
    int place=0; // Переменная для задания места в Списке и поиска по нему значений Римских->Арабские


    public void numCount (boolean isRome, boolean isRomeMatch,boolean isArab,boolean isArabMatch,List romeNum,List arabNum, String strSplit[]) {

        if(isRome==true && isRomeMatch==true) {
            try {
                place=romeNum.indexOf(strSplit[0]);
                valueOne = (int) arabNum.get(place);
                place=romeNum.indexOf(strSplit[2]);
                valueTwo = (int) arabNum.get(place);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за диапазон допустимых значений");
            } // Выход за диапазон от 1 до 10 римских цифр

        }   // Переворачиваем Римские цифры в арабские
        else if(isArab==true && isArabMatch==true   ) {

            valueOne = Integer.parseInt(strSplit[0]);
            valueTwo = Integer.parseInt(strSplit[2]);
            if (valueOne<1 || valueOne>10 || valueTwo<1 || valueTwo>10){
                System.out.println("Вы вышли за диапазон допустимых значений");
                System.exit(0);
            }// // Выход за диапазон от 1 до 10 арабских цифр
        } // Задали арабские цифры. Из строки перевели в целочисленные
        else {
            System.out.println("Введены значения, несоответствующие условиям");
            System.exit(0);
        }  // Проверяем одинаковые ли цифры введены
    }
}


