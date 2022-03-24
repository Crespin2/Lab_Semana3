
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        
    Estudiante est =new Estudiante();//objetoo de la clase estudiante
    //Agregar la clase respectiva para la lectura desde el teclado
    BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
    
    try{
        //Ingreso de los respectivos valores
        System.out.println("Carnet del estudiante: ");
        long carnet =Long.parseLong(leer.readLine());
        System.out.println("Nombres del estudiante: ");
        String nombres=leer.readLine();
        System.out.println("Apellidos del Estudiante: ");
        String apellidos=leer.readLine();
        
        //Asignandoles valres a cada atributo
        est.setCarnetEstudiante(carnet);
        est.setNombreEstudiante(nombres);
        est.setApellidosEstudiante(apellidos);
        
        //Recuperacion de datos
        System.out.println("<<<<<RECUPERANDO VALORES>>>>>>>");
        System.out.println("Carnet: "+est.getCarnetEstudiante());
        System.out.println("Nombres: "+est.getNombreEstudiante());
        System.out.println("Apellidos: "+est.getApellidosEstudiante());
        
        
    }catch(Exception e){
            System.out.println(e.getMessage());
    }
}
}
