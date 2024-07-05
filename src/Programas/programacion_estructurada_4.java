package Programas;

public class programacion_estructurada_4 {
	public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0] = new int[]{1, 2, 3};
        matriz[1] = new int[]{4, 5, 6};
        matriz[2] = new int[]{7, 8, 9};

        System.out.println("Matriz: ");
        for (int[] vector : matriz) {
            System.out.println(java.util.Arrays.toString(vector));
        }
    }
}