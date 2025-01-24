/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpruebaoscar;

/**
 *
 * @author LENOVO
 */
public class PalindromoAir {
    Ticket[] Asientos = new Ticket[30];
    
    boolean isPalindromo(String name){
        //caso base
        if (name.length() == 1 || name.length() == 0){
            return true;
        }
        
        //respuesta falsa
        if (name.charAt(0) != name.charAt(name.length() - 1)){
            return false;
        }
        
        //  - R E C U R S I O N -  //
        return isPalindromo(name.substring(1, name.length() - 1));
        
    }
    
    
}
