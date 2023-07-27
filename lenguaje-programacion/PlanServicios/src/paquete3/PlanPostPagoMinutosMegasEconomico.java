/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private Propietario propietario;
    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoGiga;
    private double porcentDesc;

    public PlanPostPagoMinutosMegasEconomico(Propietario p,
            double minutosS, double costoMin,
            double gigasInternet, double costG,
            double porcent) {

        propietario = p;
        minutos = minutosS;
        costoMinutos = costoMin;
        megasGigas = gigasInternet;
        costoGiga = costG;
        porcentDesc = porcent;
    }

    public void establecerPropietario(Propietario c) {
        propietario = c;
    }

    public void establecerMinutosSaldo(double n) {
        minutos = n;
    }

    public void establecerCostoMinutosSaldo(double n) {
        costoMinutos = n;
    }

    public void establecerGigasInternet(double n) {
        megasGigas = n;
    }

    public void establecerCostoGiga(double n) {
        costoGiga = n;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentDesc = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (megasGigas * costoGiga)
                - (((minutos * costoMinutos) + (megasGigas * costoGiga))
                * (porcentDesc / 100));
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerMinutosSaldo() {
        return minutos;
    }

    public double obtenerCostoMinutosSaldo() {
        return costoMinutos;
    }

    public double obtenerGigasInternet() {
        return megasGigas;
    }

    public double obtenerCostoGiga() {
        return costoGiga;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentDesc;
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MINUTOS MEGAS ECONOMICO\n"
                + "Minutos de saldo: %.2f\n"
                + "Costo por minuto: %.2f\n"
                + "Gigas de internet: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Porcentaje de descuento %.2f\n"
                + "Pago mensual: %.2f\n",
                minutos,
                costoMinutos,
                megasGigas,
                costoGiga,
                porcentDesc,
                pagoMensual);

        return reporte;
    }

}
