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
public class Chat_Java {

    /**
     * Atributos
     */
    private String nombre;
    
    /**
     * Atributos
     */
    private String apellido;

    /**
     *
     */
    public Chat_Java() {
        this.nombre = null;
        this.apellido = null;
    }

    /**
     *
     */
    public Chat_Java(String nombre) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Metodo get
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo get
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo toString
     */
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "apellido="+apellido+"}";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
