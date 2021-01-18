import java.util.Scanner;
public class Task1 {
    static int check = 2;
    public static void run() {

        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println("input a number");
        if (input.hasNextInt()) {
            number = input.nextInt();
            System.out.println("The number is: ");
            evenOrOdd(number);
            primeOrComposite(number);
        } else System.out.println("input an integer!");

    }

    public static void evenOrOdd(int number) { //even check
        if (number % 2 == 0) System.out.print("even, ");
        else System.out.print("odd, ");
    }

    public static void primeOrComposite(int number) { //prime check
        if (number == 1) System.out.println("\n" + "The number 1 is neither prime nor composite");
        else {
            if (number % check != 0) {
                ++check;
                primeOrComposite(number);
            } else if (number % check == 0) {
                if (check == number) System.out.println("prime.");
                else System.out.println("composite");
            }
        }
    }
}
