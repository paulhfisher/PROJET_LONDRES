/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import javax.swing.JOptionPane;

/**
 *
 * @author fishe
 */
public class ExceptionDateStartBeforeCurrent extends Exception {
    
    public ExceptionDateStartBeforeCurrent(){
        JOptionPane.showMessageDialog(null, "The starting rental date cannot be before the current date","error", JOptionPane.ERROR_MESSAGE);
    }
}
