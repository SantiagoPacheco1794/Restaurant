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
public class Dishes {
    
    private int code;
    private String name;
    private float price;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() { 
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    public Dishes() {
    }

    public Dishes(int code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString(){
      return this.code + " " + this.name + " " + this.price;
    }
};
