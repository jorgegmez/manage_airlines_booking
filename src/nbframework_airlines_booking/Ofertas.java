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


        final JComponent[] inputs = new JComponent[] {
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
        }
    }
    
    private void modificar_oferta()
    {
        // Write code here
    }
    
    private void eliminar_oferta()
    {
        // Write code here
    }
    
    private void salir()
    {
        // Write code here
    }
    
    public Ofertas listar_ofertas()
    {
        // Write code here
        return null;
    }
    
}
