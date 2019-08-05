public class homework_8_2_3 {
    public static void main(String[] args) {
        String s = "123456789012";

        int c1 = 0;

        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {

            int n = Integer.valueOf(s.substring(i, i + 1));

            if (i % 2 == 0)
                c1 += n;
            else
                c2 += n;
        }
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
}
