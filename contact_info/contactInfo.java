
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
    contactInfo() 
    {}
    
    /**
     *
     * @param name_
     * @param address_
     * @param email_
     * @param workPhone_
     * @param cellPhone_
     */
    public contactInfo(String name_, String address_, String email_, String workPhone_, String cellPhone_) 
    {
        this.name = name_;
        this.address = address_;
        this.email = email_;
        this.workPhone = workPhone_;
        this.cellPhone = cellPhone_;
    }
    
    /**
     *
     * @return
     */
    public String getName() 
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getAddress() 
    {
        return address;
    }

    /**
     *
     * @return
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     *
     * @return
     */
    public String getWorkPhone() 
    {
        return workPhone;
    }

    /**
     *
     * @return
     */
    public String getCellPhone() 
    {
        return cellPhone;
    }
    
    /**
     *
     * @param name_
     */
    public void setName(String name_) 
    {
        if (isValidName(name_)) 
        {
            name = name_;
        }
    }
    
    /**
     *
     * @param address_
     */
    public void setAddress(String address_) 
    {
        if (isValidAddress(address_))
        {
            address = address_;
        }
    }
    
    /**
     *
     * @param email_
     */
    public void setEmail(String email_) 
    {
        if (isValidEmail(email_)) 
        {
            email = email_;
        }
        
    }

    /**
     *
     * @param workPhone_
     */
    public void setWorkPhone(String workPhone_) 
    {
        if (isValidPhone(workPhone_)) 
        {
            workPhone = workPhone_;
        }
    }
    
    /**
     *
     * @param cellPhone_
     */
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
        boolean ret = !name_.isEmpty() && name_.matches("^[a-zA-Z\\s]+$");

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
        boolean ret = !address_.isEmpty();

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
        boolean ret = !email_.isEmpty() && email_.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

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
        boolean ret = !phone_.isEmpty() && phone_.matches("^[0-9]+$");

        if (ret) 
        {
            System.out.println("Phone number valid!");
            return true;
        }
        System.out.println("Phone number not valid!");
        return false;
    }
    
    /**
     *
     * @param txt
     */
    public void fromString(String txt) 
    {
        String[] tokens = txt.split("\t");
        name = tokens[0];
        address = tokens[1];
        email = tokens[2];
        workPhone = tokens[3];
        cellPhone = tokens[4];
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() 
    {
        String msg;
        msg = "contactInfo{" + "name=" + name + ", address=" + address + ", email=" + email + ", workPhone=" + workPhone + ", cellPhone=" + cellPhone + '}';
        //msg+= super.toString();
        
        return msg;
    }
}
