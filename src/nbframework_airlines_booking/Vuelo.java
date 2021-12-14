/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbframework_airlines_booking;

import java.util.Date;

/**
 *
 * @author Ariel
 */
public class Vuelo {

     public void Menu_Vuelo()
    {
        Relleno_Arreglo();

     boolean seguir = true;
        
        while (seguir){
        
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Sistema de Reserva del Vuelos \n"+
                                                                      "1. Ingresar Reserva\n"+
                                                                      "2. Modificación de Reserva\n"+
                                                                      "3. Eliminar Reserva\n"+
                                                                      "4. Consultar reserva por cedula\n"+
                                                                      "5. Disponibilidad de Reservas\n"+
                                                                      "6. Salir del Programa\n"));
            
            switch(opcion)
            {
                case 1:
                    Reserva_Vuelo();
                    break;
                case 2:
                    Modificar_Reserva_Vuelo();
                    break;
                case 3:
                    Eliminar_Reserva_Vuelo();
                    break;
                case 4:
                    Consultar_Reserva_Cedula();
                    break;
                case 5:
                    Disponibilidad_Reservas_Vuelo();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Muchas gracias por usar el sistema de reservas");
                    seguir =false;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Ingrese un valor correcto del Menú");
                     break;
                    
                           
            }
            
        }
    }
     
    static String Avion[][] = new String[6][50];
     
    public void Relleno_Arreglo()
    {
    for (int f=0; f<Avion.length ; f++)
    {
    for(int c=0; c<Avion[0].length;c++)
    {

    Avion[f][c]="d";

    }
    }
    }
     
   public void Reserva_Vuelo()
   {

       /*
       int cant_pasajeros;
       Double costo;
       */

    boolean seguir = true;
    
    //int cant_reservas = 0;
        
     while (seguir){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el destino al que desea reservar\n"+
                                                                      "1. UNITED STATE\n"+
                                                                      "2. MEXICO\n"+
                                                                      "3. PAMANA\n"+
                                                                      "4. GUATEMALA\n"+
                                                                      "5. COLOMBIA\n"+
                                                                      "6. Salir de reservas\n"));
            

        if (opcion==1){
        String ida = JOptionPane.showInputDialog("Ingrese la fecha de salida, (dd/mm/aaaa)");
        String vuelta = JOptionPane.showInputDialog("Ingrese la fecha de regreso, (dd/mm/aaaa)");        
        String Pasaporte = JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
                                                                "1.Asiento de ventana derecha\n"+
                                                                "2.Asiento de en medio derecha\n"+
                                                                "3.Asiento de pasillo derecha\n"+
                                                                "4.Asiento de pasillo izquierda\n"+
                                                                "5.Asiento de en medio izquierda\n"+
                                                                "6.Asiento de ventana izquierda\n"));
        

        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea reservar\n"+
                                                             "Del campo #1 al #10 Son primera clase\n"+
                                                             "Del campo # 11 al 50 Son clase turistica"));
        
        fila--;
        campo--;
        
        if (Avion[fila][campo].equals("d"))
        {
            Avion[fila][campo]= Pasaporte;
            JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campo Ocupado");
        }
        
        int otro = JOptionPane.showConfirmDialog(null, "¿Desea reservar otro campo?");
        
        if(otro==1)
        {
            seguir = false;
        }
        
        else{
             return;
        }
        }  
        
        if (opcion==2){
        String ida = JOptionPane.showInputDialog("Ingrese la fecha de salida, (dd/mm/aaaa)");
        String vuelta = JOptionPane.showInputDialog("Ingrese la fecha de regreso, (dd/mm/aaaa)");        
        String Pasaporte = JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
                                                                "1.Asiento de ventana derecha\n"+
                                                                "2.Asiento de en medio derecha\n"+
                                                                "3.Asiento de pasillo derecha\n"+
                                                                "4.Asiento de pasillo izquierda\n"+
                                                                "5.Asiento de en medio izquierda\n"+
                                                                "6.Asiento de ventana izquierda\n"));
        

        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea reservar\n"+
                                                             "Del campo #1 al #10 Son primera clase\n"+
                                                             "Del campo # 11 al 50 Son clase turistica"));
        
        fila--;
        campo--;
        
        if (Avion[fila][campo].equals("d"))
        {
            Avion[fila][campo]= Pasaporte;
            JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campo Ocupado");
        }
        
        int otro = JOptionPane.showConfirmDialog(null, "¿Desea reservar otro campo?");
        
        if(otro==1)
        {

            seguir = false;
        }
        
        else{
             return;
        }
        }   
        
        if (opcion==3){
        String ida = JOptionPane.showInputDialog("Ingrese la fecha de salida, (dd/mm/aaaa)");
        String vuelta = JOptionPane.showInputDialog("Ingrese la fecha de regreso, (dd/mm/aaaa)");        
        String Pasaporte = JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
                                                                "1.Asiento de ventana derecha\n"+
                                                                "2.Asiento de en medio derecha\n"+
                                                                "3.Asiento de pasillo derecha\n"+
                                                                "4.Asiento de pasillo izquierda\n"+
                                                                "5.Asiento de en medio izquierda\n"+
                                                                "6.Asiento de ventana izquierda\n"));
        

        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea reservar\n"+
                                                             "Del campo #1 al #10 Son primera clase\n"+
                                                             "Del campo # 11 al 50 Son clase turistica"));
        
        fila--;
        campo--;
        
        if (Avion[fila][campo].equals("d"))
        {

            Avion[fila][campo]= Pasaporte;

            JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campo Ocupado");
        }
        
        int otro = JOptionPane.showConfirmDialog(null, "¿Desea reservar otro campo?");
        
        if(otro==1)
        {
            seguir = false;
        }
        
               
             if (opcion==4){
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto"));
        fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
        
        }
        else{
             return;
        }
        }  
               
        if (opcion==4){
        String ida = JOptionPane.showInputDialog("Ingrese la fecha de salida, (dd/mm/aaaa)");
        String vuelta = JOptionPane.showInputDialog("Ingrese la fecha de regreso, (dd/mm/aaaa)");        
        String Pasaporte = JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
                                                                "1.Asiento de ventana derecha\n"+
                                                                "2.Asiento de en medio derecha\n"+
                                                                "3.Asiento de pasillo derecha\n"+
                                                                "4.Asiento de pasillo izquierda\n"+
                                                                "5.Asiento de en medio izquierda\n"+
                                                                "6.Asiento de ventana izquierda\n"));
        

        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea reservar\n"+
                                                             "Del campo #1 al #10 Son primera clase\n"+
                                                             "Del campo # 11 al 50 Son clase turistica"));
        
        fila--;
        campo--;
        
        if (Avion[fila][campo].equals("d"))
        {

            Avion[fila][campo]= Pasaporte;
            JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campo Ocupado");
        }
        
        int otro = JOptionPane.showConfirmDialog(null, "¿Desea reservar otro campo?");
        
        if(otro==1)
        {

            seguir = false;
        }       
       
        else{
             return;
        }
        } 
             
        if (opcion==5){
        String ida = JOptionPane.showInputDialog("Ingrese la fecha de salida, (dd/mm/aaaa)");
        String vuelta = JOptionPane.showInputDialog("Ingrese la fecha de regreso, (dd/mm/aaaa)");        
        String Pasaporte = JOptionPane.showInputDialog("Ingrese el numero de cedula al que desea registrar el boleto");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila en donde desea su asiento \n"+
                                                                "1.Asiento de ventana derecha\n"+
                                                                "2.Asiento de en medio derecha\n"+
                                                                "3.Asiento de pasillo derecha\n"+
                                                                "4.Asiento de pasillo izquierda\n"+
                                                                "5.Asiento de en medio izquierda\n"+
                                                                "6.Asiento de ventana izquierda\n"));

        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea reservar\n"+

                                                             "Del campo #1 al #10 Son primera clase\n"+
                                                             "Del campo # 11 al 50 Son clase turistica"));
        
        fila--;
        campo--;
        
        if (Avion[fila][campo].equals("d"))
        {

            Avion[fila][campo]= Pasaporte;
            JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Campo Ocupado");
        }
        
        int otro = JOptionPane.showConfirmDialog(null, "¿Desea reservar otro campo?");
        
        if(otro==1)
        {

            seguir = false;
        }
        

        else{
             return;
        }
        }    
               
      if (opcion==6){
        JOptionPane.showMessageDialog(null, "Muchas gracias por usar el sistema de reservas");
        seguir = false;
        break;
      
         }else if (opcion >6){
          JOptionPane.showMessageDialog(null, "Ingrese un numero correcto a la eleccion del menu");
        break;
      }
         
     }
   }

   
   public void Modificar_Reserva_Vuelo()
{
boolean seguir = true;
boolean modificar = true;

    while (seguir){
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila reservado"));
        int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo reservado"));
            
 fila--;
 campo--;
            

    String Pasaporte = JOptionPane.showInputDialog("Ingrese el número de cedula que le pertenece a ese campo");
             
    if (Avion[fila][campo].equals(Pasaporte))
{
    while(modificar)
{
    JOptionPane.showMessageDialog(null, "Indique acontinuación los campos a los que desea cambiar la reservación");
    int filaM = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila a cambiar"));
    int campoM = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo a cambiar"));
                    
filaM--;
campoM--;
                    
if (Avion[filaM][campoM].equals("d"))
{

    Avion[filaM][campoM]= Pasaporte;
    Avion[fila][campo]="D";
    JOptionPane.showMessageDialog(null, "Campo Reservado Exitosamente");
    
modificar=false;
}
  else
{
    JOptionPane.showMessageDialog(null, "Campo Ocupado");
                      
    int otroM = JOptionPane.showConfirmDialog(null,"¿Desea intentar con otro campo?");
                      
    if(otroM ==1)
 {
     modificar=false;
 }
 }
 }
 }
 else
 {
     JOptionPane.showMessageDialog(null, "La reservacion no le pertenece a ese #cedula");
 }
            
     int otro = JOptionPane.showConfirmDialog(null,"¿Desea modificar otra reservación?");
                      
     if(otro ==1)
{
    seguir=false;
}
            
        }
    }
   
      
   public void Eliminar_Reserva_Vuelo()
   {
       boolean seguir = true;
       
       while(seguir)
       {
           int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Fila"));
           int campo = Integer.parseInt(JOptionPane.showInputDialog("Digite el # Campo que desea eliminar"));
           
           fila--;
           campo--;
           
           JOptionPane.showMessageDialog(null, "Por motivo de seguridad se requiere validar el #Cedula del campo a eliminar");
           
           String cedula = JOptionPane.showInputDialog("Ingrese el número de cedula que le pertenece a ese campo");
            
           if(Avion[fila][campo].equals(cedula))
           {
               Avion[fila][campo] ="D";
               JOptionPane.showMessageDialog(null, "La reserva fue eliminada exitosamente");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "El #Cedula no le pertenece a la reservada indicada");
           }
           
           int otro = JOptionPane.showConfirmDialog(null,"¿Desea eliminar otra reservación?");
                      
           if(otro ==1)
           {
             seguir=false;
           }
           
       }
   }
   
   public void Consultar_Reserva_Cedula()
   {
        boolean seguir = true;
        int contador = 0;
        
        while(seguir)
        {
            String Pasaporte = JOptionPane.showInputDialog("Ingrese el número de cedula a consultar");         
            for(int f=0; f<Avion.length; f++)
            {
                for(int c=0; c<Avion[0].length; c++)
                {
                    if(Avion[f][c].equals(Pasaporte))
                    {
                        JOptionPane.showMessageDialog(null, "El #Cedula "+Pasaporte+" tiene el campo reservado: \n"+
                                                             "Fila # " +(f+1)+"\n"+
                                                             "Campo # " +(c+1));
                    }
                    else
                    {
                        contador++;
                    }
                }
            }
            
            if(contador==300)
            {
                JOptionPane.showMessageDialog(null, "El #Cedula consultado, no tiene ninguna reservación");
            }
            
            int otro = JOptionPane.showConfirmDialog(null,"¿Desea consultar otra cedula?");
                      
           if(otro ==1)
           {
             seguir=false;
           }
           
           contador =0;
        }       
   }   
     public void Disponibilidad_Reservas_Vuelo()
   {
        String Reserva ="";
        
        for(int f=0; f<Avion.length; f++)
            {
                for(int c=0; c<Avion[0].length; c++)
                {
                    Reserva+=Avion[f][c]+" ";
                }
                Reserva+="\n";
            }
        
        JOptionPane.showMessageDialog(null, Reserva);       
   }
}
