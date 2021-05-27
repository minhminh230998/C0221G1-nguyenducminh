package service;

import productModel.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product>findAll();
    void create(int id,Product product);
    void save(Product product);

    void update(int id,Product product);
    void remove(int id);
    Product findById(String name);
}
