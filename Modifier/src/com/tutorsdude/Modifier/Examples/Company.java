package com.tutorsdude.Modifier.Examples;

public class Company {
    public static String companyName;
    public static  String companyLocation;
    public String employeeName;
    public int empId;
    public int salary;

    public static void companyInfo(){
        System.out.println("Company information.....");
    }
    public void employeInfo(){
        System.out.println("Employee information.....");
    }

    public void printAll(){
        System.out.println("Company Name : " + companyName);
        System.out.println("Company location : " + companyLocation);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee id : " + empId);
        System.out.println("Employee salary : " + salary);
    }

}
