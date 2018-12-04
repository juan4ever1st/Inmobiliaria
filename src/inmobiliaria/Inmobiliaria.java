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
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contrato nuevo = new Contrato();
       
        Fecha hoy = new Fecha();
        System.out.print("La fecha del contrato es: ");
        hoy.mostrarFecha();
        
        
    }
    
}
