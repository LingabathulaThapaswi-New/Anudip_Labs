package hms.entity;//user-defined Package
//import Built-in Packages
import java.util.Set;

public class Doctor {
	
	
	private String Did;	
	private String Dfirstname;
	private String Dlastname;	
	private String Dgender;
	private String specialization;
	private String email;
	
//	@OneToMany

	//private Patient patient;
	private Set<Patient> patients;
	
//	@OneToMany

	//private Appointment appointment;
	private Set<Appointment> appointments;
	private Set<MedicalHistory> medhistories;
	
	//Default constructor
	public Doctor() {
		super();
	}
  //constructor using fields
	public Doctor(String did, String dfirstname, String dlastname, String dgender, String specialization, String email,
			Set<Patient> patients, Set<Appointment> appointments, Set<MedicalHistory> medhistories) {
		super();
		Did = did;
		Dfirstname = dfirstname;
		Dlastname = dlastname;
		Dgender = dgender;
		this.specialization = specialization;
		this.email = email;
		this.patients = patients;
		this.appointments = appointments;
		this.medhistories = medhistories;
	}
  //getter and setter methods

	//getter method for first name

	
	public Set<MedicalHistory> getMedhistories() {
		return medhistories;
	}
	public void setMedhistories(Set<MedicalHistory> medhistories) {
		this.medhistories = medhistories;
	}
	public String getDid() {
		return Did;
	}
	
	public void setDid(String did) {
		Did = did;
	}
	public String getDfirstname() {
		return Dfirstname;
	}
	public void setDfirstname(String dfirstname) {
		Dfirstname = dfirstname;
	}
	public String getDlastname() {
		return Dlastname;
	}
	public void setDlastname(String dlastname) {
		Dlastname = dlastname;
	}
	public String getDgender() {
		return Dgender;
	}
	public void setDgender(String dgender) {
		Dgender = dgender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
		
		//toString method
	@Override
	public String toString() {
		return "Doctor [Did=" + Did + ", Dfirstname=" + Dfirstname + ", Dlastname=" + Dlastname + ", Dgender=" + Dgender
				+ ", specialization=" + specialization + ", email=" + email + ", patients=" + patients
				+ ", appointments=" + appointments + ", medhistories=" + medhistories + "]";
	}
		
}
