import java.util.Scanner;

public class function {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int i  =   scanner.nextInt();
        int i1 = scanner.nextInt();
        int i2 =getCutts(i,i1);
        System.out.println(i2);


    }

    private static int getCutts(int i, int i1) {
        int sum=i-i1;
        return sum;
    }




    }

