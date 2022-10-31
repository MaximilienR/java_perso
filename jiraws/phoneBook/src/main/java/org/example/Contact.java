package org.example;

public class Contact {
    protected String lastName;
    protected String firstName;
    protected String phoneNumber;


    public Contact(){

    };
    //constructor
    public Contact(String lastName,String firstName,String phoneNumber){
        this.lastName=lastName;
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    //getter setter
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
