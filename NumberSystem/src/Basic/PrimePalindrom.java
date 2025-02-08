package Basic;

import java.util.Scanner;

public class PrimePalindrom {
    public static boolean isPrime(int n){
        boolean flag = true;
        if (n<0)
            return false;

        for (int i = 2;i<n;i++){
            if (n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int  isPalin(int n){
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
        if (n== isPalin(n) && isPrime(n)==true){
            System.out.println("Number is Prime Palin Drome");
        }
        else
            System.out.println("Number is not Plaindrome");

    }
}
