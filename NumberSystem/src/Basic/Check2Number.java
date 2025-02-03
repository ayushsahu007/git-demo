package Basic;

import java.util.Scanner;

public class Check2Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number   ");
        int num = sc.nextInt();
        int count = 0;
        while (num!=0){
            int digit = num%10;
            count++;
            num= num/10;
        }
       if (count==2){
           System.out.println("2 num");
       }
       else System.out.println("not 2 digit number");
 //Another way to print
      String res = num >10 && num<=99 ?"two dgit num ":"not 2 digit";
        System.out.println(res);
    }
}
