/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Corbenik
 */
public class TableController {
    private float totalTable;
    private Map<Integer, Float> tablemap;
    
public float Total(Dishes dishPrice){
    float total = 0;
    total = total + dishPrice.getPrice();
    
    System.out.println("El total de la mesa es " + total);
    
    return total;
    }

    public Table createTable(int idTable){
        Table table = new Table();
        table.setIdTable(idTable);
        
        return table;
    }

    public TableController() {
        this.totalTable = totalTable;
        this.tablemap = new HashMap<>();
    }
    
    public float RefreshTotalTable(Table nTable, Float total, int idTable){ 
        int id = nTable.getIdTable();
        tablemap.put(id, total);
        
        float oldTotal = tablemap.get(idTable);
        System.out.println("The old total is " + oldTotal);
        float newTotal = oldTotal + total;
        System.out.println("The new total is " + newTotal);
        
        return newTotal;        
    }
    
    
   // luego de seleccionar tabla, sumar el valor que nos pasa por param. al total
}
