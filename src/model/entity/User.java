package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by simon on 01/03/17.
 */
@Entity
@Table(name = "USER")
public class User extends AEntity {

    @Id
    @Column(name = "ID_USER")
    private Integer id;
    @Column(name = "DES_USER")
    private String desPerson;
    @Column(name = "USERNAME_USER")
    private String userName;
    @Column(name = "PASSWORD_USER")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesPerson() {
        return desPerson;
    }

    public void setDesPerson(String desPerson) {
        this.desPerson = desPerson;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
