package Homewrok;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Random num1 = new Random();
        Random num2 = new Random();
        int x=num1.nextInt();
        int y=num2.nextInt();
        if (x>y){
            System.out.print("X的值"+x);
        }else {
            System.out.print("Y的值"+y);
        }

    }
}
