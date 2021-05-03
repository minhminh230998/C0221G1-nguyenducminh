package quan_li_hoa_don_tien_dien.menu;

import quan_li_hoa_don_tien_dien.ham.HienThiKhachHang;
import quan_li_hoa_don_tien_dien.ham.TimKiemKhachHang;
import quan_li_phuong_tien.itf.Regex;
import quan_li_phuong_tien.menu.MenuHienThiPhuongTien;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuChinh implements Regex1 {
    public static void menuChinh() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn chức năng:\n" +
                    "1. Thêm mới khách hàng.\n" +
                    "2. Hiện thị thông tin khách hàng\n" +
                    "3. Tìm kiếm khách hàng\n" +
                    "4. Thêm mới hóa đơn\n" +
                    "5. Chỉnh sửa hóa đơn\n" +
                    "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                    "7. Thoát\n");
            String input = sc.nextLine();
            while (!Pattern.matches(INPUT, input)) {
                System.out.println("Mời bạn nhập đúng giá trị");
                input = sc.nextLine();
            }
            switch (input) {
                case "1":
                    MenuThemKhachHang.themKhachHang();
                    break;
                case "2":
                    MenuHienThiKhachHang.menuHienThiKhachHang();
                    break;
                case "3":
                    TimKiemKhachHang.timKiemKhachHang();
                    break;
                case "4":
                case "5":
                case "6":
                case "7":
            }
        }
    }

    public static void main(String[] args) {
        menuChinh();
    }
}
