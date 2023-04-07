package lista2;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		
		Scanner coluna = new Scanner(System.in);
		System.out.println("Digite o limite de unidades da coluna esquerda:");
		int limiteEsquerda = coluna.nextInt();
		
		System.out.println("Digite o limite de unidades da coluna direita:");
		int limiteDireita = coluna.nextInt();
		coluna.close();
		 
		 for (int esquerda = 0 ; esquerda <= limiteEsquerda; esquerda++) {
			 for (int direita = 0 ; direita <= limiteDireita; direita++) {
				 System.out.println(esquerda + "-" + direita);
			 }
		 }
			
		}
}
