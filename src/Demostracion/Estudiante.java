
package Demostracion;
//Extends
//extends para aplicar herenciaa a la clase
public class Estudiante extends Notas{
    
        int edad;
        int carnet;
        String nombres;
        String apellidos;
        String direccion;
        
    //Contructor
    public Estudiante(){
    
    }
    public Estudiante(int edad, int carnet, String nombres, String apellidos, String direccion) {
        this.edad = edad;
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    
    //get y set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //metodos
    
    public String info_estudent(){
        
    return "";
    }
    
}
