
package contact;

/**
 *
 * @author huong
 */
public class ContactInfo  
{
    private String name;
    private String address;
    private String email;
    private String workPhone;
    private String cellPhone;

    
    ContactInfo() 
    {}
    
    /**
     *
     * @param name_
     * @param address_
     * @param email_
     * @param workPhone_
     * @param cellPhone_
     */
    public ContactInfo(String name_, String address_, String email_, String workPhone_, String cellPhone_) 
    {
        this.name = name_;
        this.address = address_;
        this.email = email_;
        this.workPhone = workPhone_;
        this.cellPhone = cellPhone_;
    }// End Constructor
    
    /**
     *
     * @return
     */
    public String getName() 
    {
        return name;
    }//End getName() 

    /**
     *
     * @return
     */
    public String getAddress() 
    {
        return address;
    }//End getAddress() 

    /**
     *
     * @return
     */
    public String getEmail() 
    {
        return email;
    }//End getEmail() 

    /**
     *
     * @return
     */
    public String getWorkPhone() 
    {
        return workPhone;
    }//End getWorkPhone() 

    /**
     *
     * @return
     */
    public String getCellPhone() 
    {
        return cellPhone;
    }//End getCellPhone() 
    
    /**
     *
     * @param name_
     */
    public void setName(String name_) 
    {
        if (isValidName(name_)) 
        {
            name = name_;
        }//End if
    }//End setName
    
    /**
     *
     * @param address_
     */
    public void setAddress(String address_) 
    {
        if (isValidAddress(address_))
        {
            address = address_;
        }//End if
    }//End setAddress
    
    /**
     *
     * @param email_
     */
    public void setEmail(String email_) 
    {
        if (isValidEmail(email_)) 
        {
            email = email_;
        }//End if
    }//End setEmail

    /**
     *
     * @param workPhone_
     */
    public void setWorkPhone(String workPhone_) 
    {
        if (isValidPhone(workPhone_)) 
        {
            workPhone = workPhone_;
        }//End if
    }//End setWorkPhone
    
    /**
     *
     * @param cellPhone_
     */
    public void setCellPhone(String cellPhone_) 
    {
        if (isValidPhone(cellPhone_)) 
        {
            cellPhone = cellPhone_;
        }//End if
    }//End setCellPhone
   
     private boolean isValidName(String name_) 
     {
        boolean ret = !name_.isEmpty() && name_.matches("^[a-zA-Z\\s]+$");

        if (ret) 
        {
            System.out.println("Name valid!");
            return true;
        }//End if
        System.out.println("Name not valid!");
        return false;
    }//End isValidName
     
    private boolean isValidAddress(String address_) 
    {
        boolean ret = !address_.isEmpty();

        if (ret) 
        {
            System.out.println("Address valid!");
            return true;
        }//End if
        System.out.println("Address not valid!");
        return false;
    }//End isValidAddress
    
    private boolean isValidEmail(String email_) 
    {
        boolean ret = !email_.isEmpty() && email_.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

        if (ret) 
        {
            System.out.println("Email valid!");
            return true;
        }//End if
        System.out.println("Email not valid!");
        return false;
    }//End isValidEmail
    
    private boolean isValidPhone(String phone_) 
    {
        boolean ret = !phone_.isEmpty() && phone_.matches("^[0-9]+$");

        if (ret) 
        {
            System.out.println("Phone number valid!");
            return true;
        }//End if
        System.out.println("Phone number not valid!");
        return false;
    }//End isValidPhone
    
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
    }//End fromString

    /**
     *
     * @return
     */
    @Override
    public String toString() 
    {
        String msg;
        msg = String.join("\t", name, address, email, workPhone, cellPhone);
        //msg+= super.toString();
        
        return msg;
    }//End toString() 
}//End 
