package com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddMultipleAddressBook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        HashMap<String, String> map3 = new HashMap<String, String>();
        HashMap<String, String> map4 = new HashMap<String, String>();
        System.out.println("Welcome to Address Book System!");
        System.out.println("Maximum 5 address books you can entry!");
        Scanner scan=new Scanner(System.in);
        int numberOfBook;
        String bookName,bookName1,bookName2,bookName3,bookName4;
        System.out.print("Kindly provide the number of Address Book you want: ");
        numberOfBook=scan.nextInt();
        if(numberOfBook==1){
            System.out.print("Enter Address Book Name: ");
            bookName=scan.nextLine();
            inputDetails(map);
            System.out.println("Options for address book "+bookName+" operation---------------------");
            operations(map);
        } else if (numberOfBook==2) {
            System.out.println("Enter 1st Address Book Name:- ");
            bookName=scan.nextLine();
            inputDetails(map);
            System.out.println("Options for 1st address book"+bookName+" operation---------------------");
            operations(map);
            System.out.print("Enter 2nd Address Book Name:- ");
            bookName1=scan.nextLine();
            inputDetails(map1);
            System.out.println("Options for 2nd address book"+bookName1+" operation---------------------");
            operations(map1);
        } else if (numberOfBook==3) {
            System.out.print("Enter 1st Address Book Name:- ");
            bookName=scan.nextLine();
            inputDetails(map);
            System.out.println("Options for 1st address book"+bookName+" operation---------------------");
            operations(map);
            System.out.print("Enter 2nd Address Book Name:- ");
            bookName1=scan.nextLine();
            inputDetails(map1);
            System.out.println("Options for 2nd address book"+bookName1+" operation---------------------");
            operations(map1);
            System.out.print("Enter 3rd Address Book Name:- ");
            bookName2=scan.nextLine();
            inputDetails(map2);
            System.out.println("Options for 3rd address book"+bookName2+" operation---------------------");
            operations(map2);
        }else if (numberOfBook==4) {
            System.out.print("Enter 1st Address Book Name:- ");
            bookName=scan.nextLine();
            inputDetails(map);
            System.out.println("Options for 1st address book"+bookName+" operation---------------------");
            operations(map);
            System.out.print("Enter 2nd Address Book Name:- ");
            bookName1=scan.nextLine();
            inputDetails(map1);
            System.out.println("Options for 2nd address book"+bookName1+" operation---------------------");
            operations(map1);
            System.out.print("Enter 3rd Address Book Name:- ");
            bookName2=scan.nextLine();
            inputDetails(map2);
            System.out.println("Options for 3rd address book"+bookName2+" operation---------------------");
            operations(map2);
            System.out.print("Enter 4th Address Book Name:- ");
            bookName3=scan.nextLine();
            inputDetails(map3);
            System.out.println("Options for 4th address book"+bookName3+" operation---------------------");
            operations(map3);
        }else if (numberOfBook==5) {
            System.out.print("Enter 1st Address Book Name:- ");
            bookName=scan.nextLine();
            inputDetails(map);
            System.out.println("Options for 1st address book"+bookName+" operation---------------------");
            operations(map);
            System.out.print("Enter 2nd Address Book Name:- ");
            bookName1=scan.nextLine();
            inputDetails(map1);
            System.out.println("Options for 2nd address book"+bookName1+" operation---------------------");
            operations(map1);
            System.out.print("Enter 3rd Address Book Name:- ");
            bookName2=scan.nextLine();
            inputDetails(map2);
            System.out.println("Options for 3rd address book"+bookName2+" operation---------------------");
            operations(map2);
            System.out.print("Enter 4th Address Book Name:- ");
            bookName3=scan.nextLine();
            inputDetails(map3);
            System.out.println("Options for 4th address book"+bookName3+" operation---------------------");
            operations(map3);
            System.out.print("Enter 5th Address Book Name:- ");
            bookName4=scan.nextLine();
            inputDetails(map4);
            System.out.println("Options for 5th address book"+bookName4+" operation---------------------");
            operations(map4);
        }
    }

    public static void inputDetails(HashMap m) {
        Scanner input = new Scanner(System.in);
        Scanner output = new Scanner(System.in);
        System.out.print("Type First name & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type Last name & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type Address & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type City & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type State & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type Zip & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type Phone number & value= ");
        m.put(input.nextLine(), output.nextLine());
        System.out.print("Type Email & value= ");
        m.put(input.nextLine(), output.nextLine());
        display(m);
    }

    public static void display(HashMap m) {
        m.forEach((k, v) -> {
            System.out.println(k + ":   " + v);
        });
    }

    public static void editDetails(HashMap m) {
        Scanner scan = new Scanner(System.in);
        String key, value;
        System.out.print("Enter the details you want to search: ");
        key = scan.nextLine();
        boolean flag = m.containsKey(key);
        if (flag == true) {
            System.out.print("Enter the details you want to replace: ");
            value = scan.nextLine();
            m.replace(key, value);
            display(m);
        } else {
            System.out.println("Sorry! Entered details is not available");
        }
    }

    public static void deleteDetails(HashMap m) {
        Scanner scan = new Scanner(System.in);
        String key, value;
        System.out.print("Enter the details you want to search: ");
        key = scan.nextLine();
        boolean flag = m.containsKey(key);
        if (flag == true) {
            System.out.print("Enter the details you want to remove: ");
            value = scan.nextLine();
            m.remove(key);
            display(m);
        } else {
            System.out.println("Sorry! Entered details is not available!");
        }
    }

    public static void operations(HashMap m) {
        Scanner check = new Scanner(System.in);
        int checkOperation;
        for (int i = 0; i < 10; i++) {
            System.out.print("Choose any Operation: 1) Input Operation, 2) Edit Operations, 3) Delete Operation, 4) Exit Operation");
            checkOperation = check.nextInt();
            if(checkOperation==4){
                System.out.println("Bye Bye!");break;}else{
                switch (checkOperation) {
                    case 1:
                        inputDetails(m);
                        break;
                    case 2:
                        editDetails(m);
                        break;
                    case 3:
                        deleteDetails(m);
                        break;
                    default:
                        System.out.println("Invalid operation! try again!");
                }}
        }
    }
}
