package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain implements AddressBookInterface{

    Scanner s = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();

    @Override
    public void operation(ArrayList<Person> arrayRead) {

    }

    public void add() {
            Person person = new Person();
            AddressBook address = new AddressBook();
            System.out.println("Enter the First name:");
            String fname = s.next();
            person.setFname(fname);

            System.out.println("Enter the Last name:");
            String lname = s.next();
            person.setLname(lname);

            System.out.println("Enter the Phone Number:");
            Long phone = s.nextLong();
            person.setPhonenumber(phone);

            System.out.println("Enter the Phone Number:");
            String email = s.next();
            person.setEmail(email);

            System.out.println("Enter the City:");
            String city = s.next();
            address.setCity(city);

            System.out.println("Enter the Zip:");
            long zip = s.nextLong();
            address.setZip(zip);

            System.out.println("Enter the State:");
            String state = s.next();
            address.setState(state);
            person.setAddress(address);
            list.add(person);

        }

    @Override
    public void edit() {
        System.out.println("Enter your First name:");
        String fname = s.next();

        Iterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (fname.equals(person.getFname())) {
                AddressBook address = person.getAddress();
                System.out.println("Choose field you want to add:");
                System.out
                        .println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.setLname(s.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.setPhonenumber(s.nextLong());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        address.setCity(s.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        address.setZip(s.nextLong());
                        break;
                    case 5:
                        System.out.println("Re-Correct your State");
                        address.setState(s.next());
                        break;
                }

            }
        }


    }

    @Override
    public void delete() {

    }

    @Override
    public ArrayList<Person> list() {
        return null;
    }


}
