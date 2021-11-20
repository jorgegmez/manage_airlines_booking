/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbframework_airlines_booking;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariel / Jorge / Jean
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String cod_pasajero;
    private Double millas_acumuladas;
    private String fecha_nacimiento;
    private String correo_electronico;
    private String contrasenna;
    Usuario usuarios[] = new Usuario[2];
    private boolean isAdmin = false; // false = Pasajero / true = Admin

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    public Double getMillas_acumuladas() {
        return millas_acumuladas;
    }

    public void setMillas_acumuladas(Double millas_acumuladas) {
        this.millas_acumuladas = millas_acumuladas;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void cargarAdmin()
    {
       int number = (int)(Math.random() * 1000);
       Usuario UsuarioAdmin = new Usuario();
       UsuarioAdmin.nombre = "Jorge";
       UsuarioAdmin.apellidos = "Gomez";
       UsuarioAdmin.cod_pasajero = "admin-" + number;
       UsuarioAdmin.correo_electronico = "jorge.admin@gmail.com";
       UsuarioAdmin.fecha_nacimiento = "1997/09/23";
       UsuarioAdmin.millas_acumuladas = null;
       UsuarioAdmin.isAdmin = true;
       UsuarioAdmin.contrasenna = "admin123!";
       JOptionPane.showMessageDialog(null, "Usuario Admin " + UsuarioAdmin.correo_electronico);
       usuarios[0] = UsuarioAdmin;
    }
}
