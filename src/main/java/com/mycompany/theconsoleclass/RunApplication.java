/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theconsoleclass;
import java.util.Scanner;
/**
 *
 * @author cerensarigul
 */
public class RunApplication {
    
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the console device type: ");
        String type = sc.nextLine();
        
        System.out.println("Enter the store name: ");
        String city = sc.nextLine();
        String store = null;
        
        System.out.println("Enter the total " +  type + "console device type " + store + ": ");
        int total = sc.nextInt();
        
        ConsoleSales rar = new ConsoleSales(type, city, total);
        
        rar.printConsoleSales();
    }
    
}
