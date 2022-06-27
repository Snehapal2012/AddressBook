package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMultiplePersonDetails {
    public static void main(String args[]) {
        ArrayList<String> contactDetails = new ArrayList<String>();
        AddMultiplePersonDetails person1 = new AddMultiplePersonDetails();
        System.out.println("Welcome to Address book!");
        int numberOfPerson;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of person's details you want to provide: ");
        numberOfPerson=input.nextInt();
        for(int i=0;i<numberOfPerson;i++){
            person1.inputDetails(contactDetails);
            display(contactDetails);}
        int number;
        System.out.println("Please choose the Operation for Address book: 1)Input Details, 2)Edit Details, 3)Delete Details");
        number=input.nextInt();
        switch (number){
            case 1: person1.inputDetails(contactDetails);
                break;
            case 2: person1.editDetails(contactDetails);
                break;
            case 3: person1.deleteDetails(contactDetails);
                break;
            default:
                System.out.println("Please enter valid input!");
        }
    }
    public static void inputDetails(ArrayList ar){
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        ar.add(sc.nextLine());

        System.out.print("Last name: ");
        ar.add(sc.nextLine());

        System.out.print("Address: ");
        ar.add(sc.nextLine());

        System.out.print("City: ");
        ar.add(sc.nextLine());

        System.out.print("State: ");
        ar.add(sc.nextLine());

        System.out.print("Zip: ");
        ar.add(sc.nextLine());

        System.out.print("Phone number: ");
        ar.add(sc.nextLine());

        System.out.print("Email: ");
        ar.add(sc.nextLine());
        display(ar);

    }
    public static void display(ArrayList a){

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void editDetails(ArrayList a){
        String edit,updatedInput;
        int index;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the existing details you want to update: ");
        edit=input.nextLine();
        index= a.indexOf(edit);
        System.out.print("Enter the details you want to update: ");
        updatedInput=input.nextLine();
        a.set(index,updatedInput);
        System.out.println("The New Updated details..........");
        display(a);
    }
    public static void deleteDetails(ArrayList a){
        String input,answer;
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to delete the whole details of the person(YES/NO): ");
        answer=scan.nextLine();
        if(answer.compareTo("NO")==0) {
            System.out.print("Please type the details you want to delete: ");
            input = scan.nextLine();
            a.remove(input);
            System.out.println("After removing details, the Address book will be....");
            display(a);
        }else {
            a.clear();
            display(a);
            System.out.println("Sorry ! No details available!");
        }
    }
}
