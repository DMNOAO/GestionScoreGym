/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoregym;

/**
 *
 * @author nyxfem
 */
public class CuentaSocio {
    private int numeroCuenta, totalPagado, numCuotasCanceladas, numCuotasporCancelar;
    
    //constructores sin y con parametros
    public CuentaSocio(int numeroCuenta, int totalPagado, int numCuotasCanceladas, int numCuotasporCancelar) {
        this.numeroCuenta = 0;
        this.totalPagado = 0;
        this.numCuotasCanceladas = 0;
        this.numCuotasporCancelar = 0;
    }

    public CuentaSocio(int numeroCuenta) {
        if(numeroCuenta >= 1 && numeroCuenta <= 9){
            this.numeroCuenta = numeroCuenta;
        }
    }
    
    //getter  accesadores 
        public int getTotalPagado() {
        return totalPagado;
    }


    public int getNumCuotasCanceladas() {
        return numCuotasCanceladas;
    }


    public int getNumCuotasporCancelar() {
        return numCuotasporCancelar;
    }
    
    
    //customer metodos
    public void pagarCuotas(int monto){
        totalPagado += monto;
        numCuotasCanceladas++;
    }
    
   
    

    
}
