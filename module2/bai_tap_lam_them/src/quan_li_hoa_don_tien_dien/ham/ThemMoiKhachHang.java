package quan_li_hoa_don_tien_dien.ham;

import quan_li_hoa_don_tien_dien.doi_tuong.KhachHang;
import quan_li_hoa_don_tien_dien.doi_tuong.KhachHangNgoaiQuoc;
import quan_li_hoa_don_tien_dien.doi_tuong.KhachHangVietNam;
import quan_li_hoa_don_tien_dien.menu.Regex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThemMoiKhachHang implements Regex1 {
    public static void themMoiKhachHangVN(){
        List<KhachHangVietNam> listVN=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Nhập mã khách hàng");
            String maKhachHang = sc.nextLine();
            while (!Pattern.matches(MA_VIET_NAM, maKhachHang)) {
                System.out.println("Nhập đúng mã khách hàng Việt Nam");
                maKhachHang = sc.nextLine();
            }
            System.out.println("Nhập họ và tên khách hàng");
            String hoTen = sc.nextLine();
            while (!Pattern.matches(TEN_KHACH_HANG, hoTen)) {
                System.out.println("Nhập đúng tên khách hàng");
                hoTen = sc.nextLine();
            }
            System.out.println("Nhập loại khách hàng");
            String loaiKhachHang = sc.nextLine();
            while (!Pattern.matches(LOAI_KHACH_HANG, loaiKhachHang)) {
                System.out.println("Nhập đúng loại khách hàng");
                loaiKhachHang = sc.nextLine();
            }
            System.out.println("Nhập định mức tiêu thụ");
            String dinhMucTieuThu = sc.nextLine();
            while (!Pattern.matches(DINH_MUC_TIEU_THU, dinhMucTieuThu)) {
                System.out.println("Nhập đúng định mức tiêu thụ");
                dinhMucTieuThu = sc.nextLine();
            }
            listVN.add( new KhachHangVietNam(maKhachHang,hoTen,loaiKhachHang,dinhMucTieuThu));
            FileWriter fw=new FileWriter(TEXT_KHACH_HANG);
            BufferedWriter bw=new BufferedWriter(fw);
            for (int i = 0; i <listVN.size() ; i++) {
                bw.write(listVN.get(i).toString());
                bw.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void themKhachHangNN(){
        List<KhachHangNgoaiQuoc> listNN=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Nhập mã khách hàng");
            String maKhachHang = sc.nextLine();
            while (!Pattern.matches(MA_NUOC_NGOAI, maKhachHang)) {
                System.out.println("Nhập đúng mã khách hàng Việt Nam");
                maKhachHang = sc.nextLine();
            }
            System.out.println("Nhập họ và tên khách hàng");
            String hoTen = sc.nextLine();
            while (!Pattern.matches(TEN_KHACH_HANG, hoTen)) {
                System.out.println("Nhập đúng tên khách hàng");
                hoTen = sc.nextLine();
            }
            System.out.println("Nhập quốc tịch");
            String quocTich = sc.nextLine();
            while (!Pattern.matches(QUOC_TICH, quocTich)) {
                System.out.println("Nhập đúng quốc tịch");
                quocTich = sc.nextLine();
            }


            listNN.add( new KhachHangNgoaiQuoc(maKhachHang,hoTen,quocTich));
            FileWriter fw=new FileWriter(TEXT_KHACH_HANG);
            BufferedWriter bw=new BufferedWriter(fw);
            for (int i = 0; i <listNN.size() ; i++) {
                bw.write(listNN.get(i).toString());
                bw.append("\n");
            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
