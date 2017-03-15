package service.interfaces;

import service.dto.TableProductsDTO;

import java.util.List;

/**
 * Created by simon on 12/03/17.
 */
public interface HomeServiceInterface extends BaseService{

    List<TableProductsDTO> getProductTable();
}
