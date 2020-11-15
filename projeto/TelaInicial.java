package projeto;

import java.awt.BorderLayout;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Frame;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setMaximumSize(new Dimension(1920, 1080));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080); //1236, 661);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(
						TelaInicial.class.getResource("/imagens/background.png"));
				g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.setEnabled(false);
		btnAgenda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgenda.setBounds(308, 435, 333, 155);
		contentPane.add(btnAgenda);
		
		JButton btnSimulacao = new JButton("Simula\u00E7\u00E3o de Pre\u00E7o");
		btnSimulacao.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSimulacao.setBounds(308, 754, 333, 155);
		contentPane.add(btnSimulacao);
		
		JButton btnHistorico = new JButton("Hist\u00F3rico de Simula\u00E7\u00F5es");
		btnHistorico.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnHistorico.setBounds(784, 754, 333, 155);
		contentPane.add(btnHistorico);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setEnabled(false);
		btnClientes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClientes.setBounds(784, 435, 333, 155);
		contentPane.add(btnClientes);
		
		JButton btnConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btnConfiguracoes.setEnabled(false);
		btnConfiguracoes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConfiguracoes.setBounds(1261, 754, 333, 155);
		contentPane.add(btnConfiguracoes);
		
		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setEnabled(false);
		btnRelatrios.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRelatrios.setBounds(1261, 435, 333, 155);
		contentPane.add(btnRelatrios);
	}
}
