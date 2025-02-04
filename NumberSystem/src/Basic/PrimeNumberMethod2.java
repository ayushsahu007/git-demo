package Basic;

import java.util.Scanner;

public class PrimeNumberMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2;i<n;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("Prime no");
        else
            System.out.println("Not prime no");
    }
}
