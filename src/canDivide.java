import java.util.Scanner;

public class canDivide {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner ( System.in );
        int data = input.nextInt ();
        for(int i=1; i<=data; i++) {
            if(data%i == 0){
                System.out.println("Divisor of number"+ data +  "equal" + i);
            }
        }

    }
}

 /*public  class canDivide {
    public static void main(String args[]) {
        System.out.println("\nDivided by 3: ");


        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n");
    }
}

*/