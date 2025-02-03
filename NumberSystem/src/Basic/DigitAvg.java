package Basic;

import java.util.Scanner;

public class DigitAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int sum = 0;
         int count = 0;
         while (n!=0){
             int digit = n%10;
             sum+=digit;
             count++;
             n=n/10;
         }
         int avg =sum/count;
        System.out.println("Avarage "+avg);
    }
}
