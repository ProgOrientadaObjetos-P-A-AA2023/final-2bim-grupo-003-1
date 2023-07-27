package paquete3;

public class PlanPostPagoMegas extends PlanCelular {

    private double gigasInternet;
    private double costoGigasInternet;
    private double tarifaBase;

    public PlanPostPagoMegas(String nombrePropietario, String apellidoPropietario,
            String pasaportePropietario, String ciudadPropietario,
            String barrioPropietario, String marcaCelular,
            String modeloCelular, String numeroCelular,
            double megasInterG, double costoGigasInter, double tarifaB) {

        super(nombrePropietario, apellidoPropietario, pasaportePropietario,
                ciudadPropietario, barrioPropietario, marcaCelular,
                modeloCelular, numeroCelular);

        gigasInternet = megasInterG;
        costoGigasInternet = costoGigasInter;
        tarifaBase = tarifaB;
    }

    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public void establecerGigasInternet(double c) {
        gigasInternet = c;
    }

    public double obtenerCostoGigasInternet() {
        return costoGigasInternet;
    }

    public void establecerCostoGigasInternet(double c) {
        costoGigasInternet = c;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double c) {
        tarifaBase = c;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (costoGigasInternet * (gigasInternet / 1000)) + tarifaBase;
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MEGAS\n%s"
                + "Gigas de internet: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago mensual: %.2f\n",
                super.toString(), 
                gigasInternet, 
                costoGigasInternet, 
                tarifaBase, 
                pagoMensual);
        return reporte;
    }

}
