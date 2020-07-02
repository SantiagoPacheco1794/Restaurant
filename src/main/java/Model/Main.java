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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Table table = new Table();
        table.estaReservada(true);
        table.estaReservada(false);
        
        Dishes firstDish = new Dishes(1, "mondongo",150.0f);
        
        Menu menu = new Menu();
        menu.CreateMenu();
        menu.AddDishToMenu(firstDish);
        table.calcularTotal(firstDish);
        menu.ShowMenu();
        
    }
};
