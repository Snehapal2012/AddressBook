package com.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class SortPersonNameAlphabetically {
    static ArrayList<Contacts> contactDetails=new ArrayList<>();
    static HashMap<String,ArrayList<Contacts>> map=new HashMap<>();
    static HashMap<String, ArrayList<Contacts>> map1 = new HashMap();
    static HashMap<String, ArrayList<Contacts>> map2 = new HashMap();
    static HashMap<String, ArrayList<Contacts>> map3 = new HashMap();
    static HashMap<String, ArrayList<Contacts>> map4 = new HashMap();

    //for creating multiple address book with multiple person details
    public static void addressBook(SortPersonNameAlphabetically operations){
        System.out.println("You can create max 5 address book!");
        System.out.print("Enter the number of address book you want to create: ");
        Scanner scan=new Scanner(System.in);
        int numberOfBook=scan.nextInt();
        if(numberOfBook==1) {
            System.out.print("Enter the name of Address Book: ");
            String book = scan.next();
            System.out.println("----------------------------------"+book+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(book, contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
        }
        else if(numberOfBook==2){
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map1);  // merging 2 address book into one address book
            System.out.println(map);
        }
        else if(numberOfBook==3){
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails); // adding details inside hashmap
            map.putAll(map1);  // merging 2 address book into one address book
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map2);  // merging 3 address book into one address book
            System.out.println(map);
        } else if (numberOfBook==4) {
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);  // adding details inside hashmap
            map.putAll(map1);  // merging 2 address book into one address book
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map2);  // merging 3 address book into one address book
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName3=scan.next();
            System.out.println("----------------------------------"+bookName3+"----------------------------");
            operations.performances(operations,contactDetails);
            map3.put(bookName3,contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map3);  // merging 4 address book into one address book
            System.out.println(map);
        } else if (numberOfBook==5) {
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails); // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails); // adding details inside hashmap
            map.putAll(map1); // merging 2 address book into one address book
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map2); // merging 3 address book into one address book
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName3=scan.next();
            System.out.println("----------------------------------"+bookName3+"----------------------------");
            operations.performances(operations,contactDetails);
            map3.put(bookName3,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map3);  // merging 4 address book into one address book
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName4=scan.next();
            System.out.println("----------------------------------"+bookName4+"----------------------------");
            operations.performances(operations,contactDetails);
            map4.put(bookName4,contactDetails);  // adding details inside hashmap
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map4);  // merging 5 address book into one address book
            System.out.println(map);
        }
    }

    //Taking inputs into arraylist
    public static void inputDetails(ArrayList<Contacts> contactDetails){
        Contacts contacts=new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        contacts.setFirstName(sc.next());

        System.out.print("Last name: ");
        contacts.setLastName(sc.next());

        System.out.print("Address: ");
        contacts.setAddress(sc.next());

        System.out.print("City: ");
        contacts.setCity(sc.next());

        System.out.print("State: ");
        contacts.setState(sc.next());

        System.out.print("Zip: ");
        contacts.setZip(sc.next());

        System.out.print("Phone number: ");
        contacts.setPhoneNumber(sc.next());

        System.out.print("Email: ");
        contacts.setEmail(sc.next());
        contactDetails.add(contacts);
    }
 //Searching person's first name or entire details by city
    public static void searchByCity(ArrayList<Contacts> contactDetails){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the City you want to search for a person: ");
        String input=scan.next();
        System.out.println("Operations:-----------1) To show only person's first name, 2) To show person's entire details");
        System.out.println("Enter your choice: ");
        int choice=scan.nextInt();
        switch (choice){
            case 1:
                contactDetails.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(input)).forEach(contacts -> System.out.println(contacts.getFirstName()));
                break;
            case 2:
                contactDetails.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(input)).forEach(contacts -> System.out.println(contacts));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    //Searching person's first name or entire details by state
    public static void searchByState(ArrayList<Contacts> contactDetails){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the State you want to search for a person: ");
        String input=scan.next();
        System.out.println("Operations:-----------1) To show only person's first name, 2) To show person's entire details");
        System.out.println("Enter your choice: ");
        int choice=scan.nextInt();
        switch (choice){
            case 1:
                contactDetails.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(input)).forEach(contacts -> System.out.println(contacts.getFirstName()));
                break;
            case 2:
                contactDetails.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(input)).forEach(contacts -> System.out.println(contacts));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    public static void sortPersonAlphabetically(ArrayList<Contacts> contactDetails){
        System.out.println("After sorting Person's name:--------------------");
        System.out.println(contactDetails.stream().sorted(Comparator.comparing(contacts -> contacts.getFirstName() + contacts.getLastName())).collect(Collectors.toList()));
    }
    //to display entire address book
    public static void display(ArrayList<Contacts> contactDetails){
        Iterator<Contacts> details = contactDetails.iterator();
        while (details.hasNext()) {
            System.out.println(details.next());
        }
    }
    //to edit in address book
    public static void editDetails(ArrayList<Contacts> contactDetails){
        Scanner scan=new Scanner(System.in);
        Contacts contacts=new Contacts();
        System.out.println("Enter the Option you want to update:----------------");
        for(int i=0;i< contactDetails.size();i++){
            System.out.println("1) First name  2) Last name  3) Address 4) City 5) State 6) Zip 7) Phone number 8) Email");
            System.out.print("Enter value to update: ");
            int choice=scan.nextInt();
            switch (choice){
                case 1: System.out.print("Enter the existing first name you want to update: ");
                    String existingFirstName=contacts.getFirstName();
                    System.out.print("Enter the details you want to update: ");
                    String updatedInput=scan.next();
                    contacts.setFirstName(updatedInput);
                    display(contactDetails);
                    break;
                case 2:
                    System.out.println("Enter the existing last name you want to update: ");
                    String existingLastName= contacts.getLastName();
                    System.out.print("Enter the new last name you want to update: ");
                    String updatedLastName=scan.nextLine();
                    contacts.setLastName(updatedLastName);
                    display(contactDetails);
                    break;
                case 3:
                    System.out.print("Enter the existing Address you want to update: ");
                    String existingAddress= contacts.getAddress();
                    System.out.print("Enter the new Address you want to update: ");
                    String updatedAddress=scan.nextLine();
                    contacts.setAddress(updatedAddress);
                    display(contactDetails);
                    break;
                case 4:
                    System.out.print("Enter the existing City you want to update: ");
                    String existingCity= contacts.getCity();
                    System.out.print("Enter the new City you want to update: ");
                    String updatedCity=scan.nextLine();
                    contacts.setCity(updatedCity);
                    display(contactDetails);
                    break;
                case 5: System.out.print("Enter the existing State you want to update: ");
                    String existingState= contacts.getState();
                    System.out.print("Enter the new State you want to update: ");
                    String updatedState=scan.nextLine();
                    contacts.setState(updatedState);
                    display(contactDetails);
                    break;
                case 6:
                    System.out.print("Enter the existing Zip you want to update: ");
                    String existingZip= contacts.getZip();
                    System.out.print("Enter the new Zip you want to update: ");
                    String updatedZip=scan.nextLine();
                    contacts.setZip(updatedZip);
                    display(contactDetails);
                    break;
                case 7: System.out.print("Enter the existing Phone number you want to update: ");
                    String existingPhone= contacts.getPhoneNumber();
                    System.out.print("Enter the new Phone number you want to update: ");
                    String updatedPhone=scan.nextLine();
                    contacts.setPhoneNumber(updatedPhone);
                    display(contactDetails);
                    break;
                case 8: System.out.print("Enter the existing Email you want to update: ");
                    String existingEmail= contacts.getEmail();
                    System.out.print("Enter the new Email you want to update: ");
                    String updatedEmail=scan.nextLine();
                    contacts.setEmail(updatedEmail);
                    display(contactDetails);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
//to delete any details in address book
    public static void deleteDetails(ArrayList<Contacts> contactDetails){
        String input,answer;
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to delete the whole details of the person(YES/NO): ");
        answer=scan.nextLine();
        if(answer.compareTo("NO")==0) {
            System.out.print("Please type the details you want to delete: ");
            input = scan.next();
            contactDetails.remove(input);
            System.out.println("After removing details, the Address book will be....");
            display(contactDetails);
        }else {
            contactDetails.clear();
            display(contactDetails);
            System.out.println("Sorry ! No details available!");
        }
    }
//to perform various operations on address book
    public static void performances(SortPersonNameAlphabetically operations, ArrayList<Contacts> contactDetails){
        int numberOfPerson;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of person's details you want to provide: ");
        numberOfPerson=input.nextInt();
        for(int i=0;i<numberOfPerson;i++){
            operations.inputDetails(contactDetails);
            display(contactDetails);}
        int number;
        System.out.println("Please choose the Operation for Address book: 1)Input Details, 2)Edit Details, 3)Delete Details, 4)Search by City, 5)Search by State, 6)Display, 7)Sort Person alphabetically");
        number=input.nextInt();
        switch (number){
            case 1: operations.inputDetails(contactDetails);
                break;
            case 2: operations.editDetails(contactDetails);
                break;
            case 3: operations.deleteDetails(contactDetails);
                break;
            case 4: operations.searchByCity(contactDetails);
                break;
            case 5: operations.searchByState(contactDetails);
                break;
            case 6: display(contactDetails);
                break;
            case 7: operations.sortPersonAlphabetically(contactDetails);
            break;
            default:
                System.out.println("Please enter valid input!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------Welcome to Address Book Program--------------------------");
        SortPersonNameAlphabetically operations=new SortPersonNameAlphabetically();
        addressBook(operations);
    }
}
