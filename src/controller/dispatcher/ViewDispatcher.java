package controller.dispatcher;

import commons.enums.alertEnums;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import mainclass.MainClass;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by simon on 01/03/17.
 */
public class ViewDispatcher {
    private static ViewDispatcher instance;

    public static ViewDispatcher dispatcher(){
        if(instance == null) {
            instance = new ViewDispatcher();
        }
        return instance;
    }

    public void dispatch(String view) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getClassLoader().getResource(view));
            AnchorPane pane = loader.load();
            MainClass.getPrimaryStage().setScene(new Scene(pane));
            MainClass.getPrimaryStage().show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void alert(alertEnums alertEnum) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(alertEnum.getTitle());
        alert.setHeaderText(alertEnum.getHeader());
        alert.setContentText(alertEnum.getFooter());
        alert.showAndWait();
    }
}
