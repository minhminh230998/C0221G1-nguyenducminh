package quan_li_phuong_tien;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThemPhuongTien implements Regex {

    public static void themXeTai() {
        List<XeTai> xeTaiList=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!Pattern.matches(SO_XE_TAI, bienKiemSoat)) {
            System.out.println("Vui lòng nhập đúng");
            bienKiemSoat = sc.nextLine();
        }
        for (int i = 0; i <xeTaiList.size() ; i++) {
            if(bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())){
                System.out.println("Vui lòng nhập đúng");
                bienKiemSoat = sc.nextLine();
            }
        }
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = sc.nextLine();
        while (!Pattern.matches(HANG_SAN_XUAT, hangSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            hangSanXuat = sc.nextLine();
        }
        System.out.println("Nhập năm sản xuất");
        String namSanXuat = sc.nextLine();
        while (!Pattern.matches(NAM_SAN_XUAT, namSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            namSanXuat = sc.nextLine();
        }
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        while (!Pattern.matches(CHU_SO_HUU, chuSoHuu)) {
            System.out.println("Vui lòng nhập đúng");
            chuSoHuu = sc.nextLine();
        }
        System.out.println("Nhập tải trọng");
        String taiTrong = sc.nextLine();
        while (!Pattern.matches(TAI_TRONG, taiTrong)) {
            System.out.println("Vui lòng nhập đúng");
            taiTrong = sc.nextLine();
        }
        System.out.println("xong");
        XeTai xeTai=new XeTai(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,taiTrong);
        xeTaiList.add(xeTai);
        try {
            FileWriter fw = new FileWriter(XE_TAI_CSV,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (XeTai s:xeTaiList){
                bw.write(xeTai.toString());
                bw.append("\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void themXeOto() {
        List<Oto> listOto=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!Pattern.matches(SO_XE_TAI, bienKiemSoat)) {
            System.out.println("Vui lòng nhập đúng");
            bienKiemSoat = sc.nextLine();
        }
//        for (int i = 0; i <xeTaiList.size() ; i++) {
//            if(bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())){
//                System.out.println("Vui lòng nhập đúng");
//                bienKiemSoat = sc.nextLine();
//            }
//        }
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = sc.nextLine();
        while (!Pattern.matches(HANG_SAN_XUAT, hangSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            hangSanXuat = sc.nextLine();
        }
        System.out.println("Nhập năm sản xuất");
        String namSanXuat = sc.nextLine();
        while (!Pattern.matches(NAM_SAN_XUAT, namSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            namSanXuat = sc.nextLine();
        }
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        while (!Pattern.matches(CHU_SO_HUU, chuSoHuu)) {
            System.out.println("Vui lòng nhập đúng");
            chuSoHuu = sc.nextLine();
        }
        System.out.println("Nhập số chỗ ngồi");
        String soChoNgoi = sc.nextLine();
        while (!Pattern.matches(SO_CHO_NGOI, soChoNgoi)) {
            System.out.println("Vui lòng nhập đúng");
            soChoNgoi = sc.nextLine();
        }
        System.out.println("Nhập kiểu xe");
        String kieuXe = sc.nextLine();
        while (!Pattern.matches(KIEU_XE, kieuXe)) {
            System.out.println("Vui lòng nhập đúng");
            kieuXe = sc.nextLine();
        }
        System.out.println("xong");
        Oto Oto1=new Oto(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        listOto.add(Oto1);
        try {
            FileWriter fw = new FileWriter(XE_TAI_CSV,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Oto s:listOto){
                bw.write(Oto1.toString());
                bw.append("\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void themXeMay() {
        List<XeMay> listXeMay=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!Pattern.matches(SO_XE_TAI, bienKiemSoat)) {
            System.out.println("Vui lòng nhập đúng");
            bienKiemSoat = sc.nextLine();
        }
//        for (int i = 0; i <xeTaiList.size() ; i++) {
//            if(bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())){
//                System.out.println("Vui lòng nhập đúng");
//                bienKiemSoat = sc.nextLine();
//            }
//        }
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = sc.nextLine();
        while (!Pattern.matches(HANG_SAN_XUAT, hangSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            hangSanXuat = sc.nextLine();
        }
        System.out.println("Nhập năm sản xuất");
        String namSanXuat = sc.nextLine();
        while (!Pattern.matches(NAM_SAN_XUAT, namSanXuat)) {
            System.out.println("Vui lòng nhập đúng");
            namSanXuat = sc.nextLine();
        }
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        while (!Pattern.matches(CHU_SO_HUU, chuSoHuu)) {
            System.out.println("Vui lòng nhập đúng");
            chuSoHuu = sc.nextLine();
        }
        System.out.println("Nhập công xuất xe");
        String congXuat = sc.nextLine();
        while (!Pattern.matches(CONG_XUAT, congXuat)) {
            System.out.println("Vui lòng nhập đúng");
            congXuat = sc.nextLine();
        }

        System.out.println("xong");
        XeMay xeMay=new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congXuat);
        listXeMay.add(xeMay);
        try {
            FileWriter fw = new FileWriter(XE_TAI_CSV,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (XeMay s:listXeMay){
                bw.write(xeMay.toString());
                bw.append("\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
