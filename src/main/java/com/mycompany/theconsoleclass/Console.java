/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theconsoleclass;

/**
 *
 * @author cerensarigul
 */
public abstract class Console implements IConsole{
    
      
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
        
    }
   @Override
    public String getConsoleType() {
        return consoleType;
    }
   @Override
    public String getStore() {
        return store;
    }
   @Override
    public int getTotalSales() {
        return totalSales;
    }
    
    
        
    
}
