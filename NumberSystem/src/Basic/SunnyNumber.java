package Basic;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int add = n+1;
        boolean flag = false;
        for (int i = 1;i<=add/2;i++){
            if (i*i==add){
                flag=true;
                break;
            }
        }
        if (flag == true)
            System.out.println("Sunny");
        else System.out.println("Not");

    }
}
