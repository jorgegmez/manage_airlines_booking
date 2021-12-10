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
    
    
    Date fecha_array[] = new Date[100];
    
// The following can be changed as 
    
    
    
    i=0
    
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

        // The following can be used to take info for the variables, however I would propose to use arrays instead to sort the info accordingly
        /*final JComponent[] inputs = new JComponent[] {
                new JLabel("Nombre de la oferta: "),
                nombre_input,
                new JLabel("Valido hasta: "),
                fecha_input,
                new JLabel("Condiciones: "),
                fecha_input,
                new JLabel("Descuento: "),
                descuento,
                new JLabel("Precio: "),
                precio
        };

        int response = JOptionPane.showConfirmDialog(null, inputs, "Registro de Oferta", JOptionPane.PLAIN_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            System.out.println("Oferta registrada con exito!");
        }*/
       int registros_q = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de ofertas a registrar"))
       Ofertas_DB datos[] = new Ofertas_DB [registros_q]
           for (i = 0; i < datos; i++) {
        String nombre =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre de la oferta"));
        String condiciones =Integer.parseInt(JOptionPane.showInputDialog("Ingrese las condiciones"));
        int descuento =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuento"));
        int precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
            
               datos[i]= new Ofertas_DB(nombre,condiciones,descuento,precio)
}
    
    private void modificar_oferta()
    {
        // Write code here
    }
    
    private void eliminar_oferta()
    {
        int registros_e = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la oferta a eliminar"));
        nombres_array[registros_e]= "";
        condiciones_array[registros_e]="";
        descuento_array[registros_e]= 0;
        precio_array[registros_e]= 0;
        
        JOptionPane.showMessageDialog("Oferta Eliminada. Volviendo al menu de opciones");
        Autenticacion menu_return = new Autenticacion();
        menu_return.logged_menu();
        //The confirmation to remove another offer can be implemented
    }
        public Ofertas listar_ofertas()
    {
        int registros_m = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la oferta a mostrar"));

        JOptionPane.showInputDialog("Mostrando oferta # " + registros m +
                                    "\nNombre: " + nombres_array[registros_m] +
                                   "\nCondiciones: " + condiciones_array[registros_m] +
                                   "\nDescuento: " + descuento_array[registros_m] +
                                   "\nPrecio: " precio_array[registros_m]);

        return null;
    }
     
    private void salir()
    {
        // Write code here
    }
    

    
}
