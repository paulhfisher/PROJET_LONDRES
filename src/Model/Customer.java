/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;

/**
 * class that inherited of Person that will contain the information of a customer
 * author : Paul Fisher and Savinien Godineau
 */
public class Customer extends Person {
    
    protected String typePerson;
    protected LocalDate startingDate;
    protected LocalDate endingDate;
    
    public Customer(String firstName, String lastName, String username, String password, String typePerson) {
        super(firstName, lastName, username, password);
        this.typePerson = typePerson;
   
    }

    @Override
    public void browseCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // getter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
    public String getType(){
        return typePerson;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }
    
    public LocalDate getEndingDate() {
        return endingDate;
    }
}