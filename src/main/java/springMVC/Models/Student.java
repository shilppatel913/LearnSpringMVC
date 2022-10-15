package springMVC.Models;

import java.sql.Date;
import java.util.List;

public class Student {
	private String stdName;
	private int stdId;
	private String stdDate;
	private List<String> subjects;
	private String stdGender;
	private String stdType;
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdDate() {
		return stdDate;
	}
	public void setStdDate(String stdDate) {
		this.stdDate = stdDate;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}
	public String getStdType() {
		return stdType;
	}
	public void setStdType(String stdType) {
		this.stdType = stdType;
	}
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", stdDate=" + stdDate + ", subjects=" + subjects
				+ ", stdGender=" + stdGender + ", stdType=" + stdType + "]";
	}
	
}
