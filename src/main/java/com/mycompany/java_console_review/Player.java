/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_console_review;

/**
 *
 * @author monik
 */
public class Player {
   
     private String name;
     private int number;


   
//constructor
    public Player(String name, int number) 
{
    this.name = name;
    this.number = number;
}
    
// getter and setter
    
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
     

//override
    @Override
public String toString() {
    return name + " - " + number;
}
}//class

