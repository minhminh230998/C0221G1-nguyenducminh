package quan_li_hoa_don_tien_dien.menu;

import quan_li_hoa_don_tien_dien.ham.HienThiKhachHang;
import quan_li_hoa_don_tien_dien.ham.ThemMoiKhachHang;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuHienThiKhachHang implements Regex1 {
    public static void menuHienThiKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị khách hàng nào?");
        System.out.println("1. Việt Nam");
        System.out.println("2. Ngoại quốc");
        String input = sc.nextLine();
        while (!Pattern.matches(INPUT, input)) {
            System.out.println("Không có lựa chọn này, mời bạn nhập lại");
            input = sc.nextLine();
        }
        switch (input){
            case "1":
                HienThiKhachHang.hienThiKhachHang(4);
                break;
            case "2":
                HienThiKhachHang.hienThiKhachHang(3);
                break;
        }
    }
}
