package exe6;

public class Evento {

	private Ingresso lista[];
	private double valorTotal;
	
	public Evento (Ingresso ingresso, IngressoVIP ingressoVIP) {
		lista = new Ingresso[2];
		lista[0] = ingresso;
		lista[1] = ingressoVIP;
		valorTotal = 0;
	}
	
	public void vendaIngresso(int quantidadeComprada) {
		if(quantidadeComprada <= lista[0].quantidade) {
			lista[0].quantidade = lista[0].quantidade - quantidadeComprada;
		valorTotal += lista[0].valor * quantidadeComprada;
			System.out.println(quantidadeComprada + " Ingressos comprados.");
	   } else {
		   System.out.println("Ingressos insuficientes.");
	   }
	} 
	
	public void vendaIngressoVIP (int quantidadeComprada1) {
		if (lista[1].quantidade >= quantidadeComprada1) {
			lista[1].quantidade = lista[1].quantidade - quantidadeComprada1;
		valorTotal += lista[1].valor * quantidadeComprada1;
			System.out.println(quantidadeComprada1 + " Ingressos VIP comprados.");
		}else {
			System.out.println("Ingressos VIP insuficientes.");
		}
	}
	
	public void valorTotal () {
		System.out.println("O valor total dos ingressos é: R$ " + valorTotal);
	}
	
	public void ingressosRestantes () {
		System.out.println( lista[0].quantidade + " Ingressos restantes.");
	}
	 
	public void ingressosVIPRestantes () {
		System.out.println(lista[1].quantidade + " Ingressos VIP restantes.");
	}
	
}
