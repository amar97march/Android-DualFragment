package com.example.amar97march.dualfragment;

import java.util.ArrayList;

/**
 * Created by amar97march on 20-08-2017.
 */
public class AddressBook {
    private static AddressBook ourInstance = new AddressBook();
    private ArrayList<NameAndAddress> mNameAndAddresses;
    public static AddressBook getInstance() {
        return ourInstance;
    }

    private AddressBook() {
        mNameAndAddresses = new ArrayList<NameAndAddress>();
    //Some Dummy Data
        NameAndAddress tempEntry= new NameAndAddress("B Obama","The White House","washington","DC1");
        //Add it to Array List
        mNameAndAddresses.add(tempEntry);
        //Some other dummy data
        tempEntry=new NameAndAddress("E Winder","Buckingham Palace","London","SWiA 1AA");
        mNameAndAddresses.add(tempEntry);
        tempEntry=new NameAndAddress("V Putin","The Kremlin","Moscow","MS1");
        mNameAndAddresses.add(tempEntry);

    }
    public ArrayList <NameAndAddress> getBook(){
        return mNameAndAddresses;
    }
}
