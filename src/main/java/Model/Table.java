/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Corbenik
 */
public class Table {
    private boolean reservada;
    
    public void setReservada(boolean reservada){
        this.reservada = reservada;
    }
       
    public boolean getReservada(){
        return this.reservada;
    }
       
    public boolean estaReservada(boolean reservada){
        boolean result = true;
        this.reservada = reservada;
        if(reservada == result){
            System.out.println("La mesa esta reservada");
        }
        else {
            System.out.println("La mesa esta libre");
            result = false;
        }
        return result;
    }
    
    public float calcularTotal(Dishes dishPrice)
    {
        float total = 0;
        total = total + dishPrice.getPrice();
        
        System.out.println("El total de la mesa es " + total);
        return total;
    }
};

