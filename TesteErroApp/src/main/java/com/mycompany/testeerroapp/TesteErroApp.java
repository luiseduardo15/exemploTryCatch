/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeerroapp;

/**
 *
 * @author Dudu
 */
public class TesteErroApp {
    Connection conn;

   try {
       Connection conn = this.getConnection();
   }
   catch (Exception e) {
       System.out.println(e.getMessage());
   }
   finally {
       if (conn != null) {
           if (!conn.isClosed()) {
              try {
                 conn.close();
              }
              catch (SQLException ex) {} 
           }
       }
   }

   public Connection getConnection throw Exception () {
        throw new Excpetion("Erro ao criar uma conexão");
   }
}
    
}
