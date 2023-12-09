
package contact;

import java.util.Iterator;
import java.util.LinkedList;

public class ContactDirectory 
{
    public LinkedList<contactInfo> contactList;
    
    private boolean satifyFindCondition(contactInfo currentContact, contactInfo queryContact) 
    {
        if (currentContact.getName() == queryContact.getName()) 
        {
            return true;
        }
        if (currentContact.getEmail() == queryContact.getEmail()) 
        {
            return true;
        }
        if (currentContact.getWorkPhone() == queryContact.getWorkPhone()) 
        {
            return true;
        }
        if (currentContact.getCellPhone() == queryContact.getCellPhone()) 
        {
            return true;
        }
        return false;
    }
    
    public ContactDirectory() 
    {
        contactList = new LinkedList<contactInfo>();
    }
    
    public ContactDirectory(LinkedList<contactInfo> contactList_) 
    {
        contactList = contactList_;
    }
    
    public void addContact(contactInfo contact, int position) 
    {
        contactList.add(position, contact);
    }
    
    public void addContact(contactInfo contact) 
    {
        contactList.addLast(contact);
    }
    
    public void removeContact(int position) 
    {
        if (position >= 0 && position < contactList.size()) 
        {
            contactList.remove(position);
        } 
        else 
        {
            System.out.println("Invalid contact index. No contact removed.");
        }
    }
    
    public void updateContact(contactInfo contact, int position) 
    {
        contactList.set(position, contact);
    } 
    
    public ContactDirectory findContact(contactInfo contact) 
    {
        ContactDirectory satisfiedContacts = new ContactDirectory();
        Iterator<contactInfo> it = contactList.iterator();
        
        while (it.hasNext()) 
        {
            contactInfo currentContact = it.next();
            
            if (satifyFindCondition(currentContact, contact)) 
            {
                satisfiedContacts.addContact(currentContact);
            }
        }
        return satisfiedContacts;
    }
    
    public void displayContact(int position) 
    {
        if (position >= 0 && position < contactList.size()) 
        {

            contactInfo contact = contactList.get(position);

            System.out.println("---------- Contact info ----------");
            System.out.println("Name: " + contact.getName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Work phone number: " + contact.getWorkPhone());
            System.out.println("Cell phone number: " + contact.getCellPhone());
            System.out.println("--------------- End ---------------");
        }
        else 
        {
            System.out.println("Invalid contact index.\n");
        }
    }
    
    public void displayContactList() 
    {
        if (contactList.isEmpty()) 
        {
            System.out.println("There is no contact in the contact list.\n");
            return;
        }
        
        int i = 0;
        Iterator<contactInfo> it = contactList.iterator();
        
        while (it.hasNext()) 
        {
            contactInfo contact = it.next();
            
            if (i!= 0)
            {
                System.out.println("------------------------------");
            }
            System.out.println("Contact number [" + i + "]: " + contact.getName() + " - " + contact.getEmail());
            ++i;
        }
    }
}
