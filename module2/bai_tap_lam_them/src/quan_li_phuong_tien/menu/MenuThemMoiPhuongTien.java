package quan_li_phuong_tien.menu;

import quan_li_phuong_tien.ham.ThemPhuongTien;

import java.util.Scanner;

public class MenuThemMoiPhuongTien {
    public static void themMoiPhuongTien(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới xe tải");
            System.out.println("2. Thêm mới ô tô");
            System.out.println("3. Thêm mới xe máy");
            System.out.println("4. Quay lại menu chính");
            String input=sc.nextLine();
            switch (input){
                case "1":
                    ThemPhuongTien.themXeTai();
                    break;
                case "2":
                    ThemPhuongTien.themXeOto();
                    break;
                case "3":
                    ThemPhuongTien.themXeMay();
                    break;
                case "4":
                    MenuPhuongTien.quanLiPhuongTien();
                    break;
            }
        }
    }
}
