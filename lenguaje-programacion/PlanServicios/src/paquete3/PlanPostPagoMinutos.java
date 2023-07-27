/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

public class PlanPostPagoMinutos extends PlanCelular {

    private Propietario propietario;
    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacionales;

    public PlanPostPagoMinutos(Propietario p,
            double minNacionales, double costoMinNacional,
            double minInternacional, double costoMinInternacional) {

        propietario = p;
        minutosNacionales = minNacionales;
        costoMinutoNacional = costoMinNacional;
        minutosInternacionales = minInternacional;
        costoMinutoInternacionales = costoMinInternacional;

    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Propietario c) {
        propietario = c;
    }
    
    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecerMinutosNacionales(double c) {
        minutosNacionales = c;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerCostoMinutoNacional(double c) {
        costoMinutoNacional = c;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerMinutosInternacionales(double c) {
        minutosInternacionales = c;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacionales;
    }

    public void establecerCostoMinutoInternacional(double c) {
        costoMinutoInternacionales = c;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacionales);
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MINUTOS\n\n%s"
                + "Minutos nacionales: %.2f\n"
                + "Costo minutos nacionales: %.2f\n"
                + "Minutos internacionales: %.2f\n"
                + "Costo minutos internacionales: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacionales,
                pagoMensual);

        return reporte;
    }

}
