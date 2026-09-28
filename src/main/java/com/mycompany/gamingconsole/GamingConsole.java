/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author cerensarigul
 */
public class GamingConsole {

    public static void main(String[] args) {
      // 1D Arrays for the names of the cities  
      String  [] cities = { "Cape town ", "Port elizabeth","Pretoria" } ;
      
      //2D Array for the console names
      int [][] sales = { 
          {1000 , 2000 , 3000  }, //Cape town
          {2000 , 3000 , 4000  }, //Port Elizabeth
          {1500 , 1100 , 1200  }, //Pretoria
          
      };
      
        //Display the heading report
        System.out.println("NUMBER 1 ELECTRONICS ---- YEARLY SALES REPORT");
        System.out.println("-----------------------------------------------");
        //Display and calculate the totals
        System.out.printf("%-20s %-10s %-10s %-18s %-10sn", 
                "City", "Ps5","Xbox","Nintendo Switch", "Total");
        System.out.println("-----------------------------------------------");
        
        // For method for the sales 
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            
        for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
                
            }
        
            System.out.printf("%-20s %-10d %-10d %-18d -10d%n ",
                        cities[i], sales[i][0], sales[i][1], sales[i][2], total);
            
        }
        
        System.out.println("-----------------------------------------------");
           }
}
