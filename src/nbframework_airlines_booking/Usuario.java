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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Ariel / Jorge / Jean
 */
public class Usuario extends JFrame {
    String nombre;
    String apellidos;
    String cod_pasajero;
    Double millas_acumuladas;
    String fecha_nacimiento;
    String correo_electronico;
    String contrasenna;
    Usuario usuarios[] = new Usuario[2];
    boolean isAdmin = false; // false = Pasajero / true = Admin
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
        JFormattedTextField DateTextField = new JFormattedTextField(createFormatter("YYYY-MM-DD"));
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
        
               
        RegisterButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    int number = (int)(Math.random() * 1000);
                    Usuario UsuarioPasajero = new Usuario();
                    UsuarioPasajero.nombre = NombreTextField.getText();
                    UsuarioPasajero.apellidos = ApellidosTextField.getText();
                    UsuarioPasajero.cod_pasajero = "pasajero-" + number;
                    UsuarioPasajero.millas_acumuladas = 0.0;
                    UsuarioPasajero.fecha_nacimiento = DateTextField.getText();
                    UsuarioPasajero.correo_electronico = EmailTextField.getText();
                    UsuarioPasajero.contrasenna = String.valueOf(PasswordTextField.getPassword());
                    UsuarioPasajero.isAdmin = false;
                    saveData(UsuarioPasajero);
            }  
        });    
    }
    
    private void saveData(Usuario UsuarioPasajero)
    {
        usuarios[1] = UsuarioPasajero;
        JOptionPane.showMessageDialog(null, "Usuario" + usuarios[1].nombre + " Admin " + usuarios[0].nombre);
        
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
       usuarios[0] = UsuarioAdmin;
    }
    
    
    
    public void iniciar_sesion()
    {
        
    }
    
    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
}
