
package Clases.y.objetos;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[] args) {
        //Crear el objeto propietario
        CuentaBancaria cuenta = new CuentaBancaria();//Crear instancia (objeto) de la clase CuentaBancaria
        Scanner leer = new Scanner(System.in);//objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        
        System.out.println("Ingresar los datos que se piden a continuacion: ");
        System.out.println("Nombre del propietario: ");
        nombreCliente=leer.nextLine();
        
        System.out.println("Numero de DUI: ");
        duiCliente=leer.nextLine();
        
        System.out.println("Numero de telefono: ");
        telefonoCliente=leer.nextLong();//asignar valores a los atributos de la clase
        
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);//envio de parametros
        cuenta.propietarioCuenta=propietario;//asignandole el objeto propietario al objeto cuenta
        
        System.out.println("Ingrese la cantidad a abonar: ");
        cuenta.abonar(abono=leer.nextDouble());//envio de parametro  abonar de la clase CuentaBancaria
        
        System.out.println("Ingresar la cantidad a retirar: ");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("----------------------");
        System.out.println("Su saldo de la cuenta es de: "+ cuenta.saldoCuenta);//obtiene saldo de la cuenta
        System.out.println("Datos del prppietario : \n"+cuenta.datosPropietarioCuenta());
    }
}
