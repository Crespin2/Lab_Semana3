
package EjerciciosS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer1Casa {
    private String numeroCasa;
    private String numeroPasaje;
    private String nombreCalle;
    

    public Ejer1Casa() {
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getNumeroPasaje() {
        return numeroPasaje;
    }

    public void setNumeroPasaje(String numeroPasaje) {
        this.numeroPasaje = numeroPasaje;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
    public void imprimirDatos(String _nombreCalle, String _numeroCasa, String _numeroPasaje){

        System.out.println("El nombre de la calle es: "+ _nombreCalle);
        System.out.println("El numero de la casa es de: "+_numeroCasa);
        System.out.println("El numero del pasaje es de: "+_numeroPasaje);
        
    }
    

    public static void main(String[] args) {
        Ejer1Casa casa=new Ejer1Casa();
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Nombre de la calle: ");
        String _nombreCalle=leer.readLine();
        System.out.println("Numero de la casa: ");
        String _numeroCasa=leer.readLine();
        System.out.println("Numero del pasaje: ");
        String _numeroPasaje=leer.readLine();
        
        casa.setNombreCalle(_nombreCalle);
        casa.setNumeroCasa(_numeroCasa);
        casa.setNumeroPasaje(_numeroPasaje);
        
        casa.imprimirDatos(_nombreCalle, _numeroCasa, _numeroPasaje);
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
