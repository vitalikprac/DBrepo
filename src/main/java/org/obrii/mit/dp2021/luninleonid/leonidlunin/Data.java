package org.obrii.mit.dp2021.luninleonid.leonidlunin;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Data{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message="Name cannot be null")
    private String name;
    private int age;
    @NotBlank(message="Gender cannot be null")
    private String gender;
    @NotBlank(message="Email cannot be null")
    private String email;

    public Data() {
    }

    public Data(int id, String name, int age, String gender, String email) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}