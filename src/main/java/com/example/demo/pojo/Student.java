package com.example.demo.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Student {
	private Integer id;
	private String firstName;
	private String lastName;
	private String course;

	private List<Scores> scores;
	private List<deatils> deatils;
	private List<educationdeatils> educationDeatils;

	@XmlAttribute(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement(name = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement(name = "course")
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@XmlElement(name = "scores")
	public List<Scores> getScores() {
		return scores;
	}

	public void setScores(List<Scores> scores) {
		this.scores = scores;
	}

	@XmlElement(name = "deatils")
	public List<deatils> getStudentDeatils() {
		return deatils;
	}

	public void setStudentDeatils(List<deatils> studentDeatils) {
		this.deatils = studentDeatils;
	}

	@XmlElement(name = "educationdeatils")
	public List<educationdeatils> getEducationDeatils() {
		return educationDeatils;
	}

	public void setEducationDeatils(List<educationdeatils> educationDeatils) {
		this.educationDeatils = educationDeatils;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course
				+ ", scores=" + scores + ", deatils=" + deatils + ", educationDeatils=" + educationDeatils + "]";
	}

}
