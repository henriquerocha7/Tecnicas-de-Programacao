package view;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class PainelAtualizar extends JPanel {
	private static final long serialVersionUID = 3018596348923360946L;
	
	public PainelAtualizar() {
		this.setBackground(Color.GRAY);
		this.setLayout(new GridLayout(13, 2));
		this.add(new Label(" "));
		this.add(new Label(" "));
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
		this.add(new Label(" "));
		this.add(new Label(" "));
		this.add(new Button("Atualizar"));
		this.setVisible(false);
		
	}

}
