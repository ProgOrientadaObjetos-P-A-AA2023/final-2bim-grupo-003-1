package paquete3;

public abstract class PlanCelular {

    protected double pagoMensual;

    // Clase abstracta
    public abstract void calcularPagoMensual();

    public double obtenerPagoMesual() {
        return pagoMensual;
    }

}
