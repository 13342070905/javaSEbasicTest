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



            System.out.print("��ϲ��"+
                    "�Ľ�ɫ�����ɹ�,���ĳ�ʼ���ԣ�������"+a+"������"+b+
                    "���ݣ�"+c+"������"+d+"Ѫ����"+e+"ħ��ֵ��"+f);


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
        System.out.print("������������Ҫ�Ĳ����� 1.��ʼ��Ϸ   2.��Ϸ����   3.������Ϸ");
        check =scheck.nextInt();
        switch (check){
            case 1:
                System.out.println("��ӭ��");
                break;
            case 2:
                System.out.println("��Ϸ����Ϊ��xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                return usercheck();
            case 3:
                System.out.println("�ټ���");
                return usercheck();
        }
        return check;
}


    public String username(String uname) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("����������Ҫ���ǳ�");
        String name=scanner.next();
        System.out.println("�����ǳ�Ϊ��"+name);
        return name;

    }
    public String usersex(String sex){
        Scanner sexscanner =new Scanner(System.in);
        System.out.println("������������ѡ����Ա�");
        System.out.println("1.����             2.Ů��");
        int a=sexscanner.nextInt();
        if (a==1){
            System.out.println("��ѡ��Ľ�ɫΪ����");
            sex="��";
        }else if (a==2){
            System.out.println("��ѡ��Ľ�ɫΪŮ��");
            sex="nv";
        }else {
            System.out.println("error");
        }
        return sex;
    }
    public String userrace(String race){
        Scanner racescanner =new Scanner(System.in);
        System.out.println("������������ѡ�������");
        System.out.println("1.���� 2.���� 3.���� 4. ���� 5.Ԫ��");
        int b=racescanner.nextInt();
        if (b==1){
            System.out.println("��ѡ��Ľ�ɫΪ����");
            race="����";
        }else if (b==2){
            System.out.println("��ѡ��Ľ�ɫΪ����");
            race="����";
        }else if (b==3){
            System.out.println("��ѡ��Ľ�ɫΪ����");
            race="����";
        }else if (b==4){
            System.out.println("��ѡ��Ľ�ɫΪ����");
            race="����";
        }else if (b==5){
            System.out.println("��ѡ��Ľ�ɫΪԪ��");
            race="Ԫ��";
        }else {
            System.out.println("error");
        }
        return race;

    } public String userprofessional(String professional){
        Scanner professionalscanner =new Scanner(System.in);
        System.out.println("������������ѡ�������");
        System.out.println("1.սʿ 2.��ʦ 3.������ 4. ����ʦ 5.ˮ��");
        int c=professionalscanner.nextInt();
        if (c==1){
            System.out.println("��ѡ���ְҵΪսʿ");
            professional="սʿ";
        }else if (c==2){
            System.out.println("��ѡ��Ľ�ɫΪ��ʦ");
            professional="��ʦ";
        }else if (c==3){
            System.out.println("��ѡ��Ľ�ɫΪ������");
            professional="������";
        }else if (c==4){
            System.out.println("��ѡ��Ľ�ɫΪ����ʦ");
            professional="����ʦ";
        }else if (c==5){
            System.out.println("��ѡ��Ľ�ɫΪˮ��");
            professional="ˮ��";
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
        String baby = "�˳�ϵͳ";
        System.out.print(baby);
        return baby;
    }

}