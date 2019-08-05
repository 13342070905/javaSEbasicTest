package Homewrok;

/*
 * 打印出100-999之间所有的水仙花数, 例如：153是一个"水仙花数"，
 * 因为153=1的三次方＋5的三次方＋3的三次方
 */

public class hhomework_7{
    public static void main(String[] args) {
        System.out.println("100-999之间的水仙花数有：");
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (i == (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)) {
                System.out.println(i);
            }
        }
    }
}
