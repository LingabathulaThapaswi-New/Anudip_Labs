<br/>
<p align="center">
  <h1 align="center">Hospital Management System</h1>

  <p align="center">
    A Console-Based Hospital management System is more efficient in registration of their patients and manage appointments, records of patients. It enables doctors and admin to view and modify appointments schedules if required. The purpose of this project is to computerize all details regarding patient details and doctor details.
    <br/>
    <br/>
    <a href="https://github.com/NavaneethaBonala/Java-Project"> <strong> Github link for the Hospital Management System Project  »</strong></a>
    <br/>
  </p>
</p>

## Table Of Contents 

- [About the Project](#about-the-project)
- [Features](#features)
  - [Admin Module](#admin-module)
    - [Functionalities](#functionalities) 
      - [1.UserType Management](#1-usertype-management)
      - [2.Patient Management](#2-patient-management)
      - [3.Doctor Management](#3-doctor-management)
      - [4.Appointment Management](#4-appointment-management)
      - [5.Medical History Management](#5-medical-history-management)
      - [6.Room Management](#6-room-management)
  - [Patient Module](#patient-module)
    - [Functionalities](#functionalities) 
      - [1.Personal Information](#1-personal-information)
      - [2.View My Appointments](#2-view-my-appointments)
      - [3.View Medical History](#3-view-my-medical-history)
      - [4.Update patient Details](#4-update-patient-details)
      - [5.Change Password](#5-change-password)
  - [Doctor Module](#doctor-module)
     - [Functionalities](#functionalities) 
        - [1.Personal Information](#1-personal-information)
        - [2.View My Appointments](#2-view-my-appointments)
        - [3.View Assigned Patients list](#3-view-assigned-patient-list)
        - [4.Treat Patient](#4-treat-patient)
        - [5.Change Password](#5-change-password)
  - [Validations](#validations)
      - [1.Validate Email](#1-validate-email)
      - [2.Validate Blood Group](#2-validate-blood-group)
      - [3.Validate Gender](#3-validate-gender)
      - [4.Validate Integer Input](#4-validate-integer-input)
      - [5.Validate Phone Number](#5-validate-phone-number)
      - [6.Validate User Password](#6-validate-user-password)

# About The Project

The Hospital Management System (HMS) serves as a comprehensive digital tool for hospitals, streamlining various administrative tasks and ensuring secure management of patient information. It includes user authentication to maintain confidentiality and access control, with separate login credentials and access levels for Admins, Doctors, and Patients.

## <ins>Features</ins>

## Admin Module
The Admin Login feature is designed to provide secure access to authorized administrators who oversee the Hospital Management process. Administrators access the system through a login process, ensuring data privacy and system integrity.

Administrators must input their valid login credentials, including a username and password, to gain access. This authentication mechanism ensures that only authorized personnel can use the system's administrative functions.


Upon successful login, Admins gain access to a menu offering options such as,

### <ins>Functionalities</ins>

#### 1. UserType Management:   
Enabling actions like viewing all users, adding new doctor credentials, and changing passwords.

#### 2. Patient Management:  
Facilitating tasks such as viewing, adding, updating, and searching patient details.

#### 3. Doctor Management:  
Providing functionalities to Admin for managing doctor details, including viewing, adding, updating, and searching.

#### 4. Appointment Management:  
Allowing the Admin to view, schedule the appointments, confirmation, cancellation, updating the Date and Time of the appointment, and searching for appointment details.

#### 5. Medical History Management:
Enabling access to patient medical histories and search functionalities.

#### 6. Room Management:
Facilitating the to view room details, allocate the room to patient , update the room duration, and searching of room details based on patient IDs.

## Patient Module

Once Patient have completed the registration process, they can conveniently log in using Username and Password.
After Successful Log in , patient gain access to the functionality options such as,    

### <ins>Functionalities</ins>

#### 1. Personal Information:
Viewing their own details by entering their ID.

#### 2. View My Appointments:
They can view their scheduled appointments with the Doctor.

#### 3. View My Medical History:
Accessing their medical history using their ID.

#### 4. Update Patient Details:
Allowing for the update of contact details as Phone Number and Address

#### 5. Change Password:
Enabling Password change option in case user wants to update their password.



## Doctor Module

Doctor have to log in using Username and Password provided.
After Successful Log in , Doctor can access functionality options,

### <ins>Functionalities</ins>

#### 1. Personal Information:
Viewing their own details by entering their ID.

#### 2. View My Appointments:
They can view their scheduled appointments with the Patient using Doctor ID

#### 3. View Assigned Patient list:
Doctor can view the list of patients treated by him.
  
#### 4. Treat Patient:
After the Appointment is confirmed by the patient, they will visit the doctor for treatment.

#### 5. Change Password:
Enabling Password change option in case user wants to update their password.

## Validations:

#### 1. Validate Email:
In this case, it will allow user to insert an email in the E-mail format.
 
#### 2. Validate Blood Group:
In this case, it will only allow user to insert only(A+,A-,B+,B-,O+,O-,AB+,AB-) and it is a case sensitive it allow only upper case values.
 
#### 3. Validate Gender:
In this case, it will only allow user to insert(M,F,O) and it is not a case sensitive.
 
#### 4. Validate Integer Input:
In this case, it will allow user to insert only integer values.
 
#### 5. Validate Phone Number:
In this case, it will allow user to insert only 10 numbers (0-9).
 
#### 6. Validate User Password:
In this case, it will allow user to insert password as at least one upper case, at least one lower case, at least one number and at least one special character.
