package nbframework_airlines_booking;

/**
 *
 * @author Ariel
 */
public class Oferta_DB {
   public String Nombres;
   public String Condiciones;
   public int Descuento;
   public int Precio;
   
   public Oferta_DB(String nombre, String condiciones, int descuento, int precio){
       this.Nombres = nombre;
       this.Condiciones = condiciones;
       this.Descuento = descuento;
       this.Precio = precio;
       
   }
    
}
