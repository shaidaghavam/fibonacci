

import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]){
        int i,m=0,flag=0;
        Scanner input = new Scanner ( System.in );
        int inputNum= input.nextInt ();//input number
        i = 2;
        m=inputNum/2;
        if(inputNum==0||inputNum==1){
            System.out.println(inputNum+"it is not a prime number");
        }else{
            while(i<=m){
                if(inputNum%i==0){
                    System.out.println(inputNum+"it is not a prime number");
                    flag=1;
                    break;
                }
                i++;
            }
            if(flag==0)  { System.out.println(inputNum+" it is a prime number"); }
        }//پایان else
    }
}

