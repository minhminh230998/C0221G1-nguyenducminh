package service;

import productModel.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
   private static Map<Integer,Product> product;
    static {
        product=new HashMap<>();
        product.put(1,new Product("1","Iphone 6","1000000","Còn","Iphone"));
        product.put(2,new Product("2","Iphone 7","2000000","Còn","Iphone"));
        product.put(3,new Product("3","Iphone 8","3000000","Còn","Iphone"));
        product.put(4,new Product("4","Iphone X","4000000","Còn","Iphone"));
        product.put(5,new Product("5","Iphone 11","5000000","Còn","Iphone"));
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void create(int id, Product product) {

    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Product findById(String name) {
        return null;
    }
}
