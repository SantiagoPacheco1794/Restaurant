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
    private Map<Integer, Float> tablemap = new HashMap<>();
    
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
    
    public void SelectTable(Table nTable, Float total){
        int id = nTable.getIdTable();
        tablemap.put(id, total);
    }
}
