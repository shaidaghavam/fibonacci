
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = null;
        do {
            System.out.print("Enter a Number: ");
            int n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.print("\nTry Again? Y/N: ");
            c = input.next();
        } while (c.equalsIgnoreCase("y"));
    }
}