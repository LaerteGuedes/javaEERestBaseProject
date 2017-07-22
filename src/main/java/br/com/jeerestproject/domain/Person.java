package br.com.jeerestproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by laerteguedes on 22/07/17.
 */
@Entity
@Table(name = "person")
public class Person extends AbstractEntity implements Serializable{

    @NotNull
    @Column
    private String name;

    @NotNull
    @Size(min = 9)
    @Column(unique = true)
    private String cpf;

    @Size(min = 9, message = "No minimo 9 caracteres!")
    private String phone;

    private String profission;

    @Min(value = 18, message = "Idade minima de 18 anos!")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfission() {
        return profission;
    }

    public void setProfission(String profission) {
        this.profission = profission;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
