package dev.yeferson.persona_project;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anoNacimiento;
   
    public Persona(String nombre, String apellido, String numeroDocumento, int anoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anoNacimiento = anoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }   
    
    
}
