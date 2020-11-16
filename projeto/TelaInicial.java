package projeto;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TelaInicial extends JPanel {

	public JPanel telaInicial;
	
	public TelaInicial() {
		
	//Tela Inicial
		telaInicial = new JPanel();
		telaInicial.setBounds(0, 270, 1920, 810);
		telaInicial.setMaximumSize(new Dimension(1920, 810));
		telaInicial.setLayout(null);
		telaInicial.setVisible(true);
		
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.setEnabled(false);
		btnAgenda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgenda.setBounds(308, 165, 333, 155);
		telaInicial.add(btnAgenda);
		
		JButton btnSimulacao = new JButton("Simula\u00E7\u00E3o de Pre\u00E7o");
		btnSimulacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaInicial.setVisible(false);
				//Aplicacao.TelaSimulacao.setVisible(true);
			}
		});
		btnSimulacao.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSimulacao.setBounds(308, 484, 333, 155);
		telaInicial.add(btnSimulacao);
		
		JButton btnHistorico = new JButton("Hist\u00F3rico de Simula\u00E7\u00F5es");
		btnHistorico.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnHistorico.setBounds(784, 484, 333, 155);
		telaInicial.add(btnHistorico);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setEnabled(false);
		btnClientes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClientes.setBounds(784, 165, 333, 155);
		telaInicial.add(btnClientes);
		
		JButton btnConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btnConfiguracoes.setEnabled(false);
		btnConfiguracoes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConfiguracoes.setBounds(1261, 484, 333, 155);
		telaInicial.add(btnConfiguracoes);
		
		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setEnabled(false);
		btnRelatrios.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRelatrios.setBounds(1261, 165, 333, 155);
		telaInicial.add(btnRelatrios);
	}
}
