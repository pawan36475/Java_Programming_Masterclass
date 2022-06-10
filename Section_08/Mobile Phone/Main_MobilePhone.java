import java.util.*;

public class Main_MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0000 1111 2222");

    private static void startPhone() {
        System.out.println("Starting phone......");
    }

    private static void printFlow() {
        System.out.println("Choose from following options ");
        System.out.println("0 - shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact" +
                "4 - to remove existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions");
        System.out.println("Select your options: ");
    }


    public static void main(String[] args) {
        boolean stop = false;
        startPhone();
        printFlow();

        while (!stop) {
            System.out.println("\nEnter action: (press 6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printFlow();
                    break;
            }
        }
    }

    public static void addNewContact() {
        System.out.println("Enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Contact add, " + name + "already on file");
        }
    }

    private static void updateContact() {
        Contact oldContact = findContact();
        if (oldContact == null) return;
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Erroir updating record");
        }
    }

    public static void removeContact() {
        Contact contact = findContact();
        if (contact == null) return;
        if (mobilePhone.removeContact(contact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Record does not exist");
        }
    }

    public static void queryContact() {
        Contact contact = findContact();
        if (contact == null) return;
        System.out.println("Name " + contact.getName() + " phone number is " + contact.getPhoneNumber());
    }

    public static Contact findContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact not found.");
            return null;
        }
        return contact;
    }
}
