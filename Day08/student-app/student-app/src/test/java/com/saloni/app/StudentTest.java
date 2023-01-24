package com.saloni.app;

import com.saloni.app.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void testStudent(){
        List listStudents= new ArrayList();
        Student student1= new Student("abc","01","10","JSPM");
        Student student2 = new Student("pqr","02","9","MGM");
        Student student3= new Student("xyz","15","5","SGI");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        Assertions.assertEquals(listStudents.size(),3);

    }
}
