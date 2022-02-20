package Fase1;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

class ventanilla {
    public int numero;
    public boolean estado;
    public pilaImagenes pila = new pilaImagenes();
    public cliente persona_atendida = new cliente();
    ventanilla siguiente;

}

public class listaVentanillas {
    Scanner sc = new Scanner(System.in);
    public int num;
    ventanilla primero;
    ventanilla ultimo;

    public listaVentanillas() {
        primero = null;
        ultimo = null;
    }

    public boolean vacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void menu() {
        System.out.println("Defina el numero de ventanillas");
        int v = sc.nextInt();
        for (int i = 1; i <= v; i++) {
            insertar(i);
        }
        //recorrer();

    }

    public void insertar(int numero) {
        num++;
        ventanilla nuevo = new ventanilla();
        nuevo.numero = numero;
        nuevo.estado = true;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    }

   
}