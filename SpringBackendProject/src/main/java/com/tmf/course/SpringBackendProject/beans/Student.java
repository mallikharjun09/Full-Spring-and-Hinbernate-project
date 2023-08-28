package com.tmf.course.SpringBackendProject.beans;

import java.sql.Date;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class Student {
	@Id
	@SequenceGenerator(
			name = "sid_seq",
			initialValue = 100000001,
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "sid_seq")
	private long studentId;
	private String studentName;
	private String studentEmail;
	private String studentGender;
	private Date studentDOB;
	private long studentMobileNumber;
	private String studentAddress;
	private String studentQualification;
	
}
