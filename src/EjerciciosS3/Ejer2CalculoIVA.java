
package EjerciciosS3;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que
calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el
precio del artículo sin IVA.*/

public class Ejer2CalculoIVA {
    //Atributos
    
    
    NumberFormat fort= new DecimalFormat("$#,###.##");
    //Metodos 
    public double valorSinIVA(double articuloSinIVA, double iva1){
        double valorIVA;
        valorIVA=articuloSinIVA*(iva1/100);
        double artIVA=articuloSinIVA+valorIVA;
        System.out.println("-----------------RESULTADO----------------------");
        System.out.println("El precio del producto Sin iva es: "+fort.format(articuloSinIVA));
        System.out.println("El IVA es de: "+fort.format(valorIVA));
        System.out.println("El articulo + IVA es de: "+fort.format(artIVA));
    return articuloSinIVA;
    }
    
    public double valorConIVA(double articuloConIVA, double valorIVA1){
        double iva=(valorIVA1*articuloConIVA)/100;
        double artSinIVA=articuloConIVA-iva;
        System.out.println("-----------------RESULTADO----------------------");
        System.out.println("El precio del producto es de: "+fort.format(articuloConIVA));
        System.out.println("El valor del iva es de: "+fort.format(iva));
        System.out.println("El precio del producto sin IVA es"+fort.format(artSinIVA));
    return articuloConIVA;
    }
   
    //METODO PRINCIPAL
    public static void main(String[] args) {
        Ejer2CalculoIVA ob= new Ejer2CalculoIVA();
        Scanner leer= new Scanner(System.in);

        double _articuloSinIVA;
        double _iva1;
        System.out.println("-----------------ARTICULO SIN IVA----------------------");
        System.out.println("Ingrese el valor del articulo (Sin IVA):");
        _articuloSinIVA=leer.nextDouble();
        System.out.println("Ingrse el porcentaje del iva: ");
        _iva1=leer.nextDouble();
        
        ob.valorSinIVA(_articuloSinIVA, _iva1);
        
        double _articuloConIVA;
        double _valorIVA1;
        System.out.println("");
        System.out.println("-----------------ARTICULO CON IVA----------------------");
        System.out.println("Ingrese el valor del articulo(Con IVA incluido):");
        _articuloConIVA=leer.nextDouble();
        System.out.println("Ingrese el porcentaje del IVA: ");
        _valorIVA1=leer.nextDouble();
        
        ob.valorConIVA(_articuloConIVA, _valorIVA1);
    }
    
}
