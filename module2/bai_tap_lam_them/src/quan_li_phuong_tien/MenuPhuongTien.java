package quan_li_phuong_tien;

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
                case "2":
                case "3":
                case "4":
            }
        }


    }

    public static void main(String[] args) {
        quanLiPhuongTien();
    }
}
