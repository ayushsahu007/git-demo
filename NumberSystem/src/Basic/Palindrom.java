package Basic;

import java.util.Scanner;

public class Palindrom {
    public static int isPalindrom(int n){
        int rev = 0;
        while (n!=0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
         int rev =   isPalindrom(n);
         if (rev == n){
             System.out.println("Palindrom");
         }else
             System.out.println("Not palindrom");


    }
}
