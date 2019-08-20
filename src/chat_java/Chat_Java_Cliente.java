/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_java;

/**
 *
 * @author crileiton
 */
public class Chat_Java_Cliente {
    
    /**
     * Atributos
     */
    private String nombre;

    /**
     *
     */
    public Chat_Java_Cliente() {
        this.nombre = null;
    }

    /**
     *
     */
    public Chat_Java_Cliente(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo toString
     */
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
    
}
