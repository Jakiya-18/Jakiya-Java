package com.tutorsdude.Modifier;

import com.tutorsdude.Modifier.Examples.Company;
import com.tutorsdude.Modifier.Examples.Village;
import com.tutorsdude.Modifier.Examples.MahindraCar;
import com.tutorsdude.Modifier.Examples.UnionBank;
import jdk.nashorn.tools.Shell;

public class ModRunner {
    public static void main(String[] args) {
        UnionBank bank = new UnionBank();

        UnionBank.bankName = "Union Bank";
        UnionBank.branchLocation = "India";

        bank.accountNumber = 352587565;
        bank.balance = 25000;
        bank.city = "Gangavathi";
        bank.phoneNum = 9972652838l;
        //bank.bankName = "Union Bank";

        bank.printAll();

        UnionBank.showBankDetails();                          //Static method
        bank.showBalance();                                  //Non static method

        System.out.println("*******************************************");

        Village village = new Village();
        Village.villageName = "Gangavathi";
        Village.pincode = 583227;

        //village.villageName = "Gangavathi";
        //village.pincode = 583227;
        village.famousFor = "Battada nadu";
        village.colleges = 5;
        village.weather = 25.8d;

        village.printAll();

        Village.villageDetails();                                //Static method
        village.displayHouses();                                 //Non static method

        System.out.println("*********************************************");

        MahindraCar car = new MahindraCar();
        MahindraCar.carName = "Thar";
        MahindraCar.brandName = "Mahindra";
        MahindraCar.factoryLocation = "Mumbai";

        car.modelName = "LX Hard top AT";
        car.color = "Black";
        car.price = 100000;

        car.printAll();

        MahindraCar car1 = new MahindraCar();
        car1.color = "Red";
        car1.modelName = "Earth edition AT";
        car1.price = 150000;

        car1.printAll();

        MahindraCar.carStopped();                        //Static method
        car.moving();                                    //Non static method

        System.out.println("*****************************************");

        Company company =  new Company();
        Company.companyName = "Infosys";
        Company.companyLocation = "Bangalore";

        company.employeeName = "Jakiya";
        company.empId = 01;
        company.salary = 36000;

        company.printAll();

        Company.companyInfo();                          //Static method
        company.employeInfo();                          //Non static method


    }
}
