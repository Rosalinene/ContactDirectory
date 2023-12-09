
package contact_info;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class fileManagement 
{
    private ContactDirectory contactDirectory;

    public fileManagement(ContactDirectory contactDirectory) 
    {
        this.contactDirectory = contactDirectory;
    }
    
    public void fromFile(String filepath) 
    {
        File contact_file = new File(filepath);
        
        if (contact_file.exists()) 
        {
            try 
            {
                contactDirectory.contact_list.clear();
                Scanner scanner = new Scanner(contact_file);
                
                while (scanner.hasNextLine()) 
                {
                    String line = scanner.nextLine();
                    contactInfo contact = new contactInfo();
                    contact.fromString(line);
                    contactDirectory.addContact(contact);
                }
                scanner.close();
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found: " + contact_file.getName());
            }
        }
        else 
        {
            System.out.println("File does not exist: " + contact_file.getName());
        }
    }
    public void toFile(String filepath) 
    {
        try 
        {
            File contact_file = new File(filepath);
            contact_file.delete();
            contact_file.createNewFile();
            System.out.println("File created successfully: " + contact_file);
            System.out.println(contactDirectory.contact_list);

            String contact_string = "";
            Iterator<contactInfo> it = contactDirectory.contact_list.iterator();
            
            while (it.hasNext()) 
            {
                contactInfo contact = it.next();
                contact_string += contact.toString() + "\n";
            }
            FileWriter fw = new FileWriter(contact_file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contact_string);
            bw.close();
            fw.close();
        }
        catch (IOException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}//End fileManagement
