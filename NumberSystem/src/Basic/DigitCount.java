package Basic;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int count = 0;
        while (n!=0){
            int digit = n%10;
            count++;
            n = n/10;
        }
        System.out.println("COunt = "+count);
    }
}
