package paquete3;

public abstract class PlanCelular {

    protected String nombrePropietario;
    protected String apellidoPropietario;
    protected String pasaportePropietario;
    protected String ciudadPropietario;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String nombre, String apellido, 
            String pasaporte, String ciudad, 
            String barrio, String marcaC, 
            String modeloC, String numCelular) {
        nombrePropietario = nombre;
        apellidoPropietario = apellido;
        pasaportePropietario = pasaporte;
        ciudadPropietario = ciudad;
        barrioPropietario = barrio;
        marcaCelular = marcaC;
        modeloCelular = modeloC;
        numeroCelular = numCelular;
    }

    public void establecerNombrePropietario(String n) {
        nombrePropietario = n;
    }

    public void establecerApellidoPropietario(String a) {
        apellidoPropietario = a;
    }

    public void establecerPasaportePropietario(String c) {
        pasaportePropietario = c;
    }

    public void establecerCiudadPropietario(String cd) {
        ciudadPropietario = cd;
    }

    public void establecerBarrioPropietario(String b) {
        barrioPropietario = b;
    }

    public void establecerMarcaCelular(String m) {
        marcaCelular = m;
    }

    public void establecerModeloCelular(String mc) {
        modeloCelular = mc;
    }

    public void establecerNumeroCelular(String n) {
        numeroCelular = n;
    }
    
    // Clase abstracta

    public abstract void calcularPagoMensual();

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerApellidoPropietario() {
        return apellidoPropietario;
    }

    public String obtenerPasaportePropietario() {
        return pasaportePropietario;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }

    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMesual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre del propietario: %s\n"
                + "Apellido del propietario%s\n"
                + "Pasaporte del propietario: %s\n"
                + "Ciudad del propietario: %s\n"
                + "Barrio del propietario: %s\n"
                + "Marca celular: %s\n"
                + "Modelo celular: %s\n"
                + "Número de celular: %s\n",
                nombrePropietario,
                apellidoPropietario,
                pasaportePropietario,
                ciudadPropietario,
                barrioPropietario,
                marcaCelular,
                modeloCelular,
                numeroCelular);

        return reporte;
    }
}
