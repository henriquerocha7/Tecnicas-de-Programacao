package lista2;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		int numero, multiplicador = 1;
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um número para fornecermos sua tabuada de multiplicar.");
			numero = entrada.nextInt();
			entrada.close();
			
			if (numero != 0) {
				while (multiplicador <= 10) {
					System.out.println(numero + "x" + multiplicador + "=" + (numero * multiplicador));
			multiplicador++;
				}		
			}
			
		
	}

}
