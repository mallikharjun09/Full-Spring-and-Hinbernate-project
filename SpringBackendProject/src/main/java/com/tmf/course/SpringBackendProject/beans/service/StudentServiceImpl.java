package com.tmf.course.SpringBackendProject.beans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.course.SpringBackendProject.beans.Student;
import com.tmf.course.SpringBackendProject.beans.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentServices{
	@Autowired
	StudentDAO dao;

	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		dao.addStudent(st);
	}

	@Override
	public Student updateStudent(Student st) {
		// TODO Auto-generated method stub
		return dao.updateStudent(st);
	}

	@Override
	public Student getStudent(long studentId) {
		// TODO Auto-generated method stub
		return dao.getStudent(studentId);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return dao.getStudent();
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		dao.deleteStudent(student);
	}
}
