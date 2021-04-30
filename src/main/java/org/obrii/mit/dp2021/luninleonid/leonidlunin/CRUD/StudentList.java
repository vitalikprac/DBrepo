package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentList {
   
    @JsonProperty("data")
    private List<Data> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public List<Data> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Data> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentList{" + "studentList=" + studentList + '}';
    }

}
