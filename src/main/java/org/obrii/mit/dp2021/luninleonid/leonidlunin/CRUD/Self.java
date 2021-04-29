package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Self {
    
    private String href;
    public Self() {
    }
    
    @Override
    public String toString() {
        return "Self{" + "href=" + href + '}';
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
    
    
    
}
