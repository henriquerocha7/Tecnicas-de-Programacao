package view;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class PainelCadastrar extends JPanel {
	private static final long serialVersionUID = -6990480978765848800L;
	
	public PainelCadastrar () {
		this.setBackground(Color.GRAY);
		this.setLayout(new GridLayout(13, 2));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label("Nome:"));
		this.add(new JTextField());
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label("CPF:"));
		this.add(new JTextField());
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label("Matricula:"));
		this.add(new JTextField());
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label("Vertente:"));
		this.add(new JTextField());
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Button("Salvar"));
		this.setVisible(false);
		
	}

}
