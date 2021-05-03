package quan_li_phuong_tien.menu;

import quan_li_phuong_tien.ham.HienThiPhuongTien;

import java.util.Scanner;

public class MenuHienThiPhuongTien {
public static void hienThiPhuongTien(){
    Scanner sc=new Scanner(System.in);

    while (true){
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị xe máy");
        System.out.println("3. Hiển thị oto");
        System.out.println("4. Quay lại menu chính");
        String input=sc.nextLine();
        switch (input){
            case "1":
                HienThiPhuongTien.hienThiXeTai();
                break;
            case "2":
                HienThiPhuongTien.hienThiXeMay();
                break;
            case "3":
                HienThiPhuongTien.hienThiOto();
                break;
            case "4":
                MenuPhuongTien.quanLiPhuongTien();
                break;
        }

    }
}

}
