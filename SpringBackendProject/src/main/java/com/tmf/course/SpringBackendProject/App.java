package com.tmf.course.SpringBackendProject;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tmf.course.SpringBackendProject.beans.Customer;
import com.tmf.course.SpringBackendProject.beans.Student;
import com.tmf.course.SpringBackendProject.beans.service.StudentServices;
import com.tmf.course.SpringBackendProject.beans.service.StudentServices;
import com.tmf.course.SpringBackendProject.configs.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context;
       context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
       
       StudentServices service = context.getBean(StudentServices.class);
       List<Student> students = service.getStudent();
       for(Student st : students) {
    	   System.out.println(st);
       }
       
    }
}
