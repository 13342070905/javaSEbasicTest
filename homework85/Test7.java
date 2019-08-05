package Homewrok;

public class Test7 {
    public static void main(String[] args) {
        int a =1;
        int sum = 0;
        while (a<100){
            if (a%2!=0){
                sum=sum+a;
                a++;

            }
            else {

                    a++;
            }
        } System.out.println(sum);
    }
}
