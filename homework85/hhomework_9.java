package Homewrok;

public class hhomework_9{
    public static void main(String[] args){
        float totalmeters=100;
        float startHeight=100;

        for(int i=1;i<=10;i++){
            startHeight=startHeight/2;

            totalmeters+=startHeight*2;
        }

        System.out.println("totalmeters:"+totalmeters);
        System.out.println("第十次高度："+startHeight*1/2);
    }

}
