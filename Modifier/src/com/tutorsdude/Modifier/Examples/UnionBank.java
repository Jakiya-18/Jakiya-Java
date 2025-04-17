package com.tutorsdude.Modifier.Examples;

public class UnionBank {
    public int accountNumber;
    public static String bankName;
    public String city;
    public int balance;
    public long phoneNum;
    public static String branchLocation;

    public static void showBankDetails(){
        System.out.println("Bank details.....");
    }

    public void showBalance(){
        System.out.println("Remaining balanceee....");
    }

public void printAll(){
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Bank name : " + bankName);
    System.out.println("City : " + city);
    System.out.println("Account balance : " + balance);
    System.out.println("Phone Number : " + phoneNum);
    System.out.println("Branch location : " + branchLocation);


}

}
