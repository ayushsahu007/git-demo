package Basic;

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number 1  ");
        int a = sc.nextInt();
        System.out.println("Enter a Number 2 ");
        int b = sc.nextInt();
        System.out.println("Enter a Number 3 ");
        int c = sc.nextInt();
        int res = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest Number is "+res);
    }
}
