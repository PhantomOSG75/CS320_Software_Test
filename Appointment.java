package Appointment;


import java.util.Date;


public class Appointment {
	private String apptId;
	private Date apptDate;
	private String apptDesc;
	
	
	public Appointment(String apptDesc, Date apptdate, String apptId) {
		if (apptId == null|| apptId.length() > 10 ) {
			throw new IllegalArgumentException("Appointment ID must be less than 10 characters and cannot be empty");
		}
		
		if (apptDate == null || apptDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}
		
		if (apptDesc == null || apptDesc.length() > 50) {
			throw new IllegalArgumentException("Description must be less than 50 characters and cannot be empty");
			}
		}
		
	
	//Getters
	public String getapptId() {
		return apptId;
	}
	
	public Date getapptDate() {
		return apptDate;
	}
	
	public String getapptdDesc() {
		return apptDesc;
	}
	
	//Setters
	public void SetApptDate(Date date) {
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Appointmene Date");
		}
		apptDate = date;
		}

	
	
	public void SetapptDesc(String desc) {
		if(desc == null || desc.length() > 50) {
			throw new IllegalArgumentException("Description Invalid");
		}
		apptDesc = desc;
		
	}
}
