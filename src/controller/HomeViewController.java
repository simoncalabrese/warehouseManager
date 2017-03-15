package controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import service.dto.TableProductsDTO;

public class HomeViewController {

    @FXML
    private TableView<TableProductsDTO> table;

    @FXML
    private TableColumn<TableProductsDTO, Integer> id;

    @FXML
    private TableColumn<TableProductsDTO, String> cod;

    @FXML
    private TableColumn<TableProductsDTO, String> desc;

    @FXML
    private TableColumn<TableProductsDTO, String> cat;

    @FXML
    private TableColumn<TableProductsDTO, Long> quant;

    @FXML
    private TableColumn<TableProductsDTO, Double> prezzoAcq;

    @FXML
    private TableColumn<TableProductsDTO, Double> prezzoVend;

    @FXML
    private TableColumn<TableProductsDTO, Double> lastDate;

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