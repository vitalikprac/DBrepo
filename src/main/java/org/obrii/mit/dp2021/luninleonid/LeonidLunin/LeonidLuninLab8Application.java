package org.obrii.mit.dp2021.luninleonid.LeonidLunin;

import java.util.HashSet;
import java.util.Set;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity.Lesson;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity.MarkLesson;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity.MitGroup;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity.Student;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.repository.LessonRepository;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.repository.MarkRepository;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.repository.MitGroupRepository;
import org.obrii.mit.dp2021.luninleonid.LeonidLunin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeonidLuninLab8Application implements CommandLineRunner{
    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    MitGroupRepository mitGroupRepository;

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    MarkRepository markRepository;


	public static void main(String[] args) {
		SpringApplication.run(LeonidLuninLab8Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        MitGroup g1 = new MitGroup("MIT-21");
        MitGroup g2 = new MitGroup("MIT-31");
        mitGroupRepository.save(g1);
        mitGroupRepository.save(g2);
        
        Lesson lesson1 = new Lesson("lecture1");
        Lesson lesson2 = new Lesson("lecture2");
        Lesson lesson3 = new Lesson("lecture3");
        
        lessonRepository.save(lesson1);
        lessonRepository.save(lesson2);
        lessonRepository.save(lesson3);
        
        Set<Lesson> s1 = new HashSet<>();
       
        s1.add(lesson1);
        s1.add(lesson2);
        
        Student Oleg = new Student("Oleg",19);
        Oleg.setVisitedLesson(s1);
        Student Olena = new Student("Olena",18);
        Olena.setVisitedLesson(s1);
        
        Set<Lesson> s2 = new HashSet<>();
        s2.add(lesson3);
        
        Student Viktor = new Student("Viktor",20);
        Viktor.setVisitedLesson(s2);
        
        Oleg.setMitGroup(g2);
        Olena.setMitGroup(g1);
        Viktor.setMitGroup(g1);
        
        studentRepository.save(Oleg);
        studentRepository.save(Olena);
        studentRepository.save(Viktor);
        
        MarkLesson mark1 = new MarkLesson(Oleg, lesson1, 90);
        MarkLesson mark2 = new MarkLesson(Oleg, lesson1, 89);
        MarkLesson mark3 = new MarkLesson(Olena, lesson2, 90);
        MarkLesson mark4 = new MarkLesson(Olena, lesson1, 80);
       
        markRepository.save(mark1);
        markRepository.save(mark2);
        markRepository.save(mark3);
        markRepository.save(mark4);
        }


}
