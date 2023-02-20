/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class EmployeesInfo {
    // create an global variabbble
    int userId;
    String firstName;
    String lastName;
    String occupation;
    int monthlySalay;

    // constructor
    public EmployeesInfo(int userId, String firstName, String lastName, String occupation, int monthlySalay){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.monthlySalay = monthlySalay;
        
    }
    
    // create an getter and setter methods
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getMonthlySalay() {
        return monthlySalay;
    }

    public void setMonthlySalay(int monthlySalay) {
        this.monthlySalay = monthlySalay;
    }
    
    
}
