package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.io.Serializable;
import java.util.Arrays;

public class Data implements Serializable{
    
    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    boolean isAdmin;

    public Data() {
    }

    public Data(int id, String name, int age, String gender, String email, boolean isAdmin) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.isAdmin=isAdmin;
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

    
    public boolean isIsAdmin() {
        return isAdmin;
    }
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    

    

    

    

    @Override
    public String toString() {
        return "Data{" + "id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + '}';
    }
    
    
    
    
    
}
