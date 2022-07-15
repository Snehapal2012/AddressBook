package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchPersonInAddressBook {
    static ArrayList<String> contactDetails=new ArrayList<>();
    static HashMap<String,ArrayList<String>> map=new HashMap<>();
   static HashMap<String, ArrayList<String>> map1 = new HashMap();
    static HashMap<String, ArrayList<String>> map2 = new HashMap();
    static HashMap<String, ArrayList<String>> map3 = new HashMap();
    static HashMap<String, ArrayList<String>> map4 = new HashMap();
    public static void addressBook(SearchPersonInAddressBook operations){
        System.out.println("You can create max 5 address book!");
        System.out.print("Enter the number of address book you want to create: ");
        Scanner scan=new Scanner(System.in);
        int numberOfBook=scan.nextInt();
        if(numberOfBook==1) {
            System.out.print("Enter the name of Address Book: ");
            String book = scan.next();
            System.out.println("----------------------------------"+book+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(book, contactDetails);
            System.out.println("---------------------------------------------------------------------------");
        }
       else if(numberOfBook==2){
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map1);
            System.out.println(map);
        }
       else if(numberOfBook==3){
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);
            map.putAll(map1);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map2);
            System.out.println(map);
        } else if (numberOfBook==4) {
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);
            map.putAll(map1);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map2);
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName3=scan.next();
            System.out.println("----------------------------------"+bookName3+"----------------------------");
            operations.performances(operations,contactDetails);
            map3.put(bookName3,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map3);
            System.out.println(map);
        } else if (numberOfBook==5) {
            System.out.println("Enter 1st Address Book Name:- ");
            String bookName=scan.next();
            System.out.println("----------------------------------"+bookName+"----------------------------");
            operations.performances(operations,contactDetails);
            map.put(bookName,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 2nd Address Book Name:- ");
            String bookName1=scan.next();
            System.out.println("----------------------------------"+bookName1+"----------------------------");
            operations.performances(operations,contactDetails);
            map1.put(bookName1,contactDetails);
            map.putAll(map1);
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Enter 3rd Address Book Name:- ");
            String bookName2=scan.next();
            System.out.println("----------------------------------"+bookName2+"----------------------------");
            operations.performances(operations,contactDetails);
            map2.put(bookName2,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map2);
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName3=scan.next();
            System.out.println("----------------------------------"+bookName3+"----------------------------");
            operations.performances(operations,contactDetails);
            map3.put(bookName3,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            map.putAll(map3);
            System.out.print("Enter 4th Address Book Name:- ");
            String bookName4=scan.next();
            System.out.println("----------------------------------"+bookName4+"----------------------------");
            operations.performances(operations,contactDetails);
            map4.put(bookName4,contactDetails);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("After merging total Address book looks like:---------------");
            map.putAll(map4);
            System.out.println(map);
        }
    }
    public static void inputDetails(ArrayList<String> contactDetails){
        Scanner sc = new Scanner(System.in);
            System.out.print("First name: ");
            contactDetails.add(sc.nextLine());

            System.out.print("Last name: ");
            contactDetails.add(sc.nextLine());

            System.out.print("Address: ");
            contactDetails.add(sc.nextLine());

            System.out.print("City: ");
            contactDetails.add(sc.nextLine());

            System.out.print("State: ");
            contactDetails.add(sc.nextLine());

            System.out.print("Zip: ");
            contactDetails.add(sc.nextLine());

            System.out.print("Phone number: ");
            contactDetails.add(sc.nextLine());

            System.out.print("Email: ");
            contactDetails.add(sc.nextLine());
            display(contactDetails);
        }

    public static void search(ArrayList<String> contactDetails){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the City or State you want to search for a person: ");
        String input=scan.next();
        contactDetails.stream().filter(contacts -> contacts.equalsIgnoreCase(input)).forEach(contacts -> System.out.println(contacts));

    }
    public static void display(ArrayList<String> contactDetails){

        for (int i = 0; i < contactDetails.size(); i++) {
            System.out.println(contactDetails.get(i));
        }
    }
    public static void editDetails(ArrayList<String> contactDetails){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Option you want to update:----------------");
        for(int i=0;i< contactDetails.size();i++){
            System.out.println("1) First name  2) Last name  3) Address 4) City 5) State 6) Zip 7) Phone number 8) Email");
            System.out.print("Enter value to update: ");
            int choice=scan.nextInt();
            switch (choice){
                case 1: System.out.print("Enter the existing first name you want to update: ");
                    String existingFirstName = scan.next();
                    int index=contactDetails.indexOf(existingFirstName);
                    System.out.print("Enter the details you want to update: ");
                    String updatedInput=scan.nextLine();
                    contactDetails.set(index,updatedInput);
                    display(contactDetails);
                    break;
                case 2:
                    System.out.println("Enter the existing last name you want to update: ");
                    String existingLastName=scan.nextLine();
                    int index1=contactDetails.indexOf(existingLastName);
                    System.out.print("Enter the new last name you want to update: ");
                    String updatedLastName=scan.nextLine();
                    contactDetails.set(index1,updatedLastName);
                    display(contactDetails);
                    break;
                case 3:
                    System.out.print("Enter the existing Address you want to update: ");
                    String existingAddress=scan.nextLine();
                    int index2=contactDetails.indexOf(existingAddress);
                    System.out.print("Enter the new Address you want to update: ");
                    String updatedAddress=scan.nextLine();
                    contactDetails.set(index2,updatedAddress);
                    display(contactDetails);
                    break;
                case 4:
                    System.out.print("Enter the existing City you want to update: ");
                    String existingCity=scan.nextLine();
                    int index3=contactDetails.indexOf(existingCity);
                    System.out.print("Enter the new City you want to update: ");
                    String updatedCity=scan.nextLine();
                    contactDetails.set(index3,updatedCity);
                    display(contactDetails);
                    break;
                case 5: System.out.print("Enter the existing State you want to update: ");
                    String existingState=scan.nextLine();
                    int index4=contactDetails.indexOf(existingState);
                    System.out.print("Enter the new State you want to update: ");
                    String updatedState=scan.nextLine();
                    contactDetails.set(index4,updatedState);
                    display(contactDetails);
                    break;
                case 6:
                    System.out.print("Enter the existing Zip you want to update: ");
                    String existingZip=scan.nextLine();
                    int index5=contactDetails.indexOf(existingZip);
                    System.out.print("Enter the new Zip you want to update: ");
                    String updatedZip=scan.nextLine();
                    contactDetails.set(index5,updatedZip);
                    display(contactDetails);
                    break;
                case 7: System.out.print("Enter the existing Phone number you want to update: ");
                    String existingPhone=scan.nextLine();
                    int index6=contactDetails.indexOf(existingPhone);
                    System.out.print("Enter the new Phone number you want to update: ");
                    String updatedPhone=scan.nextLine();
                    contactDetails.set(index6,updatedPhone);
                    display(contactDetails);
                    break;
                case 8: System.out.print("Enter the existing Email you want to update: ");
                    String existingEmail=scan.nextLine();
                    int index7=contactDetails.indexOf(existingEmail);
                    System.out.print("Enter the new Email you want to update: ");
                    String updatedEmail=scan.nextLine();
                    contactDetails.set(index7,updatedEmail);
                    display(contactDetails);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void deleteDetails(ArrayList<String> contactDetails){
        String input,answer;
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to delete the whole details of the person(YES/NO): ");
        answer=scan.nextLine();
        if(answer.compareTo("NO")==0) {
            System.out.print("Please type the details you want to delete: ");
            input = scan.nextLine();
            contactDetails.remove(input);
            System.out.println("After removing details, the Address book will be....");
            display(contactDetails);
        }else {
            contactDetails.clear();
            display(contactDetails);
            System.out.println("Sorry ! No details available!");
        }
    }

    public static void performances(SearchPersonInAddressBook operations,ArrayList<String> contactDetails){
        int numberOfPerson;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of person's details you want to provide: ");
        numberOfPerson=input.nextInt();
        for(int i=0;i<numberOfPerson;i++){
            operations.inputDetails(contactDetails);
            display(contactDetails);}
        int number;
        System.out.println("Please choose the Operation for Address book: 1)Input Details, 2)Edit Details, 3)Delete Details, 4)Search");
        number=input.nextInt();
        switch (number){
            case 1: operations.inputDetails(contactDetails);
                break;
            case 2: operations.editDetails(contactDetails);
                break;
            case 3: operations.deleteDetails(contactDetails);
                break;
            case 4: operations.search(contactDetails);
            break;
            default:
                System.out.println("Please enter valid input!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------Welcome to Address Book Program--------------------------");
        SearchPersonInAddressBook operations=new SearchPersonInAddressBook();
        addressBook(operations);
    }
}
