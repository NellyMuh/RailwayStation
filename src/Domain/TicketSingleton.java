/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Nelly
 */
public class TicketSingleton {
    static TicketSingleton ticket_instance = null;
    
    private TicketSingleton(){}
    
    public static TicketSingleton getInstance(){
        if(ticket_instance == null){
            ticket_instance = new TicketSingleton();
        }
        return ticket_instance;
    }
}
