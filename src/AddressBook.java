import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
   static List<ContactPerson> listOfcontact= new ArrayList<ContactPerson>();
    public static void addContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name :");
        String firstName = sc.next();
        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        System.out.println("Enter The Address :");
        String address = sc.next();
        System.out.println("Enter The City :");
        String city = sc.next();
        System.out.println("Enter The State :");
        String state = sc.next();
        System.out.println("Enter The Zip Number :");
        int zip = sc.nextInt();
        System.out.println("Enter Phone Number :");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter The Email :");
        String email = sc.next();
        ContactPerson contactPerson=new ContactPerson(firstName,lastName,address,city,state,zip,phoneNumber,email);
        listOfcontact.add(contactPerson);


    }
}
