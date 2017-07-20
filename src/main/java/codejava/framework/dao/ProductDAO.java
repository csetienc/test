package codejava.framework.dao;

import java.util.List;

import codejava.framework.model.Product;
 
public interface ProductDAO {
    List<Product> list();
}