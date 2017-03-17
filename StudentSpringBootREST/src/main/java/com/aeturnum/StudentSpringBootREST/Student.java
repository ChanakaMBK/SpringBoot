package com.aeturnum.StudentSpringBootREST;

/**
 * @author chanaka.k
 *
 */

public class Student {
	
	private final long id;
	private final String fname;
	private final String lname;
	private final String city;
	private final String bdy;
	private final String noOfSubjects;
	
	public Student(long id, String fname, String lname, String city, String bdy, String noOfSubjects) {
		this.id				= id;
		this.fname			= fname;
		this.lname			= lname;
		this.city			= city;
		this.bdy			= bdy;
		this.noOfSubjects	= noOfSubjects;
	}

	public long getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getCity() {
		return city;
	}

	public String getBdy() {
		return bdy;
	}

	public String getNoOfSubjects() {
		return noOfSubjects;
	}
	
	@Override
	public String toString() {
		return "{Student Details : First Name :>> " +fname+ "Last Name :>>" +lname+ "City :>>"+ city + "Birth Day :>> "+ bdy + "No of subjects :>> " +noOfSubjects +  "}";
	}
}
