package com.associate.wfo.model;

//import org.springframework.stereotype.Component;

//@Component
public class MonthlyCounts {

	private String month;
	private Long fiveday;
	private Long eigthday;

	public MonthlyCounts(String month, Long fiveday, Long eigthday) {
		this.month = month;
		this.fiveday = fiveday;
		this.eigthday = eigthday;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getFiveday() {
		return fiveday;
	}

	public void setFiveday(Long fiveday) {
		this.fiveday = fiveday;
	}

	public Long getEigthday() {
		return eigthday;
	}

	public void setEigthday(Long eigthday) {
		this.eigthday = eigthday;
	}

}

