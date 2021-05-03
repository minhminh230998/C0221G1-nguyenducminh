package quan_li_phuong_tien.menu;

import quan_li_phuong_tien.ham.XoaXe;

import java.util.Scanner;

public class MenuXoaPhuongTien {
    public static void menuXoaXe(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Bạn muốn xóa loại xe nào?");
            System.out.println("1. Xóa xe tải");
            System.out.println("2. Xóa xe oto");
            System.out.println("3. Xóa xe máy");
            System.out.println("4. Quay lại menu chính");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    XoaXe.xoaXeTai();
                    break;
                case "2":
                    XoaXe.xoaOto();
                    break;
                case "3":
                    XoaXe.xoaXeMay();
                    break;
                case "4":
                    MenuPhuongTien.quanLiPhuongTien();
                    break;
            }
        }

    }
}
