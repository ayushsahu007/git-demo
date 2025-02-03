package Basic;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int sum =0;
        int pro =1;
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n=n/10;
        }
        if (sum == pro)
            System.out.println("number is Spy");
        else
            System.out.println("number is not spy");
    }
}
