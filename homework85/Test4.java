package Homewrok;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("请输入数字");
        int x = num.nextInt();
        if(x%2 == 0){
            System.out.print("您输入的是偶数");
            System.out.print("X为"+x);
        }else {
            System.out.print("X为"+x);
        }
    }
}
