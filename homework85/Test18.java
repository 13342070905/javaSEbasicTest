package Homewrok;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner years= new Scanner(System.in);
        System.out.println("请输入年份");
        int year =years.nextInt();
        if (year%4==0){
            System.out.println("闰年好");
        }else {
            System.out.println("好好过年");
        }
    }
}
