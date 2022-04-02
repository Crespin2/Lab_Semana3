
package EjerciciosS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan
son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los
datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase
Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de
tener un método para imprimir los datos de cada uno de los estudiantes.*/
public class Ejer3Estudiante {
    //atributos
    String numCarnet;
    String nombre;
    String codigoCarrera;
   
    //Constructor
    public Ejer3Estudiante(){
        
    }

    public String getNumCarnet() {
        return numCarnet;
    }

    public void setNumCarnet(String numCarnet) {
        this.numCarnet = numCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
    
    //METODO PRINCIPAL
     public static void main(String[] args) {
        Ejer3Estudiante est = new Ejer3Estudiante();
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        HashMap<Integer, String> estudiante = new HashMap<>();

        
        try{
            for (int i=1; i <=5; i++) {

                System.out.println("Ingrese el nombre del estudiante: ");
                String _nombre=leer.readLine();
                est.setNombre(_nombre);
                estudiante.put(i, _nombre);
                System.out.println("Numero de carnet: ");
                String _numCarnet=leer.readLine();
                est.setNumCarnet(_numCarnet);
                System.out.println("Codigo de carrera: ");
                String _codigoCarrera=leer.readLine();
                est.setCodigoCarrera(_codigoCarrera);
            }
            System.out.println("Codigo(HashMap) -> Nombre del estudiante:");
            for(Integer num:estudiante.keySet()){
                
                     System.out.printf("\t%s \t -> \t %s\n ", num,estudiante.get(num));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
    }

     
                
}

