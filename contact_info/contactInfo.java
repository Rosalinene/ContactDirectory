/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact_info;

import java.io.Serializable;

/**
 *
 * @author huong
 */
public class contactInfo implements Serializable 
{
    private String name;
    private String address;
    private String emailAddress;
    private String workPhoneNumber;
    private String cellPhoneNumber;

    // Constructor
    public contactInfo(String name, String address, String emailAddress, String workPhoneNumber, String cellPhoneNumber) 
    {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.workPhoneNumber = workPhoneNumber;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }
    
    public void setName(String name_) {
        if (isValidName(name_)) {
            name = name_;
        }
    }
    
    public void setAddress(String address_) {
        if (isValidAddress(address_)){
            address = address_;
        }
    }
    
    public void setEmail(String email_) {
        if (isValidEmail(email_)) {
            email = email_;
        }
        
    }
    public void setWorkPhone(String work_phone_) {
        if (isValidPhone(work_phone_)) {
            work_phone = work_phone_;
        }
    }
    
    public void setCellPhone(String cell_phone_) {
        if (isValidPhone(cell_phone_)) {
            cell_phone = cell_phone_;
        }
    }
   
     private boolean isValidName(String name_) {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here
        
        if (ret) {
            System.out.println("Name valid!");
            return true;
        }
        System.out.println("Name not valid!");
        return false;
    }
    private boolean isValidAddress(String address_) {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) {
            System.out.println("Address valid!");
            return true;
        }
        System.out.println("Address not valid!");
        return false;
    }
    private boolean isValidEmail(String email_) {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) {
            System.out.println("Email valid!");
            return true;
        }
        System.out.println("Email not valid!");
        return false;
    }
    private boolean isValidPhone(String phone_) {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) {
            System.out.println("Phone number valid!");
            return true;
        }
        System.out.println("Phone number not valid!");
        return false;
    }
    public void fromString(String txt) {
        String[] tokens = txt.split("\t");
        name = tokens[0];
        address = tokens[1];
        email = tokens[2];
        work_phone = tokens[3];
        cell_phone = tokens[4];
    }
    
    @Override
    public String toString() 
    {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                '}';
    }
}
