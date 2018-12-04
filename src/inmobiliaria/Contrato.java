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
public class Contrato {
    Fecha fecha;
    Propietario propietario;
    Propiedad propiedad;
    Inquilino inquilino;

    Contrato() {
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Contrato(Fecha fecha, Propietario propietario, Propiedad propiedad, Inquilino inquilino) {
        this.fecha = fecha;
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
    }
    
    
}
