
package EjerciciosS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejer5FacturaElectrica {
    NumberFormat fml=new DecimalFormat("$#,###.##");
    NumberFormat fml2=new DecimalFormat("#,###.##");
    private String numCuenta;
    private double lecturaMedidorAct;
    private double lecturaMedidorAnt;
    private double multiplicador;
    private double consumoMensual;
    private double consumoDiario;
    private double valorFactura;
    //constructor
    public Ejer5FacturaElectrica(){
    
    }
    //Setter and Getter

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getLecturaMedidorAct() {
        return lecturaMedidorAct;
    }

    public void setLecturaMedidorAct(double lecturaMedidorAct) {
        this.lecturaMedidorAct = lecturaMedidorAct;
    }

    public double getLecturaMedidorAnt() {
        return lecturaMedidorAnt;
    }

    public void setLecturaMedidorAnt(double lecturaMedidorAnt) {
        this.lecturaMedidorAnt = lecturaMedidorAnt;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual=consumoMensual;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    public void obtenerConsumoDiario() {
        consumoDiario = consumoMensual/30;
        System.out.println("Consumo Diario: "+fml2.format(consumoDiario) +" KWh");
    }
    public void obtenerConsumoM(double _lecturaMedidorAct, double _lecturaMedidorAnt, double _multiplicador){
        consumoMensual=(_lecturaMedidorAct - _lecturaMedidorAnt)* _multiplicador;
        System.out.println("Consumo mensual: "+fml2.format(consumoMensual)+" KWh");
    }
    public void obValorFactura() {
        valorFactura = consumoMensual*0.20;
        System.out.println("Valor factura: "+fml.format(valorFactura));
    }
    public static void main(String[] args) {
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        Ejer5FacturaElectrica fac= new Ejer5FacturaElectrica();
        try{
            System.out.println("Ingrese No de cuenta: ");
            String _numCuenta=leer.readLine();
            System.out.println("Ingrese la lectura del medidor anterior:");
            double _lecturaMedidorAnt=Double.parseDouble(leer.readLine());
            System.out.println("Ingrese la lectura del medidor actual:");
            double _lecturaMedidorAct=Double.parseDouble(leer.readLine());
            System.out.println("Multiplicador:");
            double _multiplicador=Double.parseDouble(leer.readLine());
        
            fac.setNumCuenta(_numCuenta);
            fac.setLecturaMedidorAnt(_lecturaMedidorAnt);
            fac.setLecturaMedidorAct(_lecturaMedidorAct);
            fac.setMultiplicador(_multiplicador);
            
            System.out.println("---IMPRIMIENDO---");
            System.out.println("No de Cuenta: "+fac.getNumCuenta());
            fac.obtenerConsumoM(_lecturaMedidorAct, _lecturaMedidorAnt, _multiplicador);
            fac.obtenerConsumoDiario();
            fac.obValorFactura();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
