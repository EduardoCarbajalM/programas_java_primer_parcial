package Programas;

public class Programacion_Orientada_Objetos_3 {
    public static void main(String[] args) {
        Persona persona = new Persona("Eduardo", 20);
        System.out.println("Persona: " + persona);
        System.out.println("Tamaño del nombre en bits: " + calcularTamanoNombre(persona));
        System.out.println("Tamaño del nombre en bytes: " + calcularTamanoBytes(persona));
    }

    public static int calcularTamanoNombre(Persona persona) {
        return persona.getNombre().length() * Character.SIZE;
    }
    
    public static int calcularTamanoBytes(Persona persona) {
    	return calcularTamanoNombre(persona) / 8;
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
