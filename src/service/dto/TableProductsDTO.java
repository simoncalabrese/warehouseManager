package service.dto;

import commons.utils.StringUtils;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by simon on 12/03/17.
 */
public class TableProductsDTO {
    private SimpleIntegerProperty idProperty;
    private SimpleStringProperty codProperty;
    private SimpleStringProperty descProperty;
    private SimpleStringProperty catProperty;
    private SimpleLongProperty quantProperty;
    private SimpleDoubleProperty prezzoAcqProperty;
    private SimpleDoubleProperty prezzoVendProperty;

    public Integer getIdProperty() {
        return idProperty.get();
    }

    public SimpleIntegerProperty idPropertyProperty() {
        return idProperty;
    }

    public void setIdProperty(Integer idProperty) {
        this.idProperty = new SimpleIntegerProperty(idProperty);
    }

    public String getOodProperty() {
        return codProperty.get();
    }

    public SimpleStringProperty oodPropertyProperty() {
        return codProperty;
    }

    public void setOodProperty(String oodProperty) {
        this.codProperty = new SimpleStringProperty(oodProperty);
    }

    public String getDescProperty() {
        return descProperty.get();
    }

    public SimpleStringProperty descPropertyProperty() {
        return descProperty;
    }

    public void setDescProperty(String descProperty) {
        this.descProperty = new SimpleStringProperty(descProperty);
    }

    public String getCatProperty() {
        return catProperty.get();
    }

    public SimpleStringProperty catPropertyProperty() {
        return catProperty;
    }

    public void setCatProperty(String catProperty) {
        this.catProperty = new SimpleStringProperty(catProperty);
    }

    public Long getQuantProperty() {
        return quantProperty.get();
    }

    public SimpleLongProperty quantPropertyProperty() {
        return quantProperty;
    }

    public void setQuantProperty(Long quantProperty) {
        this.quantProperty = new SimpleLongProperty(quantProperty);
    }

    public Double getPrezzoAcqProperty() {
        return prezzoAcqProperty.get();
    }

    public SimpleDoubleProperty prezzoAcqPropertyProperty() {
        return prezzoAcqProperty;
    }

    public void setPrezzoAcqProperty(Double prezzoAcqProperty) {
        this.prezzoAcqProperty = new SimpleDoubleProperty(prezzoAcqProperty);
    }

    public Double getPrezzoVendProperty() {
        return prezzoVendProperty.get();
    }

    public SimpleDoubleProperty prezzoVendPropertyProperty() {
        return prezzoVendProperty;
    }

    public void setPrezzoVendProperty(Double prezzoVendProperty) {
        this.prezzoVendProperty = new SimpleDoubleProperty(prezzoVendProperty);
    }
}
