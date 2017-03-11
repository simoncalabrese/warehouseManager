package controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomeViewController {

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> cod;

    @FXML
    private TableColumn<?, ?> desc;

    @FXML
    private TableColumn<?, ?> cat;

    @FXML
    private TableColumn<?, ?> quant;

    @FXML
    private TableColumn<?, ?> prezzoAcq;

    @FXML
    private TableColumn<?, ?> prezzoVend;

    @FXML
    private TableColumn<?, ?> lastDate;

    @FXML
    private MenuBar menuBar;

    @FXML
    private MenuItem addProd;

    @FXML
    private MenuItem editProd;

    @FXML
    private MenuItem datInv;

    @FXML
    void initialize() {

    }
}