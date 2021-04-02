package org.obrii.mit.dp2021.luninleonid.leonidlunin.Spring;

import java.util.ArrayList;
import java.util.Iterator;
import org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spring {
    @Autowired
    SpringInterface DBInterface;
    
    public Spring(){
    }
    
    public Iterable<Data> readData(){
        return DBInterface.findAll();
    }
    
            
    public ArrayList<Data> sortData(String s){
        Iterable<Data> data = DBInterface.findAll();
        Iterator<Data> iterator = data.iterator();
        ArrayList<Data> newData = new ArrayList<Data>();

        while(iterator.hasNext()){
            Data item = iterator.next();
            if(item.getName().contains(s)){
                newData.add(item);
            }
        }
        return newData;
    }
    
    public void createData(Data data){
        DBInterface.save(data);
    }
    
    public void deleteData(Integer id){
        DBInterface.deleteById(id);
    }
    
    public void updateData(Data data,Integer id){
        Data update = DBInterface.findById(id).get();
        update.setName(data.getName());
        update.setAge(data.getAge());
        DBInterface.save(update);
    }
    
}