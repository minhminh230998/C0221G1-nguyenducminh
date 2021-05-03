package quan_li_hoa_don_tien_dien.menu;

import org.omg.PortableInterceptor.INACTIVE;
import quan_li_hoa_don_tien_dien.ham.ThemMoiKhachHang;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuThemKhachHang implements Regex1 {
    public static void themKhachHang(){
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn muốn thêm khách hàng nào?");
            System.out.println("1. Việt Nam");
            System.out.println("2. Ngoại quốc");
            String input = sc.nextLine();
            while (!Pattern.matches(INPUT, input)) {
                System.out.println("Không có lựa chọn này, mời bạn nhập lại");
                input = sc.nextLine();
            }
            switch (input){
                case "1":
                    ThemMoiKhachHang.themMoiKhachHangVN();
                    break;
                case "2":
                    ThemMoiKhachHang.themKhachHangNN();
                    break;
            }
        }

    }
}
