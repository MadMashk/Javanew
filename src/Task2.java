import java.util.Scanner;
public class Task2 {
    public static void run() {
        int number1 = 0;
        int number2 = 0;
        System.out.println("input two numbers");
        number1 = integerCheck();
        number2 = integerCheck();
        System.out.println(GCD(number1, number2));
        System.out.println(LMC(number1, number2));
    }

    public static int integerCheck() { //Integrity check
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            return input.nextInt();
        } else
            System.out.println("input an integer!");
        return 0;
    }

    public static int GCD(int number1, int number2) { //Greatest common divisor
        int min;
        if (number1 < number2)
            min = number1;
        else
            min = number2;
        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0)
                return i;
        }
        return 0;
    }

    public static int LMC(int number1, int number2) { //Least common multiple
        int max;
        if (number1 > number2) max = number1;
        else max = number2;
        for (int i = max; max > 0; i++) {
            if (i % number1 == 0 && i % number2 == 0) return i;
        }
        return 0;
    }

}
