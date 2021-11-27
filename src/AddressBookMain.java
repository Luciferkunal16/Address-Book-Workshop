import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook obj=new AddressBook();
        int choice;
        Scanner inp=new Scanner(System.in);
        do {
            System.out.println("1)Add Person in Addressbook");
            System.out.println("2)View Contact Person");
            System.out.println("3)Edit Contact");
            System.out.println("4)Delete Person");
            choice=inp.nextInt();
            if(choice==1){
                obj.addContacts();
            }
            else if(choice==2){
                obj.viewContacts();
            }
            else if(choice ==3){
                obj.editPerson();

            }
            else if(choice==4){
                obj.deletePerson();
            }
        }while(choice!=5);
    }
}
