package Model;

/**
 *
 * @author Corbenik
 */
public class Main {

    public static void main(String[] args) {
        
        //Table table = new Table();
        //table.estaReservada(true);
        //table.estaReservada(false);
        
        Dishes firstDish = new Dishes("mondongo",150.0f);
        Dishes secondDish = new Dishes("café", 300.0f);
        Dishes thirdDish = new Dishes("medialuna",15.0f);
        
        Menu menu = new Menu();
        menu.CreateMenu();
        menu.AddDishToMenu(firstDish);
        menu.AddDishToMenu(secondDish);
        menu.AddDishToMenu(thirdDish);
        menu.ShowMenu();
        
        TableController table = new TableController();

        table.createTable(1);
        table.createTable(2);
        table.createTable(3);
        
        table.RefreshTotalTable(table.createTable(1), 70f, 1);
        
       
        
    }
};
