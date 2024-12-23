package Acitivdad_GIT_2_Package;

import java.util.Scanner;

public class Acitivdad_GIT_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();
        
        boolean encontrado = false;

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    
                    System.out.println("Número encontrado en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    encontrado = true; 
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz.");
        }
        
	}

}
