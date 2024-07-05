package Programas;

public class programacion_orientada_objetos_5 {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Eduardo", 20);
        personas[1] = new Persona("Ana", 25);
        personas[2] = new Persona("Carlos", 30);

        System.out.println("Personas: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}