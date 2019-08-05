package Homewrok;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
 double bon1= 100000*0.1;
   double     bon2=100000*0.075;
      double  bon4=200000*0.05;
       double bon6=200000*0.03;
      double  bon10=400000*0.015;

    Scanner money= new Scanner(System.in);
    double Money = money.nextInt();
    double meMoney = 0;
 if (Money<=100000){
     meMoney =Money*0.1;

 }
 else if (Money<=200000 && Money>100000){
     meMoney=bon1+(Money-100000)*0.075;
 }else if (Money<=400000&&Money>200000){
     meMoney=bon1+bon2+(Money-200000)*0.05;
 }else if (Money<=600000 && Money>400000){
     meMoney=bon1+bon2+bon4+(Money-400000)*0.03;
 }else if (Money<=1000000 && Money>600000){
     meMoney=bon1+bon2+bon4+bon6+(Money-600000)*0.015;

 }else if (Money>1000000){
     meMoney=bon1+bon2+bon4+bon6+bon10+(Money-1000000)*0.01;
 }else {
     System.out.println("您这个月没有工资！");
 }
 System.out.println("您的工资为"+meMoney);
    }
}
