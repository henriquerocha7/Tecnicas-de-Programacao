package exe6;

public class Main {

	public static void main(String[] args) {
		
		Ingresso ingressos = new Ingresso (13.0, 10);
		IngressoVIP ingressosVIP = new IngressoVIP(13.0, 7.0, 14);
		
		System.out.println(ingressos);
		System.out.println(ingressosVIP);
		
		Evento evento = new Evento (ingressos, ingressosVIP);
		
		evento.vendaIngresso(4);
		evento.vendaIngressoVIP(3);
		evento.valorTotal();
		evento.ingressosRestantes();
		evento.ingressosVIPRestantes();
	}

}
