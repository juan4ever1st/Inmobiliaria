/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author opera020
 */
public class Inquilino extends Persona {
    private String sueldo;

    public Inquilino(String sueldo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    } 

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
