
package contact_info;

import java.util.Iterator;
import java.util.LinkedList;

public class ContactDirectory 
{
    public LinkedList<contactInfo> contact_list;
    
    private boolean satifyFindCondition(contactInfo curr_contact, contactInfo query_contact) 
    {
        if (curr_contact.getName() == query_contact.getName()) 
        {
            return true;
        }
        if (curr_contact.getEmail() == query_contact.getEmail()) 
        {
            return true;
        }
        if (curr_contact.getWorkPhone() == query_contact.getWorkPhone()) 
        {
            return true;
        }
        if (curr_contact.getCellPhone() == query_contact.getCellPhone()) 
        {
            return true;
        }
        return false;
    }
    
    public ContactDirectory() 
    {
        contact_list = new LinkedList<contactInfo>();
    }
    
    public ContactDirectory(LinkedList<contactInfo> contact_list_) 
    {
        contact_list = contact_list_;
    }
    
    public void addContact(contactInfo contact, int position) 
    {
        contact_list.add(position, contact);
    }
    
    public void addContact(contactInfo contact) 
    {
        contact_list.addLast(contact);
    }
    
    public void removeContact(int position) 
    {
        contact_list.remove(position);
    }
    
    public void updateContact(contactInfo contact, int position) 
    {
        contact_list.set(position, contact);
    } 
    
    public ContactDirectory findContact(contactInfo contact) 
    {
        ContactDirectory satisfied_contacts = new ContactDirectory();
        Iterator<contactInfo> it = contact_list.iterator();
        
        while (it.hasNext()) 
        {
            contactInfo curr_contact = it.next();
            
            if (satifyFindCondition(curr_contact, contact)) 
            {
                satisfied_contacts.addContact(curr_contact);
            }
        }
        return satisfied_contacts;
    }
    
    public void displayContact(int position) 
    {
        if (position >= 0 && position < contact_list.size()) 
        {

            contactInfo contact = contact_list.get(position);

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
        int i = 0;
        Iterator<contactInfo> it = contact_list.iterator();
        
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
