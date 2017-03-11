package controller;

import commons.enums.alertEnums;
import commons.utils.StringUtils;
import controller.dispatcher.ViewDispatcher;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.implementations.LoginServiceImp;
import service.interfaces.LoginServiceInterface;

/**
 * Created by simon on 01/03/17.
 */
public class LoginViewController {

    private LoginServiceInterface loginServiceInterface;
    private ViewDispatcher viewDispatcher = ViewDispatcher.dispatcher;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    void btnSubmit() {
        if (StringUtils.isNotEmpty(username.getText(), password.getText())) {
            loginServiceInterface = new LoginServiceImp();
            if(loginServiceInterface.login(username.getText(), password.getText())) {

            } else {
                viewDispatcher.alert(alertEnums.LOGINERROR_VALUES);
                username.clear();
                password.clear();
            }
        } else {
            viewDispatcher.alert(alertEnums.LOGINERROR_MISSING);
            username.clear();
            password.clear();
        }
    }

}
