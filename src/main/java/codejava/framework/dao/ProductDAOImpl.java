package codejava.framework.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional; 

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
 
import codejava.framework.model.Product;
 
public class ProductDAOImpl implements ProductDAO {
    private SessionFactory sessionFactory;
 
    public ProductDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Transactional
    public List<Product> list() {
        @SuppressWarnings("unchecked")
        List<Product> listProduct = (List<Product>)
            sessionFactory.getCurrentSession().createCriteria(Product.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .list();
        return listProduct;
    }
}