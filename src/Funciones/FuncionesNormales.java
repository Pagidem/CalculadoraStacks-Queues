/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import tda.Cola;
import tda.Pila;

/**
 *
 * @author Gj
 */
public class FuncionesNormales {
   
    public void aCola(String n, Cola c){
        for(int i =0; i<n.length();i++){
            c.enqueue(n.charAt(i));
        }
    }
/////////////////////////// SUMA SUMA SUMA SUMA ////////////////////////////////    
    public static Pila sumas(Pila pila1,Pila pila2){
        int llevamos = 0;
        int suma =0;
        Pila pila3 = new Pila();
        while (!pila1.isEmpty() && !pila2.isEmpty()) {
            suma = (int)pila1.pop() + (int)pila2.pop();
            pila3.push(suma % 10);
            llevamos = suma / 10;
        }
        while (!pila1.isEmpty()) {
            suma = (int)pila1.pop() + (int)llevamos;
            pila3.push(suma % 10);
            llevamos = suma / 10;
        }
        while (!pila2.isEmpty()) {
            suma = (int)pila2.pop() +(int)llevamos;
            pila3.push(suma % 10);
            llevamos = suma / 10;
        }
        if (llevamos>0) {
            pila3.push(llevamos);
        }
        
        return pila3 ;
    }
    
    /////////////////////// RESTA RESTA RESTA RESTA ////////////////////////////
    
    public String resta(String n1, String n2) {
        Cola mayor = new Cola();
        Cola menor = new Cola();

        if (n1.length() > n2.length()) {
            aCola(n1, mayor);
            aCola(n2, menor);
        } else {
            aCola(n1, menor);
            aCola(n2, mayor);
        }

        Cola resultado = new Cola();
        int r = 0;

        while (!mayor.isEmpty()) {
            int a1 = Integer.valueOf(String.valueOf(mayor.dequeue()));
            int a2 = 0;

            if (!menor.isEmpty()) {
                a2 = Integer.valueOf(String.valueOf(menor.dequeue()));
            }

            r = (a1 - a2 + r) / 10;
            resultado.enqueue(a1 - a2 + r);
        }

        if (r > 0) {
            resultado.enqueue(r);
        }

        String res = "";
        while (!resultado.isEmpty()) {
            res = res + resultado.dequeue();
        }
        return res;
    }
    
    ///////////////////////MULTIPLICACION PRODUCTO//////////////////////////////
    public String producto(String n1, String n2){
        return null;
        
    }
    
}


