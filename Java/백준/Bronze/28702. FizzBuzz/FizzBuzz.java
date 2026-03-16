import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = sc.next();
        }

        for (int i = 0; i < 3; i++) {
            String s = inputs[i];

            if (s.charAt(0) != 'F' && s.charAt(0) != 'B') {
                long n = Long.parseLong(s);
                long target = n + (3 - i);

                printFizzBuzz(target);

                sc.close();
                return;
            }
        }
    }

    private static void printFizzBuzz(long n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}