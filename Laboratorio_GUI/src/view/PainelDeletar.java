package view;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class PainelDeletar extends JPanel {
	private static final long serialVersionUID = 7308096694456927217L;

	public PainelDeletar() {
		this.setBackground(Color.GRAY);
		this.setLayout(new GridLayout(8, 2));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label("Matricula:"));
		this.add(new JTextField());
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Button("Deletar"));
		this.setVisible(false);
	}
}
