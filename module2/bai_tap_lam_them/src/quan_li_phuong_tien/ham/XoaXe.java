package quan_li_phuong_tien.ham;

import quan_li_phuong_tien.itf.Regex;
import quan_li_phuong_tien.object.Oto;
import quan_li_phuong_tien.object.PhuongTien;
import quan_li_phuong_tien.object.XeMay;
import quan_li_phuong_tien.object.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class XoaXe implements Regex {
    public static void xoaXeTai() {
        Scanner sc = new Scanner(System.in);
        List<XeTai> xeTaiList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(XE_TAI_CSV);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] arrayXeMay = null;
            while ((line = br.readLine()) != null) {
                arrayXeMay = line.split(",");
                xeTaiList.add(new XeTai(arrayXeMay[0], arrayXeMay[1], arrayXeMay[2], arrayXeMay[3], arrayXeMay[4]));
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tồn tại file");
        } catch (IOException e) {
            System.out.println("Lỗi input, output");
        }
        try {
            System.out.println("Nhập biển số xe bạn muốn xóa?");
            String bienSoXe = sc.nextLine();
            boolean check = false;
            for (int i = 0; i < xeTaiList.size(); i++) {
                if (bienSoXe.equals(xeTaiList.get(i).getBienKiemSoat())) {
                    check = true;
                    xeTaiList.remove(xeTaiList.get(i));
                    System.out.println("Đã xóa biển số xe khỏi danh sách");
                }
            }
            FileWriter fw = new FileWriter(XE_TAI_CSV);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < xeTaiList.size(); i++) {
                bw.write(xeTaiList.get(i).toString());
                bw.append("\n");
            }
            bw.close();
            fw.close();
            if (!check) {
                System.out.println("Không tìm thấy biển số xe");
            }
        } catch (Exception e) {
            System.out.println("lỗi nhập");
        }
    }

    public static void xoaOto() {
        Scanner sc = new Scanner(System.in);
        List<Oto> listOto = new ArrayList<>();
        try {
            FileReader fr = new FileReader(XE_OTO_CSV);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] array = null;
            while ((line = br.readLine()) != null) {
                array = line.split(",");
                String bienKiemSoat = array[0];
                String tenHangSanXuat = array[1];
                String namSanXuat = array[2];
                String chuSoHuu = array[3];
                String soChoNgoi = array[4];
                String kieuXe = array[5];
                listOto.add(new Oto(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
            }
            br.close();
            fr.close();
            System.out.println("Nhậ biển số xe bạn muốn xóa:");
            String bienSoXe = sc.nextLine();
            boolean check = false;
            for (int i = 0; i < listOto.size(); i++) {
                if (bienSoXe.equals(listOto.get(i).getBienKiemSoat())) {
                    check = true;
                    listOto.remove(listOto.get(i));
                    System.out.println("Bạn đã xóa biển số xe");
                }
            }
            if (!check) {
                System.out.println("không tìm thấy biển số xe");
            }
            FileWriter fr1 = new FileWriter(XE_OTO_CSV);
            BufferedWriter br1 = new BufferedWriter(fr1);
            for (int i = 0; i < listOto.size(); i++) {
                br1.write(listOto.get(i).toString());
                br1.append("\n");
            }
            br1.close();
            fr1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xoaXeMay() {
        Scanner sc = new Scanner(System.in);
        List<XeMay> xeMayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(XE_MAY_CSV);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] array = null;
            while ((line = br.readLine()) != null) {
                array = line.split(",");
                String bienKiemSoat = array[0];
                String tenHangSanXuat = array[1];
                String namSanXuat = array[2];
                String chuSoHuu = array[3];
                String congXuat = array[4];
                xeMayList.add(new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congXuat));
                br.close();
                fr.close();
                System.out.println("Nhậ biển số xe bạn muốn xóa:");
                String bienSoXe = sc.nextLine();
                boolean check = false;
                for (int i = 0; i < xeMayList.size(); i++) {
                    if (bienSoXe.equals(xeMayList.get(i).getBienKiemSoat())) {
                        check = true;
                        xeMayList.remove(xeMayList.get(i));
                        System.out.println("Bạn đã xóa biển số xe");
                    }
                }
                if (!check) {
                    System.out.println("không tìm thấy biển số xe");
                }
                FileWriter fr1 = new FileWriter(XE_MAY_CSV);
                BufferedWriter br1 = new BufferedWriter(fr1);
                for (int i = 0; i < xeMayList.size(); i++) {
                    br1.write(xeMayList.get(i).toString());
                    br1.append("\n");
                }
                br1.close();
                fr1.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
