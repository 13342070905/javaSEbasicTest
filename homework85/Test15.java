package Homewrok;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("请输入！");
        int a = num.nextInt();
        if (a%2==0){
            System.out.println("您输入的是偶数");
        }else {
            System.out.println("您输入的奇数");
        }
    }
}
