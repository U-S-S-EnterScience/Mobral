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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aplicacao extends JFrame {

	public JPanel App, TelaSimulacao;
	public TelaInicial telaInicial = new TelaInicial();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacao frame = new Aplicacao();
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
	public Aplicacao() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setMaximumSize(new Dimension(1920, 1080));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 810); //1236, 661);
		App = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(
						Aplicacao.class.getResource("/files/Mobral_Background.png"));
				g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
			}
		};
		App.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(App);
		App.setLayout(null);
		App.add(telaInicial);

//===================================================================================================================================
		
		
		
//===================================================================================================================================
		/*//Tela Simulação
		TelaSimulacao = new JPanel();
		TelaSimulacao.setBounds(0, 270, 1920, 1080);
		TelaSimulacao.setMaximumSize(new Dimension(1920, 1080));
		TelaSimulacao.setLayout(null);
		App.add(TelaSimulacao);*/
		
		
	}
}
