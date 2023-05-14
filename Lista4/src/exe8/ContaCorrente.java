package exe8;

public class ContaCorrente {

	protected int id;
	protected String cliente;
	protected float saldo;
	
	
	public ContaCorrente(int id, String cliente, float saldo) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String sacar(float valorASacar) {
		System.out.println(id +" - "+ cliente);
		if(valorASacar <= saldo) {
			saldo -= valorASacar;
			System.out.println("Saque efetuado com sucesso.");
		}else {
			System.out.println("Saldo insuficiente para o saque.");
		}
	return "Saldo restante: R$ " +saldo;
	}
}
