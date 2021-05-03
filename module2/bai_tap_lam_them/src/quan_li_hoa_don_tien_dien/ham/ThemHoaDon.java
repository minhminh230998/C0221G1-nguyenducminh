package quan_li_hoa_don_tien_dien.ham;

import quan_li_hoa_don_tien_dien.menu.Regex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemHoaDon implements Regex1 {
    public static void themHoaDon() {
        Scanner sc=new Scanner(System.in);
        try {
            FileReader fr = new FileReader(TEXT_KHACH_HANG);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] a = null;
            List<String> listKH = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                a = line.split(",");
                listKH.add(line);
            }
            for (int i = 0; i < listKH.size(); i++) {
                System.out.println(listKH.get(i));
            }
            System.out.println("nhập tên khách hàng cần in hóa đơn");
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        themHoaDon();
    }
}

