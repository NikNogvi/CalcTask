//Класс вывода
public class Output {
    public void output(boolean isArab, boolean isRome, int result, boolean isMinus, String resultRome) {
        if (isArab) {
            System.out.println(result);
        }

        if (isRome && isMinus==true) {
            System.out.println("-" + resultRome);
        } else if (isRome && isMinus==false){
            System.out.println(resultRome);
        }

    }
}
