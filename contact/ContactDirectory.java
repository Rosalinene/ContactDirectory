
package contact;

import java.util.Iterator;
import java.util.LinkedList;

public class ContactDirectory 
{
    public LinkedList<ContactInfo> contactList;
    
    private boolean satifyFindCondition(ContactInfo currentContact, ContactInfo queryContact) 
    {
        if (currentContact.getName() == queryContact.getName()) 
        {
            return true;
        }//End if
        if (currentContact.getEmail() == queryContact.getEmail()) 
        {
            return true;
        }//End if
        if (currentContact.getWorkPhone() == queryContact.getWorkPhone()) 
        {
            return true;
        }//End if
        if (currentContact.getCellPhone() == queryContact.getCellPhone()) 
        {
            return true;
        }//End if
        return false;
    }//End satifyFindCondition
    
    public ContactDirectory() 
    {
        contactList = new LinkedList<ContactInfo>();
    }//End ContactDirectory() 
    
    public ContactDirectory(LinkedList<ContactInfo> contactList_) 
    {
        contactList = contactList_;
    }//End ContactDirectory
    
    public void addContact(ContactInfo contact, int position) 
    {
        contactList.add(position, contact);
    }//End addContact
    
    public void addContact(ContactInfo contact) 
    {
        contactList.addLast(contact);
    }//End addContact
    
    public void removeContact(int position) 
    {
        if (position >= 0 && position < contactList.size()) 
        {
            contactList.remove(position);
        } //End if
        else 
        {
            System.out.println("Invalid contact index. No contact removed.");
        }//End else
    }//End removeContact
    
    public void updateContact(ContactInfo contact, int position) 
    {
        contactList.set(position, contact);
    } //End updateContact
    
    public ContactDirectory findContact(ContactInfo contact) 
    {
        ContactDirectory satisfiedContacts = new ContactDirectory();
        Iterator<ContactInfo> it = contactList.iterator();
        
        while (it.hasNext()) 
        {
            ContactInfo currentContact = it.next();
            
            if (satifyFindCondition(currentContact, contact)) 
            {
                satisfiedContacts.addContact(currentContact);
            }//End if
        }//End while
        return satisfiedContacts;
    }//End findContact
    
    public void displayContact(int position) 
    {
        if (position >= 0 && position < contactList.size()) 
        {

            ContactInfo contact = contactList.get(position);

            System.out.println("---------- Contact info ----------");
            System.out.println("Name: " + contact.getName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Work phone number: " + contact.getWorkPhone());
            System.out.println("Cell phone number: " + contact.getCellPhone());
            System.out.println("--------------- End ---------------");
        }//End if
        else 
        {
            System.out.println("Invalid contact index.\n");
        }//End else
    }//End displayContact
    
    public void displayContactList() 
    {
        if (contactList.isEmpty()) 
        {
            System.out.println("There is no contact in the contact list.\n");
            return;
        }//End if
        
        int i = 0;
        Iterator<ContactInfo> it = contactList.iterator();
        
        while (it.hasNext()) 
        {
            ContactInfo contact = it.next();
            
            if (i!= 0)
            {
                System.out.println("------------------------------");
            }//End if
            System.out.println("Contact number [" + i + "]: " + contact.getName() + " - " + contact.getEmail());
            ++i;
        }//End while
    }//End displayContactList() 
}//End ContactDirectory 
