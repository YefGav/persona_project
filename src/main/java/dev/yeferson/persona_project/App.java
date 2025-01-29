package dev.yeferson.persona_project;

public final class App {
    private App() {
    }
    public static void main(String[] args) {

        Persona persona1 = new Persona ("Yeferson", "Gaviria", "7236255g", 1990);
       
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Numero de documento: " + persona1.getNumeroDocumento());
        System.out.println("Ano de nacimiento: " + persona1.getAnoNacimiento());

       
    }
}
