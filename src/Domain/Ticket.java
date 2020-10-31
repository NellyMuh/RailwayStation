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
public class Ticket {
    @Id
    private int ticket_id;
    private String destination;
    private String departure;
    private String arrival;
    //private Passenger passenger;
    
    // Singleton pattern initialization
    static Ticket ticket_instance = null;
    
    private Ticket(){}
    
    public static Ticket getInstance(){
        if(ticket_instance == null){
            ticket_instance = new Ticket();
        }
        return ticket_instance;
    }

//    public Ticket() {
//    }

    public Ticket(int ticket_id, String destination, String departure, String arrival, Passenger passenger) {
        this.ticket_id = ticket_id;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        //this.passenger = passenger;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

//    public Passenger getPassenger() {
//        return passenger;
//    }
//
//    public void setPassenger(Passenger passenger) {
//        this.passenger = passenger;
//    }

       
    
}
