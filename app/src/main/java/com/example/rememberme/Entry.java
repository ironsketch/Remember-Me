package com.example.rememberme;

import java.util.ArrayList;
import java.util.Date;

public class Entry{
    private String name;
    private ArrayList<String> pictures;
    private ArrayList<String> addresses;
    private ArrayList<String> phoneNumbers;
    private ArrayList<String> emails;
    private String data;
    private Date lastSeen;
    private ArrayList<String> promises;
    private ArrayList<String> owes;
    Entry(String name, ArrayList<String> pictures, ArrayList<String> addresses, ArrayList<String> phoneNumbers,
          ArrayList<String> emails, String data, Date lastSeen, ArrayList<String> promises, ArrayList<String> owes){
        this.name = name;
        this.pictures = pictures;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.data = data;
        this.lastSeen = lastSeen;
        this.promises = promises;
        this.owes = owes;
    }

    // GETS
    public String getName(){return name;}
    public ArrayList<String> getPictures(){return pictures;}
    public ArrayList<String> getAddresses(){return addresses;}
    public ArrayList<String> getPhoneNumbers(){return phoneNumbers;}
    public ArrayList<String> getEmails(){return emails;}
    public String getData(){return data;}
    public Date getLastSeen(){return lastSeen;}
    public ArrayList<String> getPromises(){return promises;}
    public ArrayList<String> getOwes(){return owes;}

    // SETS
    public void setName(String name){this.name = name;}
    public void addPicture(){}
    public void addAddress(String address){this.addresses.add(address);}
    public void addPhoneNumber(String phoneNumber){this.phoneNumbers.add(phoneNumber);}
    public void addEmail(String email){this.emails.add(email);}
    public void addData(String data){this.data = data;}
    public void setLastSeen(Date lastSeen){this.lastSeen = lastSeen;}
    public void addPromise(String promise){this.promises.add(promise);}
    public void addOwe(String owe, Date date){
        // TODO
    }
}
