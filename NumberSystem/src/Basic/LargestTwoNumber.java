package Basic;

import java.util.Scanner;

public class LargestTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number 1  ");
        int a = sc.nextInt();
        System.out.println("Enter a Number 2 ");
        int b = sc.nextInt();
        int c = a>b?a:b;
        System.out.println("Largest number is "+c);
    }
}
