package codejava.framework.action;

import java.util.List;

import codejava.framework.dao.ProductDAO;
import codejava.framework.model.Product;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class ListProductAction extends ActionSupport {
    private ProductDAO productDAO;
    private List<Product> listProduct;
 
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
 
    public String execute() {
        listProduct = productDAO.list();
        return SUCCESS;
    }
 
    public List<Product> getListProduct() {
        return listProduct;
    }
}