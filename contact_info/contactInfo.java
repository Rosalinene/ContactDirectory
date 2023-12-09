
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
    private String email;
    private String workPhone;
    private String cellPhone;

    // Constructor
    public contactInfo(String name_, String address_, String email_, String workPhone_, String cellPhone_) 
    {
        this.name = name_;
        this.address = address_;
        this.email = email_;
        this.workPhone = workPhone_;
        this.cellPhone = cellPhone_;
    }

    public String getName() 
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getEmailAddress() 
    {
        return email;
    }

    public String getWorkPhoneNumber() 
    {
        return workPhone;
    }

    public String getCellPhoneNumber() 
    {
        return cellPhone;
    }
    
    public void setName(String name_) 
    {
        if (isValidName(name_)) 
        {
            name = name_;
        }
    }
    
    public void setAddress(String address_) 
    {
        if (isValidAddress(address_))
        {
            address = address_;
        }
    }
    
    public void setEmail(String email_) 
    {
        if (isValidEmail(email_)) 
        {
            email = email_;
        }
        
    }
    public void setWorkPhone(String workPhone_) 
    {
        if (isValidPhone(workPhone_)) 
        {
            workPhone = workPhone_;
        }
    }
    
    public void setCellPhone(String cellPhone_) 
    {
        if (isValidPhone(cellPhone_)) 
        {
            cellPhone = cellPhone_;
        }
    }
   
     private boolean isValidName(String name_) 
     {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here
        
        if (ret) 
        {
            System.out.println("Name valid!");
            return true;
        }
        System.out.println("Name not valid!");
        return false;
    }
     
    private boolean isValidAddress(String address_) 
    {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) 
        {
            System.out.println("Address valid!");
            return true;
        }
        System.out.println("Address not valid!");
        return false;
    }
    
    private boolean isValidEmail(String email_) 
    {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) 
        {
            System.out.println("Email valid!");
            return true;
        }
        System.out.println("Email not valid!");
        return false;
    }
    
    private boolean isValidPhone(String phone_) 
    {
        // ret stands for a condition to be added later on
        boolean ret = true;

        // code to check valid here

        if (ret) 
        {
            System.out.println("Phone number valid!");
            return true;
        }
        System.out.println("Phone number not valid!");
        return false;
    }
    
    public void fromString(String txt) 
    {
        String[] tokens = txt.split("\t");
        name = tokens[0];
        address = tokens[1];
        email = tokens[2];
        workPhone = tokens[3];
        cellPhone = tokens[4];
    }

    @Override
    public String toString() {
        return "contactInfo{" + "name=" + name + ", address=" + address + ", email=" + email + ", workPhone=" + workPhone + ", cellPhone=" + cellPhone + '}';
    }
    
    
}
