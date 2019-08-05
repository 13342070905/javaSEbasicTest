import java.util.Arrays;

public class homework_8_2 {
    public static void main(String[] args) {
        String s = "统计一个字符在字符串中的所有位置";
        char k = '字';
        System.out.println(Arrays.toString(count(s, k)));
    }

    public static int[] count(String str, char key) {
        int[] count = {};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == key) {

                count = Arrays.copyOf(count, count.length + 1);

                count[count.length - 1] = i;
            }
        }
        return count;
    }
} 