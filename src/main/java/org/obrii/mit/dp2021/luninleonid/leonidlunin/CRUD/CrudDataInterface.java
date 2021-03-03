package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.util.List;

public interface CrudDataInterface {

    void createData(Data addingData);

    List<Data> readData();

    void updateData(int id, Data data);

    void deleteData(int id);

    void writeData(List<Data> data);

}
