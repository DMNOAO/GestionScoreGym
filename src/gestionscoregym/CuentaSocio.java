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

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(int totalPagado) {
        this.totalPagado = totalPagado;
    }

    public int getNumCuotasCanceladas() {
        return numCuotasCanceladas;
    }

    public void setNumCuotasCanceladas(int numCuotasCanceladas) {
        this.numCuotasCanceladas = numCuotasCanceladas;
    }

    public int getNumCuotasporCancelar() {
        return numCuotasporCancelar;
    }

    public void setNumCuotasporCancelar(int numCuotasporCancelar) {
        this.numCuotasporCancelar = numCuotasporCancelar;
    }

    @Override
    public String toString() {
        return "CuentaSocio{" + "numeroCuenta=" + numeroCuenta + ", totalPagado=" + totalPagado + ", numCuotasCanceladas=" + numCuotasCanceladas + ", numCuotasporCancelar=" + numCuotasporCancelar + '}';
    }
    
 
    

    
}
