/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbframework_airlines_booking;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ariel
 */
public class Ofertas {
    String nombre_oferta;
    Date fecha_validez;
    String condiciones;
    int descuento;
    Double precio;
    Boolean activo;
    Oferta_DB datos[];
    Autenticacion autenticacion = new Autenticacion();
    
    
    Date fecha_array[] = new Date[100];
       
    public void menu_oferta()
    {
        int opcion = 0;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n"
                + "1: Crear oferta \n"
                + "2: Modificar oferta \n"
                + "3: Eliminar oferta \n"
                + "4: Salir"));
        
        switch (opcion)
        {
            case 1:
                crear_oferta();
            break;

            case 2:
                modificar_oferta();
            break;
            
            case 3:
                eliminar_oferta();
            break;
            
            case 4:
                salir();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Favor ingrese una opcion valida.");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" + "1: Iniciar Sesión \n" + "2: Registrar Usuario"));
            break;
        }
    }
    
    private void crear_oferta()
    {
        JTextField nombre_input = new JTextField();
        JTextField fecha_input = new JTextField();
        JTextField condiciones = new JTextField();
        JTextField descuento = new JTextField();
        JTextField precio = new JTextField();


       int registros_q = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de ofertas a registrar"));
       datos = new Oferta_DB [registros_q];
        for (int i = 0; i < datos.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la oferta");
            String condicionesValue = JOptionPane.showInputDialog("Ingrese las condiciones");
            int descuentoValue = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuento"));
            int precioValue = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));

            datos[i]= new Oferta_DB(nombre,condicionesValue,descuentoValue,precioValue);
        }
    }
    
    private void modificar_oferta()
    {
        // Write code here
    }
    
    private void eliminar_oferta()
    {
        int registros_e = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la oferta a eliminar"));
        datos[registros_e].Nombres= "";
        datos[registros_e].Condiciones="";
        datos[registros_e].Descuento= 0;
        datos[registros_e].Precio= 0;
        
        JOptionPane.showMessageDialog(null, "Oferta Eliminada. Volviendo al menu de opciones");
        autenticacion.logged_menu(true);
    }
        public Ofertas listar_ofertas()
    {
        int registros_m = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la oferta a mostrar"));

        JOptionPane.showInputDialog("Mostrando oferta # " + registros_m +
            "\nNombre: " + datos[registros_m].Nombres +
           "\nCondiciones: " + datos[registros_m].Condiciones +
           "\nDescuento: " + datos[registros_m].Descuento +
           "\nPrecio: " + datos[registros_m].Precio);

        return null;
    }
     
    private void salir()
    {
        autenticacion.unlogged_menu();
    }
    

    
}
