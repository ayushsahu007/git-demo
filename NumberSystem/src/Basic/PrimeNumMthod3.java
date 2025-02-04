package Basic;

import java.util.Scanner;

public class PrimeNumMthod3 {
    public static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        boolean flag = true;
        for (int i=2;i<x;i++){
            if (x%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        boolean res = isPrime(n);
        if (res == true){
            System.out.println("number is Prime");
        }
        else
            System.out.println("Number is Not Prime");
    }
}
