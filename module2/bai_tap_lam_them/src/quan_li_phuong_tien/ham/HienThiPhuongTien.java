package quan_li_phuong_tien.ham;

import quan_li_phuong_tien.itf.Regex;
import quan_li_phuong_tien.object.Oto;
import quan_li_phuong_tien.object.PhuongTien;
import quan_li_phuong_tien.object.XeMay;
import quan_li_phuong_tien.object.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class HienThiPhuongTien implements Regex {
    public static void hienThiXeTai() {
        List<XeTai> xeTai = new ArrayList<>();
        try {
            FileReader fr = new FileReader(XE_TAI_CSV);
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            String[] a = null;
            while ((line = br.readLine())!= null) {
                a = line.split(",");
                String bienKiemSoat = a[0];
                String tenHangSanXuat = a[1];
                String namSanXuat = a[2];
                String chuSoHuu = a[3];
                String trongTai = a[4];
                xeTai.add(new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai));
            }
            xeTai.sort(Comparator.comparing(PhuongTien::getBienKiemSoat));

            for (int i = 0; i < xeTai.size(); i++) {
                System.out.println(xeTai.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("file không tồn tại");
        } catch (IOException e) {
            System.out.println("lỗi");
        } catch (NullPointerException e) {
            System.out.println("file rỗng");
        }
    }

    public static void hienThiOto() {
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
            listOto.sort(Comparator.comparing(PhuongTien::getBienKiemSoat));
            br.close();
            fr.close();
            for (int i = 0; i < listOto.size(); i++) {
                System.out.println(listOto.get(i));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void hienThiXeMay() {
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

            }
            xeMayList.sort(Comparator.comparing(PhuongTien::getBienKiemSoat));
            for (int i = 0; i <xeMayList.size() ; i++) {
                System.out.println(xeMayList.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
