/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbframework_airlines_booking;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.*;


/**
 *
 * @author Ariel / Jorge / Jean
 */
public class Usuario extends JFrame {
    String nombre;
    String apellidos;
    String cod_pasajero;
    Double millas_acumuladas;
    Date fecha_nacimiento;
    String correo_electronico;
    String contrasenna;
    Usuario usuarios[] = new Usuario[2];
    boolean isAdmin; // false = Pajero / true = Admin
    private final static boolean shouldFill = true;
    private final static boolean shouldWeightX = true;
    private final static boolean RIGHT_TO_LEFT = true;
    
    public void registro_usuario()
    {
        //Create and set up the window.
        setLayout(new GridBagLayout());
        JFrame frame = new JFrame("Registrar Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        registrar_usuario(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void registrar_usuario(Container pane)
    {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        pane.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();

        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        // Nombre input/label
        JLabel NombreLabel = new JLabel("Nombre: ");
        if (shouldWeightX)
        {
            c.weightx = 2;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(NombreLabel, c);
        JTextField NombreTextField = new JTextField(20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(NombreTextField, c);
        
        // Apellidos input/label
        JLabel ApellidoLabel = new JLabel("Apellidos: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(ApellidoLabel, c);
        JTextField ApellidosTextField = new JTextField(20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(ApellidosTextField, c);
        
        // Fecha Nacimiento input/label
        JLabel FechaNacimientoLabel = new JLabel("Fecha Nacimiento: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(FechaNacimientoLabel, c);
        JFormattedTextField DateTextField = new JFormattedTextField(new Date());
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(DateTextField, c);
    
        // Email input/label
        JLabel EmailLabel = new JLabel("Correo Electrónico: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 2;
        c.gridy = 3;
        pane.add(EmailLabel, c);
        JTextField EmailTextField = new JTextField(30);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(EmailTextField, c);

        // Pssword input/label
        JLabel PasswordLabel = new JLabel("Contraseña: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 2;
        c.gridy = 4;
        pane.add(PasswordLabel, c);
        JPasswordField PasswordTextField = new JPasswordField(16);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(PasswordTextField, c);
        	
        // Button
	JButton RegisterButton = new JButton("Registrar");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 4;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(RegisterButton, c);
        
        nombre = NombreTextField.getText();
	apellidos = ApellidosTextField.getText();
	//cod_pasajero = <VALUE_PENDING>.getText();
	//millas_acumuladas = <VALUE_PENDING>.getText();
	fecha_nacimiento = DateTextField.getText();
	correo_electronico = EmailTextField.getText();
	contrasenna = PasswordTextField.getText();
        
    }
    
    public static void cargarAdmin()
    {
        
    }
    
    
    
    public void iniciar_sesion()
    {
        
    }
}
