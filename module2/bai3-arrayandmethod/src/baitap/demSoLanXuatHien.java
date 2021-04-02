package baitap;

import java.util.Scanner;

public class demSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text="anh yeu em nhieu vcl";
        String[] arr=text.split("");
        String tim=sc.nextLine();
        int coust=0;
        for (int i = 0; i <arr.length ; i++) {
            if(tim.indexOf(arr[i])!=-1){
                coust++;
            }
        }
        System.out.println(coust);
    }


}
