package Basic;

import java.util.Scanner;

public class DIgitLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int lagre = 0;
        while (n!=0){
            int digit = n%10;
            if (digit>lagre){
                lagre = digit;
            }
            n= n/10;
        }
        System.out.println("Largest digit is "+lagre);
    }
}
