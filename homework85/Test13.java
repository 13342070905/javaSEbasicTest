package Homewrok;

public class Test13 {
    public static void main(String[] args) {
        double a=30000;
        double sum=0;
        for (int i=1;i<10;i++){
            a=a*1.06;
            sum=a+sum;

        }
        System.out.println(a);
        System.out.println(sum);
    }
}
