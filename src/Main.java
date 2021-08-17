import java.util.Scanner;

public class Main {
    static int enterNumber() {
        Scanner in = new Scanner(System.in);
        int guessNumber;
        boolean correct = false;
        do {
            guessNumber = in.nextInt();
            if (guessNumber >=1&&guessNumber <=100) correct = true;
            else System.out.println("Число должно быть от 1 до 100. Попробуйте еще раз:");
        } while (!correct);
        return guessNumber;
    }

    public static void main(String[] args) {
        int trueNumber = (int) (Math.random() * 100 + 1);
        //System.out.println(trueNumber);
        int guessNumber;
        int i = 1;
        boolean success = false;
        System.out.println("Угадайте случайное число от 1 до 100:");
        guessNumber = enterNumber();
        if (guessNumber == trueNumber) success = true;
        while (!success) {
            if (guessNumber > trueNumber) {
                System.out.println("Введенное число больше загаданного. Попробуйте еще раз:");
                guessNumber = enterNumber();
                i++;
            } else if (guessNumber < trueNumber) {
                System.out.println("Введенное число меньше загаданного. Попробуйте еще раз:");
                guessNumber = enterNumber();
                i++;
            }
            else success = true;
        }
        System.out.print("Вы угалади! Потребовалось " + i + " попыток. ");
        if (i<=7) System.out.println("Молодец!");
        else if (i<13) System.out.println("Хорошая работа!");
        else System.out.println("Можно и лучше.");
    }
}
