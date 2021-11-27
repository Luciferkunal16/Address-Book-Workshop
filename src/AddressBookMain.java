import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook obj=new AddressBook();
        int choice;
        Scanner inp=new Scanner(System.in);
        do {
            System.out.println("1)Add Person in Addressbook");
            System.out.println("2)View Contact Person");
            choice=inp.nextInt();
            if(choice==1){
                obj.addContacts();
            }
            else if(choice==2){
                obj.viewContacts();
            }
        }while(choice!=3);
    }
}
