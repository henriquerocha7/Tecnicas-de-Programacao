package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela extends JFrame {
	private static final long serialVersionUID = 7163765538988263870L;
	
	PainelCadastrar cadastro;
	PainelListar pListar;
	PainelAtualizar pAtualizar;
	PainelDeletar pDeletar;
	
	
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
		this.setLayout(new BorderLayout());
		
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
		
		cadastro = new PainelCadastrar();
		pListar = new PainelListar();
		pAtualizar = new PainelAtualizar();
		pDeletar = new PainelDeletar();

		
		this.add(painel, BorderLayout.NORTH);
		this.add(cadastro);
		this.add(pListar);
		this.add(pAtualizar);
		this.add(pDeletar);
		
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
			cadastro.setVisible(true);
			pListar.setVisible(false);
			pAtualizar.setVisible(false);
			pDeletar.setVisible(false);
	  }
	}
	
	public class Listar implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			cadastro.setVisible(false);
			pListar.setVisible(true);
			pAtualizar.setVisible(false);
			pDeletar.setVisible(false);
		}
	}
	
	public class Atualizar implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			cadastro.setVisible(false);
			pListar.setVisible(false);
			pAtualizar.setVisible(true);
			pDeletar.setVisible(false);
		}
	}
	
	public class Deletar implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			cadastro.setVisible(false);
			pListar.setVisible(false);
			pAtualizar.setVisible(false);
			pDeletar.setVisible(true);
		}
	}
	
}
