/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manage_airlines_booking;

import javax.swing.JOptionPane;

/**
 *
 * @author jorgegomez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        int opcion = 0;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" + "1: Iniciar Sesión \n" + "2: Registrar Usuario"));
        
        switch (opcion)
        {
            case 1:
                usuario.iniciar_sesion();
            break;

            case 2:
                usuario.registrar_usuario();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Favor ingrese una opcion valida.");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" + "1: Iniciar Sesión \n" + "2: Registrar Usuario"));
            break;
        }
        
    }

    
}
