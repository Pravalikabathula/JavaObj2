package com.example.demo.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "studentsList")
public class StudentsList {

	@XmlElement(name = "student")
	private List<Student> studentDeatils;

	public List<Student> getStudentsList() {
		return studentDeatils;
	}

	@Override
	public String toString() {
		return "StudentsList [studentDeatils=" + studentDeatils + "]";
	}

}
