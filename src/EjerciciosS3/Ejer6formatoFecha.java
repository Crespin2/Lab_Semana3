
package EjerciciosS3;
    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejer6formatoFecha {
    private int dia;
    private int mes;
    private int anio;

    public Ejer6formatoFecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    
    
    public void fomatoFecha(int dia, int mes, int anio){
        System.out.format("Fecha (dd-mm-aaaa): %s-%s-%s \n",dia, mes, anio);
    }
    public void fomatoFecha(){
        System.out.format("Fecha (dd-mm-aaaa): %s/%s/%s \n",dia, mes, anio);
    }
    public static void main(String[] args) {
        Ejer6formatoFecha fe=new Ejer6formatoFecha();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Ingrese la fecha:");
        System.out.print("DIA:");
        int _dia = Integer.parseInt(leer.readLine());
        System.out.print("MES:");
        int _mes=Integer.parseInt(leer.readLine());
        System.out.print("AÑO:");
        int _anio=Integer.parseInt(leer.readLine());
        
        fe.setDia(_dia);
        fe.setMes(_mes);
        fe.setAnio(_anio);
        //POLIMORFISMO
        //formato (dd-mm-aaaa)
        fe.fomatoFecha(_dia, _mes, _anio);

        //formato (dd/mm/aaaa)
        fe.fomatoFecha();
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
       
    }
}
