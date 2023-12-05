/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact_info;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author huong
 */
public class fileManagement 
{
    public static void writeToFile(String fileName, contactInfo contactInfo) 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) 
        {
            outputStream.writeObject(contactInfo);
            System.out.println("Contact information has been written to the file: " + fileName);
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read contact information from a file
    public static contactInfo readFromFile(String fileName) 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) 
        {
            contactInfo contactInfo = (contactInfo) inputStream.readObject();
            System.out.println("Contact information has been read from the file: " + fileName);
            return contactInfo;
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.err.println("Error reading from file: " + e.getMessage());
            return null;
        }
    }
}
