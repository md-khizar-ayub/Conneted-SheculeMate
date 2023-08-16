package com.associate.wfo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Associate", uniqueConstraints = { @UniqueConstraint(columnNames = { "associateId", "month" }) })
public class Associate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int associateId;
	private String email;
	private String month;
	@Temporal(TemporalType.DATE)
	private Date day1;
	@Temporal(TemporalType.DATE)
	private Date day2;
	@Temporal(TemporalType.DATE)
	private Date day3;
	@Temporal(TemporalType.DATE)
	private Date day4;
	@Temporal(TemporalType.DATE)
	private Date day5;
	@Temporal(TemporalType.DATE)
	private Date day6;
	@Temporal(TemporalType.DATE)
	private Date day7;
	@Temporal(TemporalType.DATE)
	private Date day8;
	private String submiteddate;

	public Associate() {}
	
	public Associate(int id, int associateId, String email, String month, Date day1, Date day2, Date day3, Date day4,
			Date day5, Date day6, Date day7, Date day8, String submiteddate) {
		super();
		this.id = id;
		this.associateId = associateId;
		this.email = email;
		this.month = month;
		this.day1 = day1;
		this.day2 = day2;
		this.day3 = day3;
		this.day4 = day4;
		this.day5 = day5;
		this.day6 = day6;
		this.day7 = day7;
		this.day8 = day8;
		this.submiteddate = submiteddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getDay1() {
		return day1;
	}

	public void setDay1(Date day1) {
		this.day1 = day1;
	}

	public Date getDay2() {
		return day2;
	}

	public void setDay2(Date day2) {
		this.day2 = day2;
	}

	public Date getDay3() {
		return day3;
	}

	public void setDay3(Date day3) {
		this.day3 = day3;
	}

	public Date getDay4() {
		return day4;
	}

	public void setDay4(Date day4) {
		this.day4 = day4;
	}

	public Date getDay5() {
		return day5;
	}

	public void setDay5(Date day5) {
		this.day5 = day5;
	}

	public Date getDay6() {
		return day6;
	}

	public void setDay6(Date day6) {
		this.day6 = day6;
	}

	public Date getDay7() {
		return day7;
	}

	public void setDay7(Date day7) {
		this.day7 = day7;
	}

	public Date getDay8() {
		return day8;
	}

	public void setDay8(Date day8) {
		this.day8 = day8;
	}

	public String getSubmiteddate() {
		return submiteddate;
	}

	public void setSubmiteddate(String submiteddate) {
		this.submiteddate = submiteddate;
	}

}
