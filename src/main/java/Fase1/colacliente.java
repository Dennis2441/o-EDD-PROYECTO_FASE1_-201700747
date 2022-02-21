/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fase1;

/**
 *
 * @author denni
 */
public class colacliente {
    public cliente raiz,fondo,nuevo = new cliente();
    
    
    colacliente() {

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

        
        nuevo.id_cliente = id;
        nuevo.nombre_cliente = nombre;
        nuevo.img_color = color;
        nuevo.img_bw = bw;

        nuevo.siguiente = null;

        if (vacia ()) {

            raiz = nuevo;

            fondo = nuevo;

        } else {

            fondo.siguiente = nuevo;

            fondo = nuevo;

        }
        
        nuevo=null;

    }

     String extraer(){
         String mensaje="Vacio";
 if (!vacia ())

        {
       String id=raiz.id_cliente;
       if(raiz==fondo){
       raiz=null;
       fondo=null;
       
       
       }else{
        raiz = raiz.siguiente;
       
       }
       
        return id;
        
        
        }
 
 
         return mensaje;

}
     
     
}

