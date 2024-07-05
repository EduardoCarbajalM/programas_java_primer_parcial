package Programas;

public class Programacion_estructurada_2 {
    public static void main(String[] args) {
        int[] vector = new int[3];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;

        System.out.println("Vector: " + java.util.Arrays.toString(vector));
        System.out.println("Tamaño del vector en bits: " + calcularTamanoVector(vector));
        System.out.println("Tamaño del vector en bytes: " + calcularTamanoBytes(vector));
    }

    public static int calcularTamanoVector(int[] vector) {
        return vector.length * Integer.SIZE;
    }
    
    public static int calcularTamanoBytes(int[] vector) {
    	return calcularTamanoVector(vector) / 8;
	}
}
