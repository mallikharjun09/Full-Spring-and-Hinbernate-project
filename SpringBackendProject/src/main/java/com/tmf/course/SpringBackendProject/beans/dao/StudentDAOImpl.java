package com.tmf.course.SpringBackendProject.beans.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmf.course.SpringBackendProject.beans.Student;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		getSession().save(st);
		System.out.println("Data got added..");
	}

	@Override
	public Student updateStudent(Student st) {
		// TODO Auto-generated method stub
		return getSession().merge(st);
	}

	@Override
	public Student getStudent(long studentId) {
		// TODO Auto-generated method stub
		return getSession().get(Student.class, studentId);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Student").list();
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		getSession().delete(student);
	}

}
