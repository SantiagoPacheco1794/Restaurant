/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Corbenik
 */
public class Table {
    private int idTable;
    private boolean reservada;
    private float totalTable;
    private List <Dishes> dishesList;

    public float getTotalTable() {
        return totalTable;
    }

    public void setTotalTable(float totalTable) {
        this.totalTable = totalTable;
    }
    
    public void setIdTable(int i){
        this.idTable = i;
    }
    
    public int getIdTable(){
        return this.idTable;
    }
    
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
    
    public Table(){
        this.idTable = 0;
        this.reservada = true;
        this.totalTable = 0.0f;
        this.dishesList = new ArrayList<>();
    }

    public List<Dishes> getDishesList() {
        return dishesList;
    }

    public void setDishesList(List<Dishes> dishesList) {
        this.dishesList = dishesList;
    }
    
    @Override
    public String toString(){
      return this.idTable + " " + this.reservada + " " + this.totalTable;
    }
};

