/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Leonid
 */
@Entity
public class MarkLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name="lesson_id")
    private Lesson lesson;
    
    private int mark;
    
    public MarkLesson(){
    }

    public MarkLesson(Student student, Lesson lesson, int mark) {
        this.student = student;
        this.lesson = lesson;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
    
}
