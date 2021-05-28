package Model.repository;

import Model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> products = new HashMap<>();

    static {

        products.put(1, new Product(1, "Iphone 6", "1000000", "Còn", "Iphone"));
        products.put(2, new Product(2, "Iphone 7", "2000000", "Còn", "Iphone"));
        products.put(3, new Product(3, "Iphone 8", "3000000", "Còn", "Iphone"));
        products.put(4, new Product(4, "Iphone X", "4000000", "Còn", "Iphone"));
        products.put(5, new Product(5, "Iphone 11", "5000000", "Còn", "Iphone"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }


    public void create(int id, Product product) {
        products.put(id, product);
    }

    public void update(int id, Product product) {
        products.put(id, product);
    }


    public void remove(int id) {
        products.remove(id);
    }


    public Product findById(int id) {
        return products.get(id);
    }

    public Product search(String name,Product product) {
        return product;
    }
}



