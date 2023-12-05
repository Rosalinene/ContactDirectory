/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact_info;

/**
 *
 * @author huong
 */
public class contactInfo 
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
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
