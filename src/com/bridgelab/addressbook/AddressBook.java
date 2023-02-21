package com.bridgelab.addressbook;

import java.util.Scanner;

public class AddressBook {

    public static void addNewPerson() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name:");

        String  firstName= sc.nextLine();

        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter last Name:");

        String  lastName= sc1.nextLine();

        Scanner sc2=new Scanner(System.in);

        System.out.println("Enter the address:");

        String  address= sc2.nextLine();

        Scanner sc3=new Scanner(System.in);

        System.out.println("Enter the city:");

        String  city= sc3.nextLine();

        Scanner sc4=new Scanner(System.in);

        System.out.println("Enter the state:");

        String  state= sc4.nextLine();

        Scanner sc5=new Scanner(System.in);

        System.out.println("Enter the zip code:");

        String  zipCode= sc5.nextLine();

        Scanner sc6=new Scanner(System.in);

        System.out.println("Enter the email:");

        String  email= sc6.nextLine();

        System.out.println("Enter the phone no:");

        int phoneno= sc6.nextInt();







    }
}
