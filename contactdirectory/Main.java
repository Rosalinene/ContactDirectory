
package contactdirectory;

import java.util.Scanner;
import contact_info.*;
/**
 *
 * @author huong
 */
public class Main 
{
    public static void main(String[] args) 
    {
        ContactDirectory contact_directory = new ContactDirectory();
        Scanner scanner = new Scanner(System.in);
        boolean is_running = true;
        
        while (is_running) 
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
                    is_running = false;    
                    break;
                    
                case Action.DISPLAY_CONTACT_LIST:
                    contact_directory.displayContactList();
                    break;
                    
                case Action.DISPLAY_CONTACT_INFO:
                    System.out.println("Enter the index of the contact you'd like to display: ");
                    int display_position = scanner.nextInt();
                    contact_directory.displayContact(display_position);
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
                    String work_phone = scanner.nextLine();
                    System.out.print("Cell phone number: ");
                    String cell_phone = scanner.nextLine();
                    contactInfo new_contact = new contactInfo(name, address, email, work_phone, cell_phone);
                    contact_directory.addContact(new_contact);
                    break;
                    
                case Action.REMOVE_CONTACT:
                    contact_directory.displayContactList();
                    System.out.println("Enter the index of the contact you'd like to remove: ");
                    int remove_position = scanner.nextInt();
                    contact_directory.removeContact(remove_position);
                    break;
                    
                case Action.UPDATE_CONTACT:
                    contact_directory.displayContactList();
                    
                    System.out.println("Enter the index of the contact you'd like to update: ");
                    int update_position = scanner.nextInt();
                    System.out.println("Enter the updated information: ");
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String update_name = scanner.nextLine();
                    System.out.print("Address: ");
                    String update_address = scanner.nextLine();
                    System.out.print("Email: ");
                    String update_email = scanner.nextLine();
                    System.out.print("Work phone number: ");
                    String update_work_phone = scanner.nextLine();
                    System.out.print("Cell phone number: ");
                    String update_cell_phone = scanner.nextLine();
                    
                    contactInfo update_contact = new contactInfo(update_name, update_address, update_email, update_work_phone, update_cell_phone);
                    contact_directory.updateContact(update_contact, update_position);
                    break;
                    
                case Action.READ_CONTACTS:
                    scanner.nextLine();
                    System.out.print("Enter path to file: ");
                    String read_file = scanner.nextLine();
                    fileManagement fm = new fileManagement(contact_directory);
                    fm.fromFile(read_file);
                    break;
                    
                case Action.WRITE_CONTACTS:
                    scanner.nextLine();
                    System.out.print("Enter path to file you want to write to: ");
                    String write_file = scanner.nextLine();
                    fileManagement fm1 = new fileManagement(contact_directory);
                    fm1.toFile(write_file);
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    
}
