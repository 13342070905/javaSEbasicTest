package Homewrok;

public class Test10 {
    public static void main(String[] args) {
        int sum=0;
        for (int a=1;a<100;a++){
            if(a%2!=0){
                sum+=a;
            }else {
                continue;
            }
        }System.out.println(sum);
    }
}
