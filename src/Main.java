import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        long x = 0, y = 1, z = 0, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to continue[n]:");
        n = input.nextInt();
        System.out.print(x+"\t" + y);
        for (int i = 2; i <= n; i++) {
            z = x + y;
            System.out. print ("\t" + z);
            x = y;
            y = z;
        }
        System.out.println("\nFibonancci(" + n + ") is " + z);

    }
}