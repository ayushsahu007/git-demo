package Basic;

import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n)
        {
            System.out.println("Number is Perfact");
        }
        else
        {
            System.out.println("Number is not Perfact");
        }
    }
}
