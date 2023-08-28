package com.tmf.course.SpringBackendProject.beans.service;

import java.util.List;

import com.tmf.course.SpringBackendProject.beans.Student;

public interface StudentServices {
	public void addStudent(Student st);
	public Student updateStudent(Student st);
	public Student getStudent(long studentId);
	public List<Student> getStudent();
	public void deleteStudent(Student student);
}
