package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by simon on 12/03/17.
 */
@Entity
@Table(name = "PRODUCTS")
public class Product extends AEntity {
    @Id
    @Column(name = "ID_PRODUCT", columnDefinition = "BIGINT(100)")
    private Long idProduct;

    @Column(name = "COD_PRODUCT")
    private String codProduct;

    @Column(name = "DES_PRODUCT")
    private String desProduct;

    @Column(name = "IMEI_PRODUCT")
    private String imeiProduct;

    @Column(name = "BARCOD_PRODUCT")
    private String barCodProduct;

    @Column(name = "PREZZO_ACQUISTO", columnDefinition = "DOUBLE")
    private BigDecimal prezzoAcquisto;

    @Column(name = "PREZZO_VENDITA", columnDefinition = "DOUBLE")
    private BigDecimal prezzoVendita;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
    }

    public String getDesProduct() {
        return desProduct;
    }

    public void setDesProduct(String desProduct) {
        this.desProduct = desProduct;
    }

    public String getImeiProduct() {
        return imeiProduct;
    }

    public void setImeiProduct(String imeiProduct) {
        this.imeiProduct = imeiProduct;
    }

    public String getBarCodProduct() {
        return barCodProduct;
    }

    public void setBarCodProduct(String barCodProduct) {
        this.barCodProduct = barCodProduct;
    }

    public BigDecimal getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(BigDecimal prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public BigDecimal getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(BigDecimal prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }
}
