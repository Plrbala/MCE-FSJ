package edu.mce.studentApp.model;

public class Student {
	private long sid;
	private String sname;
	private String dept;
	private int year;
	
	public Student() {
		
	
	}
	public Student(long sid, String sname, String dept, int year) {
		
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
		this.year = year;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
