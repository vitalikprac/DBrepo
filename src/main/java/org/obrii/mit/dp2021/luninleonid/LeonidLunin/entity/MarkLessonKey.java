/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity;

import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author Leonid
 */
public class MarkLessonKey implements Serializable{
    @Column(name = "student_id")
    Integer studentId;
    
    @Column(name = "lesson_id")
    Integer lessonId;

    public MarkLessonKey() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    

    
    
}
