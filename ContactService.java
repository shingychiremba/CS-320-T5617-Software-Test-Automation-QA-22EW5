import java.util.ArrayList;

public class ContactService {
   /* this contains a list of contacts */
   private ArrayList<Contact> contacts;

   /* default constructor */
   public ContactService() {
       contacts = new ArrayList<>();
   }

   /* this method adds a given contact to our list if its not already present */
   public boolean add(Contact contact) {
       /* first we determine if the contact is already present */
       boolean alreadyPresent = false;
       for (Contact c : contacts) {
           if (c.equals(contact)) {
               alreadyPresent = true;
           }
       }
       /* if the contact is not present then we add it, and return true */
       if (!alreadyPresent) {
           contacts.add(contact);
           System.out.println("Contact Added!");
           return true;
       } else {
           System.out.println("Contact Exists");
           return false;
       }
   }
