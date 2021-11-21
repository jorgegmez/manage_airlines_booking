/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbframework_airlines_booking;

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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author jorgegomez
 */
public class Autenticacion extends JFrame {
    Usuario Usuario = new Usuario();
    Usuario usuarioLogeado = new Usuario();
    private final static boolean shouldFill = true;
    private final static boolean shouldWeightX = true;
    private final static boolean RIGHT_TO_LEFT = true;
    
    
    public void unlogged_menu()
    {
        int opcion = 0;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" + "1: Iniciar Sesión \n" + "2: Registrar Usuario"));
        
        switch (opcion)
        {
            case 1:
                inicio_sesion();
            break;

            case 2:
                registro_usuario();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Favor ingrese una opcion valida.");
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese el número de la opción que desea: \n" +
                "1: Iniciar Sesión \n" +
                "2: Registrar Usuario"));
            break;
        }
    }
    
    public void logged_menu(boolean isAdmin)
    {
        boolean Salir = false;
        int opcion = 0;
        
        while(!Salir)
        {
            if (isAdmin)
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el número de la opción que desea: \n" +
                    "1: Crear Oferta \n" +
                    "2: Modificar Oferta \n" +
                    "3: Eliminar Oferta \n" +
                    "4: Salir"));

                switch (opcion)
                {
                    case 1:
                        // Metodo Crear Oferta
                    break;

                    case 2:
                        // Metodo Modificar Oferta
                    break;

                    case 3:
                        // Metodo Eliminar Oferta
                    break;

                    case 4:
                        Salir = true;
                        unlogged_menu();
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Favor ingrese una opcion valida.");
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese el número de la opción que desea: \n" +
                        "1: Crear Oferta \n" +
                        "2: Modificar Oferta \n" +
                        "3: Eliminar Oferta \n" +
                        "4: Salir"));
                    break;
                }
            }
            else
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" +
                    "1: Reservar Vuelo \n" +
                    "2: Modificar Vuelo \n" +
                    "3: Eliminar Reserva de Vuelo \n" +
                    "4: Buscar Ofertas \n" +
                    "5: Salir \n"));
                
                switch (opcion)
                {
                    case 1:
                        // Metodo Reservar Vuelo
                    break;

                    case 2:
                        // Metodo Modificar Vuelo
                    break;

                    case 3:
                        // Metodo Eliminar Vuelo
                    break;
                    
                    case 4:
                        // Metodo Buscar Ofertas
                    break;

                    case 5:
                        Salir = true;
                        unlogged_menu();
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Favor ingrese una opcion valida.");
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la opción que desea: \n" +
                        "1: Reservar Vuelo \n" +
                        "2: Modificar Vuelo \n" +
                        "3: Eliminar Reserva de Vuelo \n" +
                        "4: Buscar Ofertas \n" +
                        "5: Salir"));
                    break;
                }
            }
        }
    }

    private void registro_usuario()
    {
        //Create and set up the window.
        setLayout(new GridBagLayout());
        JFrame frame = new JFrame("Registrar Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Usuario.cargarAdmin();
        //Set up the content pane.
        registrar_usuario(frame.getContentPane(), frame);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void inicio_sesion()
    {
        //Create and set up the window.
        setLayout(new GridBagLayout());
        JFrame frame = new JFrame("Iniciar Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Usuario.cargarAdmin();
        //Set up the content pane.
        iniciar_sesion(frame.getContentPane(), frame);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    private void registrar_usuario(Container pane, JFrame frame)
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
        DateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        DateFormatter df = new DateFormatter(format);
        JFormattedTextField DateTextField = new JFormattedTextField(df);
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
                Usuario.setNombre(NombreTextField.getText());
                Usuario.setApellidos(ApellidosTextField.getText());
                Usuario.setCod_pasajero("pasajero-" + number);
                Usuario.setMillas_acumuladas(0.0);
                Usuario.setFecha_nacimiento(DateTextField.getText());
                Usuario.setCorreo_electronico(EmailTextField.getText());
                Usuario.setContrasenna(String.valueOf(PasswordTextField.getPassword()));
                Usuario.setIsAdmin(false);
                Usuario.usuarios[1] = Usuario;
                frame.dispose();
                logged_menu(false);
            }  
        });    
    }
        
    private void iniciar_sesion(Container pane, JFrame frame)
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
	JButton LoginButton = new JButton("Iniciar Sesión");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 4;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(LoginButton, c);
        
               
        LoginButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                boolean UserFound = false;
                final String LoginEmail = EmailTextField.getText();
                final String LoginPassword = String.valueOf(PasswordTextField.getPassword());
                
                for (int i = 0; i < Usuario.usuarios.length; i++)
                {
                    if (Usuario.usuarios[i].getCorreo_electronico().equals(LoginEmail)
                    && Usuario.usuarios[i].getContrasenna().equals(LoginPassword))
                    {
                        usuarioLogeado = Usuario.usuarios[i];
                        UserFound = true;
                        frame.dispose();
                        logged_menu(usuarioLogeado.isIsAdmin());
                    }
                }
                if (!UserFound)
                {
                    frame.dispose();
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos. Intente de nuevo!");
                    unlogged_menu();
                }
            }  
        });
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
