
package Clases.y.objetos;

public class CuentaBancaria {
    long numeroCuenta;
    Cliente propietarioCuenta;//atributo propietarioCuenta del tipo de la clase Cliente
    double saldoCuenta;

    
    public void abonar(double cantidad){
        saldoCuenta+=cantidad;//logica de negocio
    }
    
    public void retirar(double cantidad){
        if (cantidad> saldoCuenta){
            System.out.println("!Saldo insuficiente");
        }
        saldoCuenta-=cantidad;//logica de negocio
    }
    public String datosPropietarioCuenta(){//metodo para retorno de los datos
        String informacion = "";
        informacion+="DUI: "+propietarioCuenta.duiCliente+"\n";
        informacion+="Nombre: "+propietarioCuenta.nombreCliente+"\n";
        informacion+="Telefono: "+propietarioCuenta.telefonoCliente+"\n";
    return informacion;
    }
}
