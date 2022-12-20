package com.example.demo.pojo;

import javax.xml.bind.annotation.XmlElement;

public class Scores {
	private Integer subject1;
	private Integer subject2;
	private Integer subject3;
	private Integer subject4;

	@XmlElement(name = "subject1")
	public Integer getSubject1() {
		return subject1;
	}

	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}

	@XmlElement(name = "subject2")
	public Integer getSubject2() {
		return subject2;
	}

	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}

	@XmlElement(name = "subject3")
	public Integer getSubject3() {
		return subject3;
	}

	public void setSubject3(Integer subject3) {
		this.subject3 = subject3;
	}

	@XmlElement(name = "subject4")
	public Integer getSubject4() {
		return subject4;
	}

	public void setSubject4(Integer subject4) {
		this.subject4 = subject4;
	}

	@Override
	public String toString() {
		return "scores [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", subject4="
				+ subject4 + "]";
	}

}
