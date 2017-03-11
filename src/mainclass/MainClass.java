package mainclass;

import commons.enums.fxmlPathNames;
import controller.dispatcher.ViewDispatcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by simon on 04/03/17.
 */
public class MainClass extends Application {
    private static Stage primaryStage;
    private static Stage dialogStage;
    private AnchorPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MainClass.primaryStage = primaryStage;
        MainClass.primaryStage.setTitle("App");
        initRootLayout();
        ViewDispatcher.dispatcher.dispatch(fxmlPathNames.LOGIN.getPath());
    }

    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getClassLoader().getResource(fxmlPathNames.ROOT.getPath()));
            rootLayout = loader.load();
            primaryStage.setScene(new Scene(rootLayout));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static Stage getDialogStage() {
        return dialogStage;
    }
}
