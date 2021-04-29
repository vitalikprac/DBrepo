package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Data {
            
    private long id;
    private String name;
    private int age;
    private String gender;
    private String email;
    
    @JsonProperty("_links")
    private Links links;
    
    @JsonIgnore
    private String href;
    
   

    public Data() {
    }

    public Data(String name, int age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
     
    public Data(long id, String name, int age, String gender, String email) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
    

    public long getId() {
        return id;
    }
    public void setId(long id) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", email=").append(email);
        sb.append(", links=").append(links);
        sb.append(", href=").append(href);
        sb.append('}');
        return sb.toString();
    }

    

    public Links getLinks() {
        return links;
    }

    public String getHref() {
        return links.getSelf().getHref();
    }

  

   
    
    
    
    
}
