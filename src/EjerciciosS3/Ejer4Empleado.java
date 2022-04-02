
package EjerciciosS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejer4Empleado {    
    private String numNit;
    private String apellidos;
    private String nombres;
    private String direccion;
    private double salarioDevengado;
    private double salarioConDescuento;
    private String banderaEmpleadoAI;
    private double renta;
    //CONSTRUCTOR
    public Ejer4Empleado(){
       
    }
    //METODOS getter and setter
    public double getRenta(){
        return renta;
    }
    public void setRenta(double renta){
        this.renta=renta;
    }
    public String getNumNit() {
        return numNit;
    }
    public void setNumNit(String numNit) {
        this.numNit = numNit;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getSalarioDevengado() {
        return salarioDevengado;
    }
    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }
    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }
    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }
    public String getBanderaEmpleadoAI() {
        return banderaEmpleadoAI;
    }
    public void setBanderaEmpleadoAI(String banderaEmpleadoAI) {
        this.banderaEmpleadoAI = banderaEmpleadoAI;
    }
    //METODOS
    public double calcularSalarioConDescuento(){
        renta=salarioDevengado*0.10;
        salarioConDescuento=salarioDevengado-renta;
    return salarioConDescuento;
    }
    public void obtenerNombreCompleto(){
        String nomCompleto=nombres + apellidos;
        System.out.println("Nombre Completo: "+nomCompleto);
    }
    //METODO PRINCIPAL
    public static void main(String[] args) {
        Ejer4Empleado em = new Ejer4Empleado();
        NumberFormat formt=new DecimalFormat("$#,###.##");
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        
        try{System.out.println("Nombre del Empleado: ");
        String nombres=leer.readLine();
        System.out.println("Apellidos del Empleado: ");
        String apellidos=leer.readLine();
        System.out.println("Ingrese direccion: ");
        String direccion=leer.readLine();
        System.out.println("Numero de NIT: ");
        String numNit=leer.readLine();
        System.out.println("Salario Devengado: ");
        double salarioDevengado=Double.parseDouble(leer.readLine());
        System.out.println("Bandera de estado del Empleado(Activo/Inactivo)");
        String banderaEmpleado=leer.readLine();
        
        em.setNombres(nombres);
        em.setApellidos(apellidos);
        em.setDireccion(direccion);
        em.setNumNit(numNit);
        em.setSalarioDevengado(salarioDevengado);
        em.setBanderaEmpleadoAI(banderaEmpleado);
        
        em.calcularSalarioConDescuento();
        System.out.println("\n ---------------------IMPRIMIENDO DATOS-----------------------");
        em.obtenerNombreCompleto();
        System.out.println("Direccion: "+em.getDireccion());
        System.out.println("Con numero de NIT: "+em.getNumNit());
        System.out.println("Bandera: "+em.getBanderaEmpleadoAI());
        System.out.println("Salario Devengado: "+formt.format(em.getSalarioDevengado()));
        System.out.println("La renta es de: "+formt.format(em.renta));
        System.out.println("Slario Liquido: "+formt.format(em.salarioConDescuento));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}