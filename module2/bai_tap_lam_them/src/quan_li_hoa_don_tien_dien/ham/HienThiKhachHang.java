package quan_li_hoa_don_tien_dien.ham;

import quan_li_hoa_don_tien_dien.doi_tuong.KhachHang;
import quan_li_hoa_don_tien_dien.doi_tuong.KhachHangNgoaiQuoc;
import quan_li_hoa_don_tien_dien.doi_tuong.KhachHangVietNam;
import quan_li_hoa_don_tien_dien.menu.Regex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HienThiKhachHang implements Regex1 {
    public static void hienThiKhachHang(int x){
        try {
            FileReader fr=new FileReader(TEXT_KHACH_HANG);
            BufferedReader br=new BufferedReader(fr);
            String line=null;
            String[] a=null;
            List<String> listKH=new ArrayList<>();

            while ((line=br.readLine())!=null){
                a=line.split(",");
                    listKH.add(line);
            }
            for (int i = 0; i <listKH.size() ; i++) {
                if(listKH.get(i).split(",").length==x){
                   if(x==3){
                       System.out.println(listKH.get(i));
                   }
                   if(x==4){
                       System.out.println(listKH.get(i));
                   }
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
