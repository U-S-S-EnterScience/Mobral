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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1236, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlSlogan = new JPanel();
		pnlSlogan.setBackground(Color.decode("#334355"));
		pnlSlogan.setBounds(0, 0, 1227, 170);
		contentPane.add(pnlSlogan);
		pnlSlogan.setLayout(null);
		
		JPanel pnlLogo = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(
						TelaInicial.class.getResource("/imagens/MOBRAL_LOGO.png"));
				g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
			}
		};
		pnlLogo.setBounds(33, 0, 237, 170);
		pnlSlogan.add(pnlLogo);
		
		JLabel lblSlogan = new JLabel("Slogan aqui, qualquer frase que fa\u00E7a a empresa parecer muito legal!");
		lblSlogan.setForeground(Color.WHITE);
		lblSlogan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSlogan.setBounds(356, 123, 599, 36);
		pnlSlogan.add(lblSlogan);
		
		JLabel lblUsuario = new JLabel("usuario1234 | sair");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(1114, 11, 91, 33);
		pnlSlogan.add(lblUsuario);
		
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.setEnabled(false);
		btnAgenda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgenda.setBounds(147, 235, 250, 100);
		contentPane.add(btnAgenda);
		
		JButton btnSimulacao = new JButton("Simula\u00E7\u00E3o de Pre\u00E7o");
		btnSimulacao.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSimulacao.setBounds(147, 416, 250, 100);
		contentPane.add(btnSimulacao);
		
		JButton btnHistorico = new JButton("Hist\u00F3rico de Simula\u00E7\u00F5es");
		btnHistorico.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnHistorico.setBounds(512, 416, 250, 100);
		contentPane.add(btnHistorico);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setEnabled(false);
		btnClientes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClientes.setBounds(512, 235, 250, 100);
		contentPane.add(btnClientes);
		
		JButton btnConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btnConfiguracoes.setEnabled(false);
		btnConfiguracoes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConfiguracoes.setBounds(862, 416, 250, 100);
		contentPane.add(btnConfiguracoes);
		
		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setEnabled(false);
		btnRelatrios.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRelatrios.setBounds(862, 235, 250, 100);
		contentPane.add(btnRelatrios);
	}
}
