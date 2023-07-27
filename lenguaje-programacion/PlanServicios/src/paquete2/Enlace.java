/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;
import paquete3.Propietario;

public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    // Primer Pago ---
    
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutos,"
                    + "costoMinutos,gigasInternet, costoGigas, porcentajeDescuento) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.obtenerPropietario().obtenerNombrePropietario(),
                    p.obtenerPropietario().obtenerApellidoPropietario(),
                    p.obtenerPropietario().obtenerPasaportePropietario(),
                    p.obtenerPropietario().obtenerCiudadPropietario(),
                    p.obtenerPropietario().obtenerBarrioPropietario(),
                    p.obtenerPropietario().obtenerMarcaCelular(),
                    p.obtenerPropietario().obtenerModeloCelular(),
                    p.obtenerPropietario().obtenerNumeroCelular(),
                    p.obtenerMinutosSaldo(),
                    p.obtenerCostoMinutosSaldo(),
                    p.obtenerGigasInternet(),
                    p.obtenerCostoGiga(),
                    p.obtenerPorcentajeDescuento());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    // Segundo Pago ---
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutos (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutosNacionales,"
                    + "costoMinutosNacionales, minutosInternacional, costoMinutosInternacional) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.obtenerPropietario().obtenerNombrePropietario(),
                    p.obtenerPropietario().obtenerApellidoPropietario(),
                    p.obtenerPropietario().obtenerPasaportePropietario(),
                    p.obtenerPropietario().obtenerCiudadPropietario(),
                    p.obtenerPropietario().obtenerBarrioPropietario(),
                    p.obtenerPropietario().obtenerMarcaCelular(),
                    p.obtenerPropietario().obtenerModeloCelular(),
                    p.obtenerPropietario().obtenerNumeroCelular(),
                    p.obtenerMinutosNacionales(),
                    p.obtenerCostoMinutoNacional(),
                    p.obtenerMinutosInternacionales(),
                    p.obtenerCostoMinutoInternacional());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    // Tercer Pago ---
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular, gigasInternet,"
                    + "costoGigasInternet, tarifaBase) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f')",
                    p.obtenerPropietario().obtenerNombrePropietario(),
                    p.obtenerPropietario().obtenerApellidoPropietario(),
                    p.obtenerPropietario().obtenerPasaportePropietario(),
                    p.obtenerPropietario().obtenerCiudadPropietario(),
                    p.obtenerPropietario().obtenerBarrioPropietario(),
                    p.obtenerPropietario().obtenerMarcaCelular(),
                    p.obtenerPropietario().obtenerModeloCelular(),
                    p.obtenerPropietario().obtenerNumeroCelular(),
                    p.obtenerGigasInternet(),
                    p.obtenerCostoGigasInternet(),
                    p.obtenerTarifaBase());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    // Cuarto Pago ---
    
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegas (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutosSaldo,"
                    + "costoMinutosSaldo,gigasInternet, costoGigas) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.obtenerPropietario().obtenerNombrePropietario(),
                    p.obtenerPropietario().obtenerApellidoPropietario(),
                    p.obtenerPropietario().obtenerPasaportePropietario(),
                    p.obtenerPropietario().obtenerCiudadPropietario(),
                    p.obtenerPropietario().obtenerBarrioPropietario(),
                    p.obtenerPropietario().obtenerMarcaCelular(),
                    p.obtenerPropietario().obtenerModeloCelular(),
                    p.obtenerPropietario().obtenerNumeroCelular(),
                    p.obtenerMinutosSaldo(),
                    p.obtenerCostoMinutosSaldo(),
                    p.obtenerGigasInternet(),
                    p.obtenerCostoGiga());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    // Viene de Primer pago

    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {

        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                Propietario p = new Propietario(rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));
                
                PlanPostPagoMinutosMegasEconomico pm3 = new PlanPostPagoMinutosMegasEconomico(
                        p,
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getDouble("gigasInternet"),
                        rs.getDouble("costoGigas"),
                        rs.getDouble("porcentajeDescuento"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegasEconomico");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    
    // Viene de Segundo Pago
    
    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {

        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                Propietario p = new Propietario(rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));
                
                PlanPostPagoMinutos pm3 = new PlanPostPagoMinutos(
                        p,
                        rs.getDouble("minutosNacionales"),
                        rs.getDouble("costoMinutosNacionales"),
                        rs.getDouble("minutosInternacional"),
                        rs.getDouble("costoMinutosInternacional"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutos");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    
    // Viene de Tercer Pago
    
    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {

        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                Propietario p = new Propietario(rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));
                
                PlanPostPagoMegas pm3 = new PlanPostPagoMegas(
                        p,
                        rs.getDouble("gigasInternet"),
                        rs.getDouble("costoGigasInternet"),
                        rs.getDouble("tarifaBase"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    
    // Viene de Cuarto Pago
    
    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {

        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                Propietario p = new Propietario(rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));
                
                PlanPostPagoMinutosMegas pm3 = new PlanPostPagoMinutosMegas(
                        p,
                        rs.getDouble("minutosSaldo"),
                        rs.getDouble("costoMinutosSaldo"),
                        rs.getDouble("gigasInternet"),
                        rs.getDouble("costoGigas"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}