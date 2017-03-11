package service.implementations;

import model.dao.LoginDao;
import service.interfaces.LoginServiceInterface;

import java.util.Optional;

/**
 * Created by simon on 01/03/17.
 */
public class LoginServiceImp implements LoginServiceInterface {

    private LoginDao loginDao;
    public LoginServiceImp() {
        loginDao = new LoginDao();
    }

    @Override
    public Boolean login(String user, String password) {
        Optional<Long> result = loginDao.login(user, password);
        return result.isPresent() ? result.map(e -> e.equals(1L)).orElse(false) : false;
    }
}
