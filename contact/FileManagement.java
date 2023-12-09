
package contact;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class FileManagement 
{
    private ContactDirectory contactDirectory;

    public FileManagement(ContactDirectory contactDirectory) 
    {
        this.contactDirectory = contactDirectory;
    }
    
    public void fromFile(String filePath) 
    {
        File contactFile = new File(filePath);
        
        if (contactFile.exists()) 
        {
            try 
            {
                contactDirectory.contactList.clear();
                Scanner scanner = new Scanner(contactFile);
                
                while (scanner.hasNextLine()) 
                {
                    String line = scanner.nextLine();
                    ContactInfo contact = new ContactInfo();
                    contact.fromString(line);
                    contactDirectory.addContact(contact);
                }
                scanner.close();
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found: " + contactFile.getName());
            }
        }
        else 
        {
            System.out.println("File does not exist: " + contactFile.getName());
        }
    }
    public void toFile(String filePath) 
    {
        try 
        {
            File contactFile = new File(filePath);
            contactFile.delete();
            contactFile.createNewFile();
            System.out.println("File created successfully: " + contactFile);
            System.out.println(contactDirectory.contactList);

            String contactString = "";
            Iterator<ContactInfo> it = contactDirectory.contactList.iterator();
            
            while (it.hasNext()) 
            {
                ContactInfo contact = it.next();
                contactString += contact.toString() + "\n";
            }
            FileWriter fw = new FileWriter(contactFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contactString);
            bw.close();
            fw.close();
        }
        catch (IOException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}//End fileManagement
