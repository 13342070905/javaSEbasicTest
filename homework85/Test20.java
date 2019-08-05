package Homewrok;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int sum=1;
        int num2 = num.nextInt();
        for (int a=num2;a>=1;a--){
            sum =sum*a;
        }System.out.println(sum);
    }
}
