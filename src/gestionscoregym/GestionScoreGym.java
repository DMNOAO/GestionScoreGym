/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionscoregym;

/**
 *
 * @author nyxfem
 */
public class GestionScoreGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio socio = new socio("19.273.177-0", "Jorge", "Ibacache", "Aravena", "piedraeterna@gmail.com", "los alerces 233", "Biobio", "Arauco", 947114043);
        
        while (true) {

            System.out.println("Menú:");
            System.out.println("1. Registrar Socio");
            System.out.println("2. Ver datos del Socio");
            System.out.println("3. Pagar Cuota del Socio");
            System.out.println("4. Consultar Número de Cuotas por Cancelar");
            System.out.println("5. Consultar Monto Total de Cuotas canceladas del Socio");
            System.out.println("6. Salir del Programa");
    }
    
}
