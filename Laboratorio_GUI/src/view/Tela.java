package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela extends JFrame {
	private static final long serialVersionUID = 7163765538988263870L;
	
	Paineis paineis;
	
	public Tela () {
		
		JButton cadastrar = new JButton("Cadastrar");
		botoes(cadastrar);
		JButton listar = new JButton("Listar");
		botoes(listar);
		JButton atualizar = new JButton("Atualizar");
		botoes(atualizar);
		JButton deletar = new JButton("Deletar");
		botoes(deletar);
		
		this.setSize(600, 400);

		
		this.setTitle("Laboratório");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);	
		this.setLocationRelativeTo(null);
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.BLACK);
		painel.add(cadastrar);
		cadastrar.addActionListener(new Cadastro());
		painel.add(listar);
		listar.addActionListener(new Listar());
		painel.add(atualizar);
		atualizar.addActionListener(new Atualizar());
		painel.add(deletar);
		deletar.addActionListener(new Deletar());
		
		paineis = new Paineis();
		
		this.add(painel, BorderLayout.NORTH);
		this.add(paineis, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public JButton botoes(JButton b) {
		JButton botoes = new JButton();
		botoes.setBackground(Color.WHITE);
		b = botoes;
		return b;
	}
	
	public class Cadastro implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			paineis.cadastro.setVisible(true);
			paineis.pListar.setVisible(false);
			paineis.pAtualizar.setVisible(false);
			paineis.pDeletar.setVisible(false);
	  }
	}
	
	public class Listar implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			paineis.cadastro.setVisible(false);
			paineis.pListar.setVisible(true);
			paineis.pAtualizar.setVisible(false);
			paineis.pDeletar.setVisible(false);
		}
	}
	
	public class Atualizar implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			paineis.cadastro.setVisible(false);
			paineis.pListar.setVisible(false);
			paineis.pAtualizar.setVisible(true);
			paineis.pDeletar.setVisible(false);
		}
	}
	
	public class Deletar implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			paineis.cadastro.setVisible(false);
			paineis.pListar.setVisible(false);
			paineis.pAtualizar.setVisible(false);
			paineis.pDeletar.setVisible(true);
		}
	}
	
}
