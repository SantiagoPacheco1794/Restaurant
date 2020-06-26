/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Corbenik
 */
public class Menu 
{
    private List menu;
    
    public Menu()
    {
        
    }
    
    public List CreateMenu()
    {
        menu = new ArrayList();
        return menu;
    }
    
    public void AddDishToMenu(Dishes dish)
    {
        menu.add(dish);
    }
    
    public void ShowMenu()
    {
        for (int index = 0; index < menu.size(); index++)
        {
            System.out.println("The dish " + menu.get(index) + " it's on index " + index);
        }
    }
};
