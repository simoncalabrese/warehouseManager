package model.dao;

import model.entity.Product;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by simon on 12/03/17.
 */
public class ProductDao extends BaseDao {

    public List<Product> getAllProducts(){
        CriteriaQuery<Product> query = getCriteriaBuilder().createQuery(Product.class);
        Root<Product> root = query.from(Product.class);
        query.select(root);
        return getResultList(query);
    }

}
