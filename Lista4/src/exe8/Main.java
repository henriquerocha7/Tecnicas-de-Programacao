package exe8;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(5455, "Carlos", 870);
		ContaEspecial ce = new ContaEspecial(5822, "Rafael", 200, 550);

		System.out.println(cc.sacar(1000));
		System.out.println(ce.sacar(300));
		
	}

}
