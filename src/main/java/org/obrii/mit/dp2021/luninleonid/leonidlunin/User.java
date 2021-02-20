package org.obrii.mit.dp2021.luninleonid.leonidlunin;


import java.util.Arrays;
import java.util.List;

public class User implements UserInterface {
    private String name;
    private String gender;
    private List<String> language;
    private String country;
    private boolean isAdmin;

    

    
    
    public User() {
    }

    public User(String name, String gender, String[] language, String country, boolean isAdmin) {
        this.name = name;
        this.gender = gender;
        
        if (language != null ){
            this.language = Arrays.asList(language);
        }
        
        this.country = country;
        this.isAdmin=isAdmin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public List<String> getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Override
    public String getIsAdmin() {
        return isAdmin ? "You`re admin":"You`re standart user";
    }

    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", gender=" + gender + ", language=" + language + ", country=" + country + '}';
    }

}