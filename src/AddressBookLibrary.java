import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookLibrary {
    Scanner inp=new Scanner(System.in);
    HashMap<String,AddressBook> mapOfAddressBook= new HashMap();


    <addressBookname> void addressBook(AddressBook addressBook){
        System.out.println("Enter The Name Of Address Book");
        String addressBookname= inp.next();
        mapOfAddressBook.put(addressBookname,addressBook);



    }
    public static void main(String[] args) {
        System.out.println("Welcome to menu");
        System.out.println("1)Add addressbook ");
    }

}
