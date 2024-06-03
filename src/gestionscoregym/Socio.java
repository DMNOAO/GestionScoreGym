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
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public CuentaSocio getCuentaSocio() {
        return cuentaSocio;
    }

    public void setCuentaSocio(CuentaSocio cuentaSocio) {
        this.cuentaSocio = cuentaSocio;
    }
    public bolean validarRut (String rut){
        if (rut.length() >=11 && rut.length() <=12){
            return true;
        } else {
            return false;
}

