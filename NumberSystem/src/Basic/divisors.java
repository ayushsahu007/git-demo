package Basic;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
