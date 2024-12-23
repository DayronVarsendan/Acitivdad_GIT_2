package Acitivdad_GIT_2_Package;


import java.util.Random;
import java.util.Scanner;



public class Acitivdad_GIT_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int[][] matriz = new int[5][5];
	    Random random = new Random();
	    
	    for (int i = 0; i < 5; i++) {
	    	
            for (int j = 0; j < 5; j++) {
            	
            matriz[i][j] = random.nextInt(100) + 1;
        }
        }
	    
	    
	    System.out.println("Matriz generada:");
	    
        for (int i = 0; i < 5; i++) {
        	
            for (int j = 0; j < 5; j++) {
            	
                System.out.print(matriz[i][j] + "\t");
	    
            }
        }
        
        
	    

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
