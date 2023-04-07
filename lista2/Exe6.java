package lista2;
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de linhas da matriz:");
		int linhas = entrada.nextInt();
		entrada.close();
		
		System.out.println("Digite o número de colunas da matriz:");
		int colunas = entrada.nextInt();
		int[][] matriz = new int [linhas][colunas];			
		
		if (linhas != colunas) {
	    	System.out.println("A matriz não é quadrada, logo não pode ser simétrica.");
	    }else {
	    	
		System.out.println("Indique os elementos:");
		
		for (int a = 0; a < linhas; a++) {
			for (int b = 0; b < colunas; b++) {
				matriz[a][b] = entrada.nextInt();			
			}
		}
		    
		boolean resultado = true;
		
		for(int a = 0; a < linhas; a++) {
			for (int b = 0; b < colunas; b++) {
				if (matriz[a][b] != matriz[b][a]) {
					resultado = false;}
				else if (a == linhas -1 && b == colunas -1 && resultado) {
					System.out.println("A matriz é simétrica.");
					}
				}
			}
		if (resultado = false)
			System.out.println("A matriz não é simétrica.");
	    }
	}
}
