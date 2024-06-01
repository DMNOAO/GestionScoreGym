/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoregym;

/**
 *
 * @author nyxfem
 */
public class Socio {
    private String rut, nombre, apellidoPaterno, apellidoMaterno, correo, domicilio, region, ciudad, comuna;
    private int telefono;
    private CuentaSocio cuentaSocio;

    
    //constructores
    public Socio() {
    }

    public Socio(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String domicilio, String region, String ciudad, String comuna, int telefono, CuentaSocio cuentaSocio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.domicilio = domicilio;
        this.region = region;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuentaSocio = cuentaSocio;
    }
   
    //customer metodo
    public void pagarCuota(int monto){
        if(monto <= 0){
            System.out.println("ingrese un monto valido mayor a cero");
        }else{
           cuentaSocio.pagarCuota(monto); 
        }
    }
    
    public void consultarCuotas(){
        System.out.println("Número de cuotas pagadas: " + cuentaSocio.getNumCuotasCanceladas());
        System.out.println("Monto total pagado: " + cuentaSocio.getTotalPagado());       
    }
    
    public void verDatos(){
        System.out.println("*------Datos Socio-----*");
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Apellido Materno: " + apellidoMaterno);
        System.out.println("Correo: " + correo);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Región: " + region);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Número de cuenta: " + cuentaSocio.getNumeroCuenta());
        System.out.println("Total pagado: " + cuentaSocio.getTotalPagado());
        System.out.println("Número de cuotas canceladas: " + cuentaSocio.getNumCuotasCanceladas());
        System.out.println("Número de cuotas por cancelar: " + cuentaSocio.getNumCuotasporCancelar());
        
    }
}

