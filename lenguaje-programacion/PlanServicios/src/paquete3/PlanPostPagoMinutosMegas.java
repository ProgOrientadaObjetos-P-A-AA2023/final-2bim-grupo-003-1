/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author Italo
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double minutosSaldo;
    private double costoMinutosSaldo;
    private double gigasInternet;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(String nombrePropietario, String apellidoPropietario,
            String pasaportePropietario, String ciudadPropietario,
            String barrioPropietario, String marcaCelular, 
            String modeloCelular, String numeroCelular, 
            double minSaldo, double costoMinSaldo,
            double gigasInter, double costoGiga) {
        
        super(nombrePropietario, apellidoPropietario, pasaportePropietario,
                ciudadPropietario, barrioPropietario, marcaCelular,
                modeloCelular, numeroCelular);
        
        minutosSaldo = minSaldo;
        costoMinutosSaldo = costoMinSaldo;
        gigasInternet = gigasInter;
        costoGigas = costoGiga;
    }

    public double obtenerMinutosSaldo() {
        return minutosSaldo;
    }

    public void establecerMinutosSaldo(double c) {
        minutosSaldo = c;
    }

    public double obtenerCostoMinutosSaldo() {
        return costoMinutosSaldo;
    }

    public void establecerCostoMinutosSaldo(double c) {
        costoMinutosSaldo = c;
    }

    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public void establecerGigasInternet(double c) {
        gigasInternet = c;
    }

    public double obtenerCostoGiga() {
        return costoGigas;
    }

    public void establecerCostoGiga(double c) {
        costoGigas = c;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosSaldo * costoMinutosSaldo) + (gigasInternet * costoGigas);
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MINUTOS MEGAS\n%s"
                + "Minutos de saldo: %.2f\n"
                + "Costo por minuto: %.2f\n"
                + "Gigas de integer: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Pago mensual: %.2f\n",
                super.toString(), 
                minutosSaldo, 
                costoMinutosSaldo, 
                gigasInternet, 
                costoGigas, 
                pagoMensual);
        
        return reporte;
    }

}
