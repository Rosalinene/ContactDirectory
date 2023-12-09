
package main;

import java.util.Scanner;
import contact.*;
/**
 *
 * @author huong
 */
public class Main 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        ContactDirectory contactDirectory = new ContactDirectory();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        
        while (isRunning) 
        {
            //contact_directory.displayContactList();
            System.out.println("Choose below options: \n" +
                                "0.Display contact list\n" + 
                                "1. Display contact info\n" + 
                                "2. Add contact\n" + 
                                "3. Remove contact\n" + 
                                "4. Update contact\n" + 
                                "5. Read contact list from file\n" +
                                "6. Save contact list to file\n" +
                                "7. Quit application");
            int action = scanner.nextInt();
            
            switch (action) 
            {
                case Action.QUIT_APP:
                    isRunning = false;    
                    break;
                    
                case Action.DISPLAY_CONTACT_LIST:
                    contactDirectory.displayContactList();
                    break;
                    
                case Action.DISPLAY_CONTACT_INFO:
                    System.out.println("Enter the index of the contact you'd like to display: ");
                    int displayPosition = scanner.nextInt();
                    contactDirectory.displayContact(displayPosition);
                    break;
                    
                case Action.ADD_CONTACT:
                    System.out.println("Enter the information of new contact: ");
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Work phone number: ");
                    String workPhone = scanner.nextLine();
                    System.out.print("Cell phone number: ");
                    String cellPhone = scanner.nextLine();
                    ContactInfo newContact = new ContactInfo(name, address, email, workPhone, cellPhone);
                    contactDirectory.addContact(newContact);
                    break;
                    
                case Action.REMOVE_CONTACT:
                    contactDirectory.displayContactList();
                    System.out.println("Enter the index of the contact you'd like to remove: ");
                    int removePosition = scanner.nextInt();
                    contactDirectory.removeContact(removePosition);
                    break;
                    
                case Action.UPDATE_CONTACT:
                    contactDirectory.displayContactList();
                    
                    System.out.println("Enter the index of the contact you'd like to update: ");
                    int updatePosition = scanner.nextInt();
                    System.out.println("Enter the updated information: ");
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Address: ");
                    String updateAddress = scanner.nextLine();
                    System.out.print("Email: ");
                    String updateEmail = scanner.nextLine();
                    System.out.print("Work phone number: ");
                    String updateWorkPhone = scanner.nextLine();
                    System.out.print("Cell phone number: ");
                    String updateCellPhone = scanner.nextLine();
                    
                    ContactInfo updateContact = new ContactInfo(updateName, updateAddress, updateEmail, updateWorkPhone, updateCellPhone);
                    contactDirectory.updateContact(updateContact, updatePosition);
                    break;
                    
                case Action.READ_CONTACTS:
                    scanner.nextLine();
                    System.out.print("Enter path to file: ");
                    String readFile = scanner.nextLine();
                    FileManagement fm = new FileManagement(contactDirectory);
                    fm.fromFile(readFile);
                    break;
                    
                case Action.WRITE_CONTACTS:
                    scanner.nextLine();
                    System.out.print("Enter path to file you want to write to: ");
                    String writeFile = scanner.nextLine();
                    FileManagement fm1 = new FileManagement(contactDirectory);
                    fm1.toFile(writeFile);
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    
}
