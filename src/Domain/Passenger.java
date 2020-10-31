/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nelly
 */

@Entity
public class Passenger {
    
    @Id
    private int Id;
    private String Fname;
    private String Lname;
    private String Sex;
    private int Age;
    private int Tfair;
    private String Destination;
    private int PhoneNo;
    private String Email;

    public Passenger() {
    }

    
    
    
    public Passenger(int Id, String Fname, String Lname, String Sex, int Age, int Tfair, String Destination, int PhoneNo, String Email) {
        this.Id = Id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Sex = Sex;
        this.Age = Age;
        this.Tfair = Tfair;
        this.Destination = Destination;
        this.PhoneNo = PhoneNo;
        this.Email = Email;
    }
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getTfair() {
        return Tfair;
    }

    public void setTfair(int Tfair) {
        this.Tfair = Tfair;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
