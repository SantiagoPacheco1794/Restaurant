/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//import java.util.Map;
//import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Corbenik
 */
public class TableController {
    
    //private Map<Integer, Float> tablemap;
    private List<Table> tableList;
    
    
public void AddDish(Dishes newDish, int idTable){
    Table table = SelectTable(idTable);
    List<Dishes> dish = table.getDishesList();
    dish.add(newDish);
    }

public float Total(int idTable){
    Table table = SelectTable(idTable);
    float total = 0;
    
    total = total + table.getTotalTable();

    System.out.println("El total de la mesa es " + total);
    
    return total;
    }

    public Table createTable(){
        Table table = new Table();
        //float total = totalTable;
        
        //tablemap.put(idTable, total);
        
        return table;
    }
    
    public void AddTable(Table newTable)
    {
        this.tableList.add(newTable);
    }
    
    public void RemoveTable(Table table)
    {
        this.tableList.remove(table);
    }

    public TableController() {
        //this.totalTable = totalTable;
        //this.tablemap = new HashMap<>();
        this.tableList = new ArrayList<>();
    }
    
    public Table SelectTable(int id)
    {
       // System.out.println("Printing the table inside the list: " + tableList.get(id));
        return tableList.get(id);
    }
    
    //public float RefreshTotalTable(int idTable, Float total){ 
        
        //float oldTotal = Total();
        //System.out.println("The old total is " + oldTotal);
        //float newTotal = oldTotal + total;
        //System.out.println("The new total is " + newTotal);
        
      //  return newTotal;        
    //}
    
    
   // luego de seleccionar tabla, sumar el valor que nos pasa por param. al total
}
