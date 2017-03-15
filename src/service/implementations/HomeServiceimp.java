package service.implementations;

import model.dao.ProductDao;
import service.dto.TableProductsDTO;
import service.interfaces.HomeServiceInterface;

import java.util.List;

/**
 * Created by simon on 12/03/17.
 */
public class HomeServiceimp implements HomeServiceInterface {

    private ProductDao productDao;

    public HomeServiceimp() {
        productDao = new ProductDao();
    }

    @Override
    public List<TableProductsDTO> getProductTable() {
        productDao.getAllProducts();
        return null;
    }
}
