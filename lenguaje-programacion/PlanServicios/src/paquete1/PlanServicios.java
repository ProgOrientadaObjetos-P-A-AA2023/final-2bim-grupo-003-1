package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Enlace;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author ASUS
 */
public class PlanServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int op = 1, op2;
        String nombre, apellido, pasaporte, barrio, ciudad, marca, modelo, numeroCelular;
        do {
            System.out.printf("-------------------------------------------\n"
                    + "Ingresar PLAN CELULAR                   [1]\n"
                    + "Mostrar tipos de planes                 [2]\n"
                    + "Salir                                   [0]\n"
                    + "-------------------------------------------\n");
            op = sc.nextInt();

            System.out.println("-------------------------------------------");
            if (op == 1) {
                do {

                    op2 = menu();
                    sc.nextLine();
                    System.out.println("DATOS - PROPIETARIO");
                    System.out.print("\tIngrese el nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("\tIngrese el apellido: ");
                    apellido = sc.nextLine();
                    System.out.print("\tIngrese el pasaporte: ");
                    pasaporte = sc.nextLine();
                    System.out.print("\tIngrese la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("\tIngrese el barrio: ");
                    barrio = sc.nextLine();
                    System.out.print("\tIngrese la marca del celular: ");
                    marca = sc.next();
                    
                    sc.nextLine();
                    
                    System.out.print("\tIngrese el modelo del celular: ");
                    modelo = sc.nextLine();
   
                    System.out.print("\tIngrese el número del celular: ");
                    numeroCelular = sc.nextLine();

                    switch (op2) {

                        case 1:
                            System.out.print("Ingrese el  numero de minutos de saldo: ");
                            double minutosSaldo2 = sc.nextDouble();
                            System.out.print("Ingrese el costo de minutos de saldo: ");
                            double costoMinutoSaldo2 = sc.nextDouble();
                            System.out.print("Ingrese el número de Gigas de internet: ");
                            double gigaInternet3 = sc.nextDouble();
                            System.out.print("Ingrese el costo de la giga de internet: ");
                            double costoGiga3 = sc.nextDouble();
                            System.out.print("Ingrese el porcentaje de descuento: ");
                            double porcentaje = sc.nextDouble();
                            PlanPostPagoMinutosMegasEconomico pppmme = new PlanPostPagoMinutosMegasEconomico(
                                    nombre, apellido,
                                    pasaporte, ciudad,
                                    barrio, marca,
                                    modelo, numeroCelular,
                                    minutosSaldo2, costoMinutoSaldo2,
                                    gigaInternet3, costoGiga3,
                                    porcentaje);

                            c.insertarPlanPostPagoMinutosMegasEconomico(pppmme);
                            break;

                        case 2:
                            System.out.print("Ingrese el número de minutos Nacionales: ");
                            double minutosNacionales = sc.nextDouble();
                            System.out.print("Ingrese el costo de minuto Nacional: ");
                            double costoMinutoNacional = sc.nextDouble();
                            System.out.print("Ingrese el número de minutos Internacionales: ");
                            double minutosInternacionales = sc.nextDouble();
                            System.out.print("Ingrese el costo de minuto Internacional: ");
                            double costoMinutoInternacional = sc.nextDouble();

                            PlanPostPagoMinutos pppm = new PlanPostPagoMinutos(nombre, apellido,
                                    pasaporte, ciudad,
                                    barrio, marca,
                                    modelo, numeroCelular,
                                    minutosNacionales, costoMinutoNacional,
                                    minutosInternacionales, costoMinutoInternacional);

                            c.insertarPlanPostPagoMinutos(pppm);
                            break;
                        case 3:

                            System.out.print("Ingrese el número de Megas de internet: ");
                            double gigaInternet = sc.nextDouble();
                            System.out.print("Ingrese el costo de la Giga de internet: ");
                            double costoGiga = sc.nextDouble();
                            System.out.print("Ingrese el valor de la tarifa base: ");
                            double tarifaBase = sc.nextDouble();
                            PlanPostPagoMegas pppg = new PlanPostPagoMegas(nombre,
                                    apellido, pasaporte,
                                    barrio, ciudad,
                                    marca, modelo,
                                    numeroCelular, gigaInternet,
                                    costoGiga, tarifaBase);

                            c.insertarPlanPostPagoMegas(pppg);
                            break;

                        case 4:
                            System.out.print("Ingrese numero de minuto de de saldo: ");
                            double minutosSaldo = sc.nextDouble();
                            System.out.print("Ingrese el costo de minuto de saldo: ");
                            double costoMinutoSaldo = sc.nextDouble();
                            System.out.print("Ingrese el número de Gigas de internet: ");
                            double gigaInternet2 = sc.nextDouble();
                            System.out.print("Ingrese el costo de la giga de internet: ");
                            double costoGiga2 = sc.nextDouble();
                            PlanPostPagoMinutosMegas ppmg = new PlanPostPagoMinutosMegas(
                                    nombre, apellido,
                                    pasaporte, ciudad,
                                    barrio, marca,
                                    modelo, numeroCelular,
                                    minutosSaldo, costoMinutoSaldo,
                                    gigaInternet2, costoGiga2);

                            c.insertarPlanPostPagoMinutosMegas(ppmg);
                            break;

                        default:
                            break;
                    }

                    System.out.printf("-------------------------------------------\n"
                            + "¿Desea agregar otro plan?\n"
                            + "\tSi     [1]\n"
                            + "\tNo     [0]\n"
                            + "-------------------------------------------\n");
                    op2 = sc.nextInt();
                    System.out.println("-------------------------------------------");
                } while (op2 != 0);
            }
            if (op == 2) {
                int op3 = menu2();
                switch (op3) {
                    case 1:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutos().get(i));
                        }
                        break;
                    case 3:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        break;

                    case 5:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutos().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    default:
                        break;
                }
            }
        } while (op != 0);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("SELECIONE EL TIPO DE PLAN QUE DESEE INGRESAR\n"
                + "--------------------------------------------\n"
                + "Plan post pago minutos megas economico    [1]\n"
                + "Plan post pago minutos                    [2]\n"
                + "Plan post pago megas                      [3]\n"
                + "Plan post pago minutos megas              [4]\n"
                + "--------------------------------------------\n");
        int op = sc.nextInt();
        System.out.println("-------------------------------------------");
        return op;
    }

    public static int menu2() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("SELECIONE EL TIPO DE PLAN que desee visualizar\n"
                + "--------------------------------------------\n"
                + "Plan post pago minutos megas economico    [1]\n"
                + "Plan post pago minutos                    [2]\n"
                + "Plan post pago megas                      [3]\n"
                + "Plan post pago minutos megas              [4]\n"
                + "TODOS                                     [5]\n"
                + "--------------------------------------------\n");
        int op = sc.nextInt();
        System.out.println("-------------------------------------------");
        return op;
    }
}
