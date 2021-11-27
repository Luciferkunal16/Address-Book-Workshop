import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<ContactPerson> listOfcontact = new ArrayList<ContactPerson>();
    Scanner inp = new Scanner(System.in);

    public void addContacts() {
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
        ContactPerson contactPerson = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
        listOfcontact.add(contactPerson);


    }

    void viewContacts() {
        System.out.println(listOfcontact);
    }

    public void editPerson() {

        System.out.println("Enter the first name:");
        String firstName = inp.next();
        Iterator<ContactPerson> iterator = listOfcontact.listIterator();

        while (iterator.hasNext()) {

            ContactPerson person = iterator.next();

            if (firstName.equals(person.getFirstName())) {


                System.out.println("\nChoose the attribute you want to change:");
                System.out.println("1.Last Name\n2.Phone Number\n3.Address\n4.City\n5.State\n6.ZipCode\n Email");
                int choice = inp.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the correct Last Name :");
                        String lastName = inp.next();
                        person.setLastName(lastName);
                        break;
                    case 2:
                        System.out.println("Enter the correct Phone Number :");
                        long phoneNumber = inp.nextLong();
                        person.setPhoneNumber(phoneNumber);
                        break;
                    case 3:
                        System.out.println("Enter Address :");
                        String address = inp.next();
                        person.setAddress(address);
                        break;
                    case 4:
                        System.out.println("Enter the correct City :");
                        String city = inp.next();
                        person.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter the correct State :");
                        String state = inp.next();
                        person.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter the correct ZipCode :");
                        int zip = inp.nextInt();
                        person.setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter The Correct Email");
                        String email = inp.next();
                        person.setEmail(email);
                }

            }
        }

    }

    public void deletePerson() {

        System.out.println("Enter the first name of the person to be deleted");
        String firstName = inp.next();
        Iterator<ContactPerson> iterator = listOfcontact.listIterator();

        while (iterator.hasNext()) {

            ContactPerson person = iterator.next();

            if (firstName.equals(person.getFirstName())) {
                listOfcontact.remove(person);
                return;
            }
        }
    }
}
