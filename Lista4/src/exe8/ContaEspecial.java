package exe8;

public class ContaEspecial extends ContaCorrente {

	public float limiteDeCredito;
	
	public ContaEspecial(int id, String cliente, float saldo, float limiteDeCredito) {
		super(id, cliente, saldo);
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public String sacar (float valorASacar) {
		System.out.println(id +" - "+ cliente);
		if(valorASacar <= limiteDeCredito) {
			saldo -= valorASacar;
			System.out.println("Saque efetuado com sucesso.");
		}else {
			System.out.println("Limite indisponível.");
		}
	return "Saldo restante: R$ " +saldo;
	}


}
