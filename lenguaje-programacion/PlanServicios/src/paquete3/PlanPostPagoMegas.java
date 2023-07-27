package paquete3;

public class PlanPostPagoMegas extends PlanCelular {

    private Propietario propietario;
    private double gigasInternet;
    private double costoGigasInternet;
    private double tarifaBase;

    public PlanPostPagoMegas(Propietario p, double megasInterG,
            double costoGigasInter, double tarifaB) {

        propietario = p;
        gigasInternet = megasInterG;
        costoGigasInternet = costoGigasInter;
        tarifaBase = tarifaB;
    }

    public void establecerPropietario(Propietario c) {
        propietario = c;
    }

    public void establecerGigasInternet(double c) {
        gigasInternet = c;
    }

    public void establecerCostoGigasInternet(double c) {
        costoGigasInternet = c;
    }

    public void establecerTarifaBase(double c) {
        tarifaBase = c;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (costoGigasInternet * (gigasInternet / 1000)) + tarifaBase;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public double obtenerCostoGigasInternet() {
        return costoGigasInternet;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
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
