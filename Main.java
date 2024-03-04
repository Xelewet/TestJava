import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random randomNumber = new Random();
        int rnd = randomNumber.nextInt(100) + 1;
        System.out.println("Я загадал число от 1 до 100(включительно)");
        int tr = 8;
        boolean ok = false;
        for (int i = 0; i < tr; i ++) {
            //change
            int num = cin.nextInt();
            if (num > rnd) {
                System.out.println("Мое число меньше.");
            } else if (num < rnd) {
                System.out.println("Мое число больше");
            } else {
                System.out.println("Ты угадал!!!");
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Ты не угадал. Попробуй использовать бинарный поиск!");
        }
    }
}