/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactdirectory;

/**
 *
 * @author huong
 */
public class ContactDirectory {
 public static void main(String[] args) {
        ContactDirectory contactDirectory = new ContactDirectory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Find Contact");
            System.out.println("5. Display Contact");
            System.out.println("6. Display All Contacts");
            System.out.println("7. Save Contacts to File");
            System.out.println("8. Load Contacts from File");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    ContactInfo newContact = new ContactInfo();
                    // Get user input for new contact
                    contactDirectory.addContact(newContact);
                    break;
                case 2:
                    System.out.println("Enter the name of the contact to delete:");
                    String deleteName = scanner.nextLine();
                    contactDirectory.deleteContact(deleteName);
                    break;
                case 3:
                    System.out.println("Enter the name of the contact to update:");
                    String updateName = scanner.nextLine();
                    ContactInfo updatedContact = new ContactInfo();
                    // Get user input for updated contact
                    contactDirectory.updateContact(updateName, updatedContact);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact to find:");
                    String findName = scanner.nextLine();
                    ContactInfo foundContact = contactDirectory.findContact(findName);
                    if (foundContact != null) {
                        System.out.println(foundContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter the name of the contact to display:");
                    String displayName = scanner.nextLine();
                    contactDirectory.displayContact(displayName);
                    break;
                case 6:
                    contactDirectory.displayAllContacts();
                    break;
                case 7:
                    contactDirectory.saveContactsToFile();
                    break;
                case 8:
                    contactDirectory.loadContactsFromFile();
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
 }
}
