/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fase1;

import java.util.Scanner;

/**
 *
 * @author denni
 */
public class Principal {
    
    
    
    
     public static void main(String[] args) {
          int opcion=0;
          int regresar=0;
          int ventanillas=0;
         do{ 
         System.out.println("1.Parametro Iniciales");
         System.out.println("2.Ejecutar Paso");
         System.out.println("3.Estado en memoriaa de las estructuras");
         System.out.println("4.Reportes");
         System.out.println("5.acerca de ");
         System.out.println("6.salir");
          Scanner numero=new Scanner(System.in);//use escaner para poder elijir del menu
         opcion=numero.nextInt();
         regresar=0;
          regresar=0;
          int num=0;
          
          switch (opcion) {
              case 1:
                System.out.println("1.Carga masiva de clientes");
                System.out.println("2. Cantidad de ventanillas");
                 num=numero.nextInt();
                break;
              case 2:
                  break;
              case 3:
                break;
                
              case 4:
                break;
                
              case 5:
                break;
            
          
          }
         }while(opcion < 1 || opcion > 6 || regresar == 1);
         
         
         
         
 

          
      
         
         
         
 }
}
