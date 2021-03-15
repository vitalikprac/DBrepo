package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgresCrud implements CrudDataInterface {
    
    
    private Logger logger;
    private Connection connection;
    private Statement statement;
    
    public PostgresCrud() {
        logger=Logger.getLogger(FilesCrud.class.getName());
        
        //Connecting to db
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(Config.getURL(), Config.getDbUser(), Config.getDbPass());
            this.connection.setAutoCommit(false);
            this.statement = this.connection.createStatement();
        } catch (Exception e) {
            System.out.println("Connection exception!");
            System.exit(1);
        }
        //creating table
        SQL("CREATE TABLE users ("
                + "id integer primary key not null, "
                + "name text not null, "
                + "age integer not null, "
                + "gender text not null, "
                + "email text not null "
                + ");");
    }
    
    private void SQL(String sql){
        try{
            statement.executeUpdate(sql);
            connection.commit();
        }
        catch(SQLException e){
             logger.log(Level.WARNING, null, e);
        }
    }
    
    @Override
    public List<Data> readData() {
        try {
            ResultSet result = this.statement.executeQuery("SELECT * FROM users");
            List<Data> data = new ArrayList<>();

            while (result.next()) {
                data.add(new Data(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getInt("age"),
                        result.getString("gender"),
                        result.getString("email")
                ));
            }

            return data;
        } catch (SQLException e) {
            this.logger.log(Level.WARNING, e.toString());
            return new ArrayList<>();
        }
        
    }

    @Override
    public void createData(Data data) {
        SQL(String.format("INSERT INTO users (id, name, age, gender, email) VALUES (%d, '%s', %d, '%s', '%s');",
                data.getId(), data.getName(), data.getAge(), data.getGender(), data.getEmail()));
    }

    @Override
    public void deleteData(int id) {        
        SQL("DELETE FROM users WHERE id="+id);
    }
    
    @Override
    public void updateData(int id, Data data) {  
        SQL(String.format("UPDATE users "
                        + "SET name=" + data.getName()
                        + "SET age=" + data.getAge()
                        + "SET gender=" + data.getGender()
                        + "SET email=" + data.getEmail()
                + "WHERE id="+id)
        );
    }

    public List<Data> sortData(String phrase) {
        List<Data> newData = new ArrayList<>();
        for (Data d : this.readData()) {
            if(d.getName().contains(phrase)){
                newData.add(d);}
        }
            return newData;
    }
    
}
