package hms.entity;
import java.util.*;

public class Appointment {
	
	private String Appid;
	private Date AppointmentDate;
	private String AppointmentTime;	
	private String Status;
	private Patient patient;			
	private Doctor doctor;
	private Set<MedicalHistory> medicalHistories;
	
	//Default constructor
	public Appointment() {
		super();
	}
   //constructor using fields

	public Appointment(String appid, Date appointmentDate, String appointmentTime, String status, Patient patient,
			Doctor doctor, Set<MedicalHistory> medicalHistories) {
		super();
		Appid = appid;
		AppointmentDate = appointmentDate;
		AppointmentTime = appointmentTime;
		Status = status;
		this.patient = patient;
		this.doctor = doctor;
		this.medicalHistories = medicalHistories;
	}
		
	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAppid() {
		return Appid;
	}
	
	public void setAppid(String appid) {
		Appid = appid;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Date getAppointmentDate() {
		return AppointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		AppointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		AppointmentTime = appointmentTime;
	}
	
	public Set<MedicalHistory> getMedicalHistories() {
		return medicalHistories;
	}
	public void setMedicalHistories(Set<MedicalHistory> medicalHistories) {
		this.medicalHistories = medicalHistories;
	}

	//toString method
	@Override
	public String toString() {
		return "Appointment [Appid=" + Appid + ", AppointmentDate=" + AppointmentDate + ", AppointmentTime="
				+ AppointmentTime + ", Status=" + Status + ", patient=" + patient + ", doctor=" + doctor
				+ ", medicalHistories=" + medicalHistories + "]";
	}
	
	
	
	
}
