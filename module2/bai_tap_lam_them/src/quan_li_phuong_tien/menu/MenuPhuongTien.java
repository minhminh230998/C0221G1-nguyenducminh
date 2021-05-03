package quan_li_phuong_tien.menu;

import quan_li_phuong_tien.ham.XoaXe;

import java.util.Scanner;

public class MenuPhuongTien {
    public static void quanLiPhuongTien(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            String input=sc.nextLine();
            switch (input){
                case "1":
                    MenuThemMoiPhuongTien.themMoiPhuongTien();
                    break;
                case "2":
                    MenuHienThiPhuongTien.hienThiPhuongTien();
                    break;
                case "3":
                    MenuXoaPhuongTien.menuXoaXe();
                case "4":
                    System.exit(0);
            }
        }


    }


}
