package Basic;

import java.util.Scanner;

public class PrimeNumMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int count=0;
        for(int i =1; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Number is Prime");
        }else
            System.out.println("Number is not prime");
    }
}
