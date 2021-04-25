package baitap.quan_li_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditProduct {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void addProduct() {
        try {
            System.out.println("input id");
            String code = sc.nextLine();
            System.out.println("input name");
            String name = sc.nextLine();
            System.out.println("input delay");
            String delay = sc.nextLine();
            System.out.println("input price");
            String price = sc.nextLine();
            System.out.println("input describe");
            String describe = sc.nextLine();
            Product product = new Product(code,name,delay,price,describe);
            productList.add(product);
            FileOutputStream fos = new FileOutputStream("productManagement.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        addProduct();
    }
}
