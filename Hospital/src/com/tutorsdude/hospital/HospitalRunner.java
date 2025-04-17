package com.tutorsdude.hospital;

import com.tutorsdude.hospital.gvt.*;

import javax.jws.soap.SOAPBinding;

public class HospitalRunner {
    public static void main(String[] args) {

        System.out.println("-----HOSPITAL 1-----");

        Hospital hospital1 = new Hospital();
        hospital1.name = "'Shree mallikarjuna multi speciality hospital'";
        System.out.println(hospital1.name);
        hospital1.ceoName = "Dr. Mallangouda";
        System.out.println(hospital1.ceoName);

        System.out.println("-----DEPARTMENT-----");

        Department dept1 = new Department();
        dept1.deptName = "Ortho";
        System.out.println(dept1.deptName);
        dept1.deptId = 1;
        System.out.println(dept1.deptId);
        dept1.chiefDoctor = "Mallangouda H.";
        System.out.println(dept1.chiefDoctor);

        hospital1.department= dept1;

        System.out.println("----DOCTOR-----");
        Doctor doc1 = new Doctor();
        doc1.name = "Mallangouda";
        System.out.println(doc1.name);
        doc1.available = "Everytime available";
        System.out.println(doc1.available);
        doc1.specialty = "M.S(Ortho),FWOC";
        System.out.println(doc1.specialty);

        hospital1.doctor = doc1;

        System.out.println("-----PATIENT-----");
        Patient patient1 = new Patient();
        patient1.name = "Tushar";
        System.out.println(patient1.name);
        patient1.age = 23;
        System.out.println(patient1.age);
        patient1.address = "29th ward burudi street hirejantkal, gangavathi";
        System.out.println(patient1.address);

        System.out.println("-----DISEASE-----");
        Disease disease1 = new Disease();
        disease1.name = "Back pain";
        System.out.println(disease1.name);
        disease1.causes = "Muscle or ligament strain";
        System.out.println(disease1.causes);

        hospital1.patient = patient1;
        hospital1.disease = disease1;
    }
}
