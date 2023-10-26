/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_console_review;

/**
 *
 * @author monik
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Java_Console_Review {
     
    static ArrayList<Player> players = new ArrayList<>();
    
    public static void main(String[] args) {
     
    Player player1 = new Player("Billy", 12);
    Player player2 = new Player("Victor", 33);
    Player player3 = new Player("Sally", 67);
    Player player4 = new Player("Janell", 45);
    Player player5 = new Player("Hudson", 30);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        
            
        while(true){
            System.out.println("Players");
            System.out.println("1. Display Player");
            System.out.println("2. Display Player with an Odd Number");
            System.out.println("3. Display PLayers starting with a letter");            
            System.out.println("4. Add Player");
            try{
            System.out.print("Enter your choice: ");
            
             Scanner scanner = new Scanner(System.in);
             int choice = scanner.nextInt();
             
             switch (choice)
        {
             case 1:
            displayPlayer();
            System.out.println("-------------------------------\n\n\n");
             break;
             
            case 2:
            DisplayOddNumber(players);
           System.out.println("-------------------------------\n\n\n");
            break;
            
            case 3:
            DisplayFirstLetterOfName(players);
           System.out.println("-------------------------------\n\n\n");
           // isNumber = true;
            break;
            
            case 4:
            AddPlayer(players);
           System.out.println("-------------------------------\n\n\n");
            break;
            
            default:
            System.out.println("Pick the right choice 1 to 4");
            break;
             }//switch
            }
            catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer.");
            }   
        }//while  
        
    }//main
    
    public  static void displayPlayer()
    {
        for (int i = 0; i < players.size(); i++){
            System.out.println(players.get(i));
        }
    }//case1
    
     public static void DisplayOddNumber(ArrayList<Player> players)
    {
     for (int i = 0; i < players.size(); i++){
         
        if (players.get(i).getNumber() % 2 != 0)
        {
             System.out.println(players.get(i));
        }
     }
     }//case2
     
     
    public static void DisplayFirstLetterOfName(ArrayList<Player> players){
         System.out.print("Enter the letter: ");
            
             Scanner scanner = new Scanner(System.in);
             String letter = scanner.nextLine();
             char enter = letter.charAt(0);
             
             boolean isFound = false;
            
        if(letter.length() == 1){
                 
            for (int i = 0; i < players.size(); i++){
                  
                String name = players.get(i).getName();
                char FirstLetter = name.charAt(0);
                char lowerCase = Character.toLowerCase(FirstLetter);
                
                if (enter == FirstLetter|| enter == lowerCase){
                     
                System.out.println(players.get(i));
                isFound = true;
                }
            }
            
            if(!isFound){
            System.out.println("No players found with" + enter);
            }
        }
        else{
            
             System.out.println("Please enter 1 letter only.");
             }
        
    }//case3
    
     public static void AddPlayer(ArrayList<Player> player)
    {
     System.out.print("Enter Name: ");
            
             Scanner scanner1 = new Scanner(System.in);
             String name = scanner1.nextLine();

        boolean isNumber = false;
        while(!isNumber){
            try{
            System.out.print("Enter Number: ");
            Scanner scanner2 = new Scanner(System.in);
            int number =  scanner2.nextInt();
            
            player.add(new Player(name, number));
            
            isNumber = true;
            }
            catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }//case4

}//class
