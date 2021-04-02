package org.obrii.mit.dp2021.luninleonid.leonidlunin.unused;

import java.util.List;
import org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD.Data;

public interface CrudDataInterface {

    void createData(Data addingData);

    List<Data> readData();

    void updateData(int id, Data data);

    void deleteData(int id);

    public List<Data> sortData(String phrase);

}
