package Basic;

import java.util.Scanner;

public class PrimeNumRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lower Range  ");
        int a = sc.nextInt();
        System.out.println("Higher Range ");
        int b = sc.nextInt();
        for (int i = a;i<b;i++){
            if(a%i==0){
                System.out.println(i);
            }
            a++;
        }

    }
}
