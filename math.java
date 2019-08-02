import java.util.Scanner;

public class math {
    public static void main(String[] args) {
//        int a=2;
//        System.out.println(a++ + a++);
//        System.out.println(a);

        // test
        int c=48;
        char n=(char)(c+'0');
        char z='中';
        int m=z;
        System.out.println(n+"+"+m);
            // test2
        Scanner scanner=new Scanner(System.in);
        int score = scanner.nextInt();
        if (score>100||score<0){
            System.out.println("superman");
        }
        else  if (score>=90&&score<=100){
            System.out.println("优秀");
        }
        else if (score>=80&&score<90){
            System.out.println("良好");
        }
        else{
            System.out.println("不及格");
        }




        }


    }

