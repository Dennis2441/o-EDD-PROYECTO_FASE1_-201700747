/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fase1;

/**
 *
 * @author denni
 */
public class cliente {
    
     class Nodo {

        String id;
        String nombre;
        String color;
        String bw;
        Nodo sig;

    }
     
     private Nodo raiz,fondo;
     
     
       cliente() {

        raiz=null;

        fondo=null;

    }
     
     boolean vacia (){

        if (raiz == null)

            return true;

        else

            return false;

    }

void insertar ( String id
   ,String nombre, String color, String bw)

    {

        Nodo nuevo;

        nuevo = new Nodo ();

        nuevo.id = id;
        nuevo.nombre = nombre;
        nuevo.color = color;
        nuevo.bw = bw;

        nuevo.sig = null;

        if (vacia ()) {

            raiz = nuevo;

            fondo = nuevo;

        } else {

            fondo.sig = nuevo;

            fondo = nuevo;

        }

    }

     String extraer(){
         String mensaje="Vacio";
 if (!vacia ())

        {
       String id=raiz.id;
       if(raiz==fondo){
       raiz=null;
       fondo=null;
       
       
       }else{
        raiz = raiz.sig;
       
       }
       
        return id;
        
        
        }
 
 
         return mensaje;

}
     
     
}
