/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionscoregym;
import gestionscoregym.Socio;
import java.util.Scanner;
import java.util.Random;
import gestionscoregym.CuentaSocio;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author nyxfem
 */
public class GestionScoreGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        List <Socio> listaSocios = new ArrayList <>();
        while (true) {

            System.out.println("Menú:");
            System.out.println("1. Registrar Socio");
            System.out.println("2. Ver datos del Socio");
            System.out.println("3. Pagar Cuota del Socio");
            System.out.println("4. Consultar número de cuotas por cancelar");
            System.out.println("5. Consultar monto total de cuotas canceladas del Socio");
            System.out.println("6. Salir del Programa");
            System.out.println("Indique su opción:");
            int opcion = teclado.nextInt();
            if (opcion == 1){
                System.out.println("Rellene los datos para el registro.");
                int numeroCuenta = 100000000 + random.nextInt(900000000);
                int totalPagado = 5000 + random.nextInt(100000);
                int numCuotasCanceladas = random.nextInt(12);
                int numCuotasporCancelar = 12 - numCuotasCanceladas;
                CuentaSocio cuenta_socio = new CuentaSocio(numeroCuenta, totalPagado, numCuotasCanceladas, numCuotasporCancelar);
                System.out.println("Rut:"); 
                String rut = teclado.next();
                if (rut.length()>10 && rut.length()<13){
                }
                else{
                    System.out.println("Rut no válido.");
                    break;
                }
                System.out.println("Nombre:");
                String nombre = teclado.next();
                System.out.println("Apellido paterno:");
                String apellidoPaterno = teclado.next();
                System.out.println("Apellido materno:");
                String apellidoMaterno = teclado.next();
                System.out.println("Correo: ");
                String correo = teclado.next();
                System.out.println("Domicilio: ");
                String domicilio = teclado.next();
                System.out.println("Región: ");
                String region = teclado.next();
                System.out.println("Ciudad: ");
                String ciudad = teclado.next();
                System.out.println("Comuna: ");
                String comuna = teclado.next();
                System.out.println("Teléfono: ");
                int telefono = teclado.nextInt();
                Socio socio1 = new Socio (rut, nombre, apellidoPaterno, apellidoMaterno, correo, domicilio, region, ciudad, comuna, telefono, cuenta_socio);
                System.out.println("== Socio registrado ==");
                listaSocios.add(socio1);
               
            }
            else if (opcion == 2){
                listaSocios.get(0).verDatos();
            }
            else if (opcion == 3){
                System.out.println("Indique monto de cuota a cancelar:");
                int montoCuota = teclado.nextInt();
                listaSocios.get(0).getCuentaSocio().sumarTotalPagado(montoCuota);
                System.out.println("¡Pago realizado de manera exitosa!");
                
                
            }
            else if (opcion == 4){
                System.out.println("Número de cuotas por cancelar: " + listaSocios.get(0).getCuentaSocio().getNumCuotasporCancelar());
                
            }
            else if (opcion == 5){
                System.out.println("Cuotas canceladas:" + listaSocios.get(0).getCuentaSocio().getNumCuotasCanceladas());
                System.out.println("Monto total cancelado" + listaSocios.get(0).getCuentaSocio().getTotalPagado());
            }
            else if (opcion == 6){
                System.out.println("¡Hasta pronto!");
                break;
            }
            else{
                System.out.println("Indique una opción válida.");
            }
    }
    
}}
