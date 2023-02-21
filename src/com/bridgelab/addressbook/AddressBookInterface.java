package com.bridgelab.addressbook;

import java.util.ArrayList;

public interface AddressBookInterface {

    public void operation(ArrayList<Person> arrayRead);
    public void add();
    public void edit();
    public void delete();

    public ArrayList<Person> list();
}
