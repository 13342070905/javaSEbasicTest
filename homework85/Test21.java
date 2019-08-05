package Homewrok;

import java.util.Arrays;

public class Test21 {
    public static void main(String[] args) {
        String[]neusoft={"neusofteducation"};
        String[]copy= new String[neusoft.length];
        System.arraycopy(neusoft,0,copy,0,neusoft.length);
        System.out.println(Arrays.toString(copy));
    }
}
