/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package YorkSeveriche.seminario.imc.rmi;

import YorkSeveriche.seminario.imc.rmi.net.Servidor;

/**
 *
 * @author York Severiche
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println((ex.getLocalizedMessage()));
        }
    }
    
}
