/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EmployeesInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    // create an global variabbble
//    private int userId;
//    private String firstName;
//    private String lastName;
//    private String occupation;
//    private int monthlySalay;
    
    // create an arrayList where it is EmployeesInfo types's data are store
    static ArrayList<EmployeesInfo> userInformation = new ArrayList();    

    public static void addInformation(){
        userInformation.add(new EmployeesInfo(10, "Ram", "Nepali", "Teaching", 10000));
        userInformation.add(new EmployeesInfo(20, "Shiyan", "Maharjan", "Agricutlural", 10000));
        userInformation.add(new EmployeesInfo(30, "Jon", "Nepali", "Singing", 10000));
    }
    
    // creat message methods where print the some optional message
    public static void messages(){
        // print the message
        System.out.println("\nChoose the option that you want to proceed. enter the 1, 2, 3, 4");
        System.out.println("  1. Do you want to see the employee information?");
        System.out.println("  2. Do you want to see the occupation list");
        System.out.println("  3. Do you want the name of our staffs");
        System.out.println("  4. Quit the system.\n");
    }
    
    // main methods
    public static void main(String []args){
        addInformation(); // call the addInformation methods
        Scanner sc = new Scanner(System.in); // create an object of Scanner methods

        // print the some message
        System.out.println("---------------------------------------------------");
        System.out.println("Hello sir! Welcome to my online system.");
        System.out.println("---------------------------------------------------");
        
        OUTER:
        while (true) {
            messages(); // call the message methods
            // ask the user input
            System.out.print("Enter the valid input: ");
            int askQucation = sc.nextInt();
            System.out.print("\n");
            switch (askQucation) {
                case 1:
                    System.out.println("This is the information of Employees.");
                    for(EmployeesInfo employeeInfo:userInformation){
                        System.out.println("User ID: "+ employeeInfo.getUserId());
                        System.out.println("First Name: "+ employeeInfo.getFirstName());
                        System.out.println("Last Name: "+ employeeInfo.getLastName());
                        System.out.println("Salary: "+ employeeInfo.getMonthlySalay());
                    }   break;
                case 2:        
                    System.out.println("This is the Occupations");
                    for(EmployeesInfo employeeInfo:userInformation){
                        System.out.println("Occupation: "+ employeeInfo.getOccupation());
                    }   break;
                case 3:
                    for(EmployeesInfo employeeInfo:userInformation){
                        System.out.println("This is the Name of Staffs");
                        System.out.println("First Name: "+ employeeInfo.getFirstName());
                        System.out.println("Last Name: "+ employeeInfo.getLastName());
                    }   break;
                case 4:
                    System.out.println("Thank you.");
                    break OUTER; // program is xeit (stop the while loop)
                default:
                    System.out.println("*********************");
                    System.out.println("   Invalid input!");
                    System.out.println("*********************");
                    break;
            }
        }
    }
}