package view;
import java.awt.Color;
import javax.swing.*;

public class Paineis extends JPanel {
	private static final long serialVersionUID = 9086117418734227354L;

	PainelCadastrar cadastro;
	PainelListar pListar;
	PainelAtualizar pAtualizar;
	PainelDeletar pDeletar;
	
	public Paineis () {
		
		this.setBackground(Color.GRAY);
		
		cadastro = new PainelCadastrar();
		pListar = new PainelListar();
		pAtualizar = new PainelAtualizar();
		pDeletar = new PainelDeletar();
		
		this.add(cadastro);
		this.add(pListar);
		this.add(pAtualizar);
		this.add(pDeletar);
		
		this.setVisible(true);
	}
}
