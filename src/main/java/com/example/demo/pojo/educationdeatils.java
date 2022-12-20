package com.example.demo.pojo;

import javax.xml.bind.annotation.XmlElement;

public class educationdeatils {
	private String university;
	private String college;
	private String department;

	@XmlElement(name = "university")
	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@XmlElement(name = "college")
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@XmlElement(name = "department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "educationdeatils [university=" + university + ", college=" + college + ", department=" + department
				+ "]";
	}

}
