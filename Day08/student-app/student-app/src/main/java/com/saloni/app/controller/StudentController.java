package com.saloni.app.controller;

import com.saloni.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents= new ArrayList();
        Student student1= new Student("abc","01","10","JSPM");
        Student student2 = new Student("pqr","02","9","MGM");
        Student student3= new Student("xyz","15","5","SGI");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return  listStudents;
    }

    @GetMapping("/map/students")
    public Map mapHospitals(){
        Map StudentMap= new HashMap();
        Student student1= new Student("abc","01","10","JSPM");
        Student student2 = new Student("pqr","02","9","MGM");
        Student student3= new Student("xyz","15","5","SGI");


        StudentMap.put(student1.getRoll(),student1);
        StudentMap.put(student2.getRoll(),student2);
        StudentMap.put(student3.getRoll(),student3);
        return  StudentMap;
    }

}
