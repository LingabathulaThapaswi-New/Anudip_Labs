package hms.entity;

public class Room {

	private String P_id;	   
	private String Rno;	   
	private Patient patient;	   	   
	private String Roomtype;	   
	private String Period;
	//Default Constructor
	public Room() {

	}
	//Constructor with Parameters
	public Room(String p_id, String rno, Patient patient, String roomtype, String period) {
		super();
		P_id = p_id;
		Rno = rno;
		this.patient = patient;
		Roomtype = roomtype;
		Period = period;
	}
	//Getter and setter methods
	//getter method for room Room id
	

	public String getP_id() {
		return P_id;
	}
	public void setP_id(String p_id) {
		P_id = p_id;
	}
	public String getRno() {
		return Rno;
	}
	//setter method for room id
	public void setRno(String rno) {
		Rno = rno;
	}
	//getter method for patient
	public Patient getPatient() {
		return patient;
	}
	//setter method for patient
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	//getter method for room type
	public String getRoomtype() {
		return Roomtype;
	}
	//setter method for room type
	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}
	//getter method for period
	public String getPeriod() {
		return Period;
	}
	//setter method for period
	public void setPeriod(String period) {
		Period = period;
	}
	//toString method
	@Override
	public String toString() {
		return "Room [P_id=" + P_id + ", Rno=" + Rno + ", patient=" + patient + ", Roomtype=" + Roomtype + ", Period="
				+ Period + "]";
	}



}
