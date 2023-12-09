
package contact_info;

import java.util.Iterator;
import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactDirectory 
{
    private LinkedList<ContactInfo> contact_list;
    private boolean satifyFindCondition(ContactInfo curr_contact, ContactInfo query_contact) {
        if (curr_contact.getName() == query_contact.getName()) {
            return true;
        }
        if (curr_contact.getEmail() == query_contact.getEmail()) {
            return true;
        }
        if (curr_contact.getWorkPhone() == query_contact.getWorkPhone()) {
            return true;
        }
        if (curr_contact.getCellPhone() == query_contact.getCellPhone()) {
            return true;
        }
        return false;
    }
    public ContactDirectory() {
        contact_list = new LinkedList<ContactInfo>();
    }
    public ContactDirectory(LinkedList<ContactInfo> contact_list_) {
        contact_list = contact_list_;
    }
    public void addContact(ContactInfo contact, int position) {
        contact_list.add(position, contact);
    }
    public void addContact(ContactInfo contact) {
        contact_list.addLast(contact);
    }
    public void removeContact(int position) {
        contact_list.remove(position);
    }
    public void updateContact(ContactInfo contact, int position) {
        contact_list.set(position, contact);
    } 
    public ContactDirectory findContact(ContactInfo contact) {
        ContactDirectory satisfied_contacts = new ContactDirectory();
        Iterator<ContactInfo> it = contact_list.iterator();
        while (it.hasNext()) {
            ContactInfo curr_contact = it.next();
            if (satifyFindCondition(curr_contact, contact)) {
                satisfied_contacts.addContact(curr_contact);
            }
        }
        return satisfied_contacts;
    }
    public void displayContact(int position) {
        ContactInfo contact = contact_list.get(position);
        System.out.println("---------- Contact info ----------");
        System.out.println("Name: " + contact.getName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Work phone number: " + contact.getWorkPhone());
        System.out.println("Cell phone number: " + contact.getCellPhone());
        System.out.println("--------------- End ---------------");
    }
    public void displayContactList() {
        System.out.println("====================== Contact List ======================");
        int i = 0;
        Iterator<ContactInfo> it = contact_list.iterator();
        while (it.hasNext()) {
            ContactInfo contact = it.next();
            if (i!= 0){
                System.out.println("------------------------------");
            }
            System.out.println("Contact number [" + i + "]: " + contact.getName() + " - " + contact.getEmail());
            ++i;
        }
        System.out.println("=========================== End ===========================");
    }
}
