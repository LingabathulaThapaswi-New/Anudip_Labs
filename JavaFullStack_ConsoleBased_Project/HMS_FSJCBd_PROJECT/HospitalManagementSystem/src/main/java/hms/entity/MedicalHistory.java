package hms.entity;//user-defined Package
//import Built-in Packages
import java.util.Date;

public class MedicalHistory {


	private String Mid;    
	private Date Dateofexamination;   
	private String Diagnosis;
	private String Prescription;

	private Patient patient;
	private Doctor doctor;
	private Appointment appointment;

	//Default Constructor
	public MedicalHistory() {
		super();
	}
	//Constructor with fields

	public MedicalHistory(String mid, Date dateofexamination, String diagnosis, String prescription, Patient patient,
			Doctor doctor, Appointment appointment) {
		super();
		Mid = mid;
		Dateofexamination = dateofexamination;
		Diagnosis = diagnosis;
		Prescription = prescription;
		this.patient = patient;
		this.doctor = doctor;
		this.appointment = appointment;
	}
	
	//getter and setter methods
	//getter method for Medical history id
	public String getMid() {
		return Mid;
	}

	//setter method for Medical history id
	public void setMid(String mid) {
		Mid = mid;
	}
	//getter method for patient
	public Patient getPatient() {
		return patient;
	}
	//setter method for patient
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	//getter method for date of examination
	
	//getter method for Diagnosis
	public String getDiagnosis() {
		return Diagnosis;
	}
	public Date getDateofexamination() {
		return Dateofexamination;
	}

	public void setDateofexamination(Date dateofexamination) {
		Dateofexamination = dateofexamination;
	}

	//setter method for Diagnosis
	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	//toString Method

	@Override
	public String toString() {
		return "MedicalHistory [Mid=" + Mid + ", Dateofexamination=" + Dateofexamination + ", Diagnosis=" + Diagnosis
				+ ", Prescription=" + Prescription + ", patient=" + patient + ", doctor=" + doctor + ", appointment="
				+ appointment + "]";
	}
	

}
