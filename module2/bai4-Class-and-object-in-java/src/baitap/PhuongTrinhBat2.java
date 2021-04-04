package baitap;

import java.util.Scanner;

public class PhuongTrinhBat2 {
    int a;
    int b;
    int c;
    public PhuongTrinhBat2(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public String disPlay(){
        return " a = "+getA()+"\n b = "+getB()+"\n c = "+getC();
    }


    public String nghiemPhuongTrinh(int a,int b,int c){
        double denta=b*b-4*a*c;
        double x1 = 0;
        double x2=0;
        double canbat2Denta=Math.sqrt(denta);
        if(a!=0&&denta>0){
            x1=(-b+canbat2Denta)/2*a;
            x2=(-b-canbat2Denta)/2*a;
        }else if(a!=0&&denta==0) {
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
        }else {
            System.out.println("phương trình vô nghiệm");
        }
       return " Nghiệm thứ nhất là"+x1 +"\n Nghiệm thứ 2 là "+ x2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập a");
        int a=sc.nextInt();
        System.out.println("nhập b");
        int b=sc.nextInt();
        System.out.println("nhập c");
        int c=sc.nextInt();
        PhuongTrinhBat2 phuongTrinhBat2_1=new PhuongTrinhBat2(a,b,c);
        System.out.println(phuongTrinhBat2_1.disPlay());
        System.out.println(phuongTrinhBat2_1.nghiemPhuongTrinh(a,b,c));
    }
}
