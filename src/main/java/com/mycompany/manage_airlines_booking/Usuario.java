/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manage_airlines_booking;

import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jorgegomez
 */
public class Usuario {
    String nombre;
    String apellidos;
    String cod_pasajero;
    Double millas_acumuladas;
    Date fecha_nacimiento;
    String correo_electronico;
    String contrasenna;
    int role; // 1 = Pajero / 2 = Admin
    
    public void registrar_usuario()
    {
        JTextField nombre_input = new JTextField();
        JTextField apellido_input = new JTextField();
        JTextField fecha_input = new JTextField();
        JTextField correo_input = new JTextField();
        JPasswordField password = new JPasswordField();
        final JComponent[] inputs = new JComponent[] {
                new JLabel("Nombre: "),
                nombre_input,
                new JLabel("Apellido: "),
                apellido_input,
                new JLabel("Fecha de nacimiento: "),
                fecha_input,
                new JLabel("Correo Electronico: "),
                correo_input,
                new JLabel("Contraseña: "),
                password
        };
        int response = JOptionPane.showConfirmDialog(null, inputs, "Registro de Usuario", JOptionPane.PLAIN_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            System.out.println("Usuario registrado con exito!");
        }
    }
    
    public void iniciar_sesion()
    {
        JTextField correo_input = new JTextField();
        JPasswordField password = new JPasswordField();
        final JComponent[] inputs = new JComponent[] {
                new JLabel("Correo electronico: "),
                correo_input,
                new JLabel("Contraseña: "),
                password
        };
        JOptionPane.showInputDialog(null, inputs, "Inicio de sesión", JOptionPane.PLAIN_MESSAGE);
    }
}
