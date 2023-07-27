/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

public class PlanPostPagoMinutosMegas extends PlanCelular {

    private Propietario propietario;
    private double minutosSaldo;
    private double costoMinutosSaldo;
    private double gigasInternet;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(Propietario p, double minSaldo, double costoMinSaldo,
            double gigasInter, double costoGiga) {

        propietario = p;
        minutosSaldo = minSaldo;
        costoMinutosSaldo = costoMinSaldo;
        gigasInternet = gigasInter;
        costoGigas = costoGiga;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Propietario c) {
        propietario = c;
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
        String reporte = String.format("PLAN POST PAGO MINUTOS MEGAS\n"
                + "Minutos de saldo: %.2f\n"
                + "Costo por minuto: %.2f\n"
                + "Gigas de integer: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Pago mensual: %.2f\n",
                minutosSaldo,
                costoMinutosSaldo,
                gigasInternet,
                costoGigas,
                pagoMensual);

        return reporte;
    }

}
