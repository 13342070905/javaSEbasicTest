package Homewrok;

import java.util.Random;

public class Test12 {
    public static void main(String[] args) {
        Random text = new Random();
        int a =text.nextInt(101);
        switch (a/10){
            case 10:
                System.out.println(a+"优秀");
                break;
            case 9:
                System.out.println(a+"优秀");
                break;
            case  8:
                System.out.println(a+"B");
                break;
            case 7:
                System.out.println(a+"C");
                break;
            case 6:
                System.out.println(a+"D");
                break;
            default:
                System.out.println(a+"E");
        }
    }
}
