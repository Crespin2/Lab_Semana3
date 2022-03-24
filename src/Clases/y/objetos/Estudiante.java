
package Clases.y.objetos;

public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstdiante(){
        System.out.println("Metodo para el registro de estudiantes: ");
    }
    public void consultarEstudiante(){
        System.out.println("Metodo para consultar de estudiante: ");
    }
    public void eliminarEstudiante(){
        System.out.println("Metodo para eliminar de estudinate: ");
    }
    
    public static void main(String[] args) {
        Estudiante est=new Estudiante();//El objeto est es la intancia de la clase Estudiante
        est.carnet=1234;//Asignar valores a cada uno de los atributos est.caret objeto mas atributo
        est.nombre="Amelia";
        est.apellido="Rosales";
        
        est.registroEstdiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet    :"+est.carnet);//El objeto y el atributo est.carnet
        System.out.println("Nombre    :"+est.nombre);
        System.out.println("Apellidos :"+est.apellido);
        
        
    }
}
