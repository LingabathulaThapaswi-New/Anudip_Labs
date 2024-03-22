package hms.entity;

import java.util.Set;

public class Patient {
	
	private String Pid;
	private String Pfirstname;
	private String Plastname;
	private int age;
	private String Pgender;
	private String BloodGroup;
	private String Paddress;
	private String phoneNumber;
	
	private Set<Appointment> appointments;
	private Set<MedicalHistory> medhistories;
//	private Room room;
	private Doctor doctor;
	
	//Default constructor
	public Patient() {
		super();
	}
	//constructor using fields
		
		
	public Patient(String pid, String pfirstname, String plastname, int age, String pgender, String bloodGroup,
			String paddress, String phoneNumber, Set<Appointment> appointments, Set<MedicalHistory> medhistories,
			Doctor doctor) {
		super();
		Pid = pid;
		Pfirstname = pfirstname;
		Plastname = plastname;
		this.age = age;
		Pgender = pgender;
		BloodGroup = bloodGroup;
		Paddress = paddress;
		this.phoneNumber = phoneNumber;
		this.appointments = appointments;
		this.medhistories = medhistories;
		this.doctor = doctor;
	}
	
		
	public Patient(String pid, String pfirstname, String plastname, int age, String pgender, String bloodGroup,
			String paddress, String phoneNumber) {
		super();
		Pid = pid;
		Pfirstname = pfirstname;
		Plastname = plastname;
		this.age = age;
		Pgender = pgender;
		BloodGroup = bloodGroup;
		Paddress = paddress;
		this.phoneNumber = phoneNumber;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getPfirstname() {
		return Pfirstname;
	}
	public void setPfirstname(String pfirstname) {
		Pfirstname = pfirstname;
	}
	public String getPlastname() {
		return Plastname;
	}
	public void setPlastname(String plastname) {
		Plastname = plastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPgender() {
		return Pgender;
	}
	public void setPgender(String pgender) {
		Pgender = pgender;
	}
		
	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}


	public String getPaddress() {
		return Paddress;
	}
	public void setPaddress(String paddress) {
		Paddress = paddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public Set<MedicalHistory> getMedhistories() {
		return medhistories;
	}

	public void setMedhistories(Set<MedicalHistory> medhistories) {
		this.medhistories = medhistories;
	}


	@Override
	public String toString() {
		return "Patient [Pid=" + Pid + ", Pfirstname=" + Pfirstname + ", Plastname=" + Plastname + ", age=" + age
				+ ", Pgender=" + Pgender + ", BloodGroup=" + BloodGroup + ", Paddress=" + Paddress + ", phoneNumber="
				+ phoneNumber + ", appointments=" + appointments + ", medhistories=" + medhistories + ", doctor="
				+ doctor + "]";
	}


	
	
}
