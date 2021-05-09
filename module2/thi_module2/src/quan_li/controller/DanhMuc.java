package quan_li.controller;

import java.util.Scanner;

public class DanhMuc {
    static Scanner sc = new Scanner(System.in);
    public static void menuQuanLi() {
        while (true) {
            System.out.println("1. \n" +
                    "2. \n" +
                    "3. \n" +
                    "4. \n");
            String input = sc.nextLine();
            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                default:
                    System.out.println("Không đúng định dạng, mời bạn nhập lại!!");
            }
        }
    }
}
