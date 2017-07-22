package br.com.jeerestproject.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by laerteguedes on 16/02/17.
 */
@Entity
@Table(name = "user")
public class User extends AbstractEntity implements Serializable{

    @NotNull
    private String email;

    @NotNull
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
