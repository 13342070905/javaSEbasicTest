package homework86;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        game player1=new game();
        player1.usercheck();
        player1.username("name");
        player1.usersex("sex");
        player1.userrace("race");
        player1.userprofessional("professional");
        int a=player1.userpower();
        int b=player1.userstrength();
        int c=player1.useragile();
        int d=player1.userwisdom();
        int e=player1.userred();
        int f=player1.userblue();



            System.out.print("恭喜您"+
                    "的角色创建成功,您的初始属性：力量："+a+"体力："+b+
                    "敏捷："+c+"智力："+d+"血量："+e+"魔法值："+f);


    }
    String name;
    String sex;
    String race;
    String professional;
    int power;
    int agile;
    int strength;
    int wisdom;
    int red;
    int blue;
    int check;
    public int usercheck(){
        Scanner scheck=new Scanner(System.in);
        System.out.print("请您输入您需要的操作： 1.开始游戏   2.游戏规则   3.结束游戏");
        check =scheck.nextInt();
        switch (check){
            case 1:
                System.out.println("欢迎您");
                break;
            case 2:
                System.out.println("游戏规则为：xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                return usercheck();
            case 3:
                System.out.println("再见吧");
                return usercheck();
        }
        return check;
}


    public String username(String uname) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入您想要的昵称");
        String name=scanner.next();
        System.out.println("您的昵称为："+name);
        return name;

    }
    public String usersex(String sex){
        Scanner sexscanner =new Scanner(System.in);
        System.out.println("请您输入您想选择的性别");
        System.out.println("1.男性             2.女性");
        int a=sexscanner.nextInt();
        if (a==1){
            System.out.println("您选择的角色为男性");
            sex="男";
        }else if (a==2){
            System.out.println("您选择的角色为女性");
            sex="nv";
        }else {
            System.out.println("error");
        }
        return sex;
    }
    public String userrace(String race){
        Scanner racescanner =new Scanner(System.in);
        System.out.println("请您输入您想选择的种族");
        System.out.println("1.人类 2.精灵 3.精灵 4. 矮人 5.元素");
        int b=racescanner.nextInt();
        if (b==1){
            System.out.println("您选择的角色为人类");
            race="人类";
        }else if (b==2){
            System.out.println("您选择的角色为精灵");
            race="精灵";
        }else if (b==3){
            System.out.println("您选择的角色为精灵");
            race="精灵";
        }else if (b==4){
            System.out.println("您选择的角色为矮人");
            race="矮人";
        }else if (b==5){
            System.out.println("您选择的角色为元素");
            race="元素";
        }else {
            System.out.println("error");
        }
        return race;

    } public String userprofessional(String professional){
        Scanner professionalscanner =new Scanner(System.in);
        System.out.println("请您输入您想选择的种族");
        System.out.println("1.战士 2.法师 3.弓箭手 4. 爆破师 5.水鬼");
        int c=professionalscanner.nextInt();
        if (c==1){
            System.out.println("您选择的职业为战士");
            professional="战士";
        }else if (c==2){
            System.out.println("您选择的角色为法师");
            professional="法师";
        }else if (c==3){
            System.out.println("您选择的角色为弓箭手");
            professional="弓箭手";
        }else if (c==4){
            System.out.println("您选择的角色为爆破师");
            professional="爆破师";
        }else if (c==5){
            System.out.println("您选择的角色为水鬼");
            professional="水鬼";
        }else {
            System.out.println("error");
        }
        return professional;

    }
    public int userpower(){
        Random rpower =new Random();
        int power =rpower.nextInt(10000);
        return power;
    }
    public int userstrength(){
        Random rstrength =new Random();
        int strength =rstrength.nextInt(10000);
        return strength;
    }
    public int userwisdom(){
        Random rwisdom =new Random();
        int wisdom =rwisdom.nextInt(10000);
        return wisdom;
    }
    public int userred(){
        int ured;
        ured=userstrength();
        int red=ured*20;
        return red;
    }
    public int userblue(){

        int ublue =userwisdom();
        int blue=ublue*20;
        return blue;
    }
    public int useragile(){
        Random ragile =new Random();
        int agile =ragile.nextInt(10000);
        return agile;
    }
    public String userbaby(){
        String baby = "退出系统";
        System.out.print(baby);
        return baby;
    }

}