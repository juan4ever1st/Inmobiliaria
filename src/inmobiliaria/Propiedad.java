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
public class Propiedad {
    private String direccion;//atributo privado string
    private int cant_habitaciones;//atributo privado string
    private int sup_cubierta;//atributo privado string
    private int id;//atributo privado id

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_habitaciones() {
        return cant_habitaciones;
    }

    public void setCant_habitaciones(int cant_habitaciones) {
        this.cant_habitaciones = cant_habitaciones;
    }

    public int getSup_cubierta() {
        return sup_cubierta;
    }

    public void setSup_cubierta(int sup_cubierta) {
        this.sup_cubierta = sup_cubierta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Propiedad(String direccion, int cant_habitaciones, int sup_cubierta, int id) {
        this.direccion = direccion;
        this.cant_habitaciones = cant_habitaciones;
        this.sup_cubierta = sup_cubierta;
        this.id = id;
    }
}
