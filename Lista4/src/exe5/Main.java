package exe5;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato (7777, "Carlos", "carlos77@java.com", 994999995);
		
		System.out.println(contato.getEmail());
		System.out.println(contato.getTelefone());
		contato.setEndereco("massape");
		contato.setObservacao("Me deve");
		
		
		
		System.out.println(contato.imprimirInformacoes());
	}



}



    //desisto