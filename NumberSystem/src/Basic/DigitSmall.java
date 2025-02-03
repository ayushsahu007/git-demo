package Basic;

import java.util.Scanner;

public class DigitSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int small = 9;
        while (n!=0){
            int digit = n%10;
            if (digit<small){
                small = digit;
            }
            n= n/10;
        }
        System.out.println(small);
    }
}
