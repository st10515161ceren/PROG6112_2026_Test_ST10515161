/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theconsoleclass;

/**
 *
 * @author cerensarigul
 */
public class ConsoleSales  extends Console{
  
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
   
    public void printConsoleSales() {
        
        System.out.println("----\nCONSOLE SALES\n-----");
        System.out.println("CONSOLE TYPE: " + getConsoleType() + "\nSTORE: " + getStore() + "\nTOTAL SALES: " + getTotalSales() + "\n------------");
    }
        
 
   
    }

   
    

