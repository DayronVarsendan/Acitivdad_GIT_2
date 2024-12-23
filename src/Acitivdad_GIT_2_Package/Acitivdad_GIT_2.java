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
        
        
	    
	}

}
