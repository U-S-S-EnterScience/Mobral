package projeto;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import javax.swing.ListSelectionModel;

public class App extends JFrame {

	public static String tipoNegociacao;
	private JPanel contentPane;
	private JTextField tfCondominio;
	private JTextField tfTamanho;
	private JLabel lblSuites;
	private JLabel lblElevador;
	private Imovel ap;
	private int elevador, piscina, mobiliado;
	private Previsor previsor;
	private JTable table;
	private boolean clique = false,check = false;
	ImovelDAO dao = new ImovelDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 730);
		setResizable(false);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(
						App.class.getResource("/files/Mobral_Background.png"));
				g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNegociacao = new JLabel("Tipo de Negocia\u00E7\u00E3o");
		lblNegociacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNegociacao.setBounds(114, 215, 250, 30);
		contentPane.add(lblNegociacao);
		
		JComboBox cbNegociacao = new JComboBox();
		cbNegociacao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbNegociacao.setModel(new DefaultComboBoxModel(new String[] {"Venda", "Aluguel"}));
		cbNegociacao.setBounds(114, 244, 120, 45);
		contentPane.add(cbNegociacao);
		
		JLabel lblCondominio = new JLabel("Condom\u00EDnio");
		lblCondominio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCondominio.setBounds(355, 215, 250, 30);
		contentPane.add(lblCondominio);
		
		tfCondominio = new JTextField();
		tfCondominio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfCondominio.setBounds(355, 244, 120, 45);
		contentPane.add(tfCondominio);
		tfCondominio.setColumns(10);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTamanho.setBounds(554, 215, 250, 30);
		contentPane.add(lblTamanho);
		
		tfTamanho = new JTextField();
		tfTamanho.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfTamanho.setColumns(10);
		tfTamanho.setBounds(554, 244, 120, 45);
		contentPane.add(tfTamanho);
		
		JLabel lblQuartos = new JLabel("Quartos");
		lblQuartos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuartos.setBounds(114, 313, 250, 30);
		contentPane.add(lblQuartos);
		
		JComboBox cbQuartos = new JComboBox();
		cbQuartos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbQuartos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cbQuartos.setBounds(114, 342, 120, 45);
		contentPane.add(cbQuartos);
		
		JLabel lblBanheiros = new JLabel("Banheiros");
		lblBanheiros.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBanheiros.setBounds(355, 312, 250, 30);
		contentPane.add(lblBanheiros);
		
		JComboBox cbBanheiros = new JComboBox();
		cbBanheiros.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbBanheiros.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		cbBanheiros.setBounds(355, 342, 120, 45);
		contentPane.add(cbBanheiros);
		
		lblSuites = new JLabel("Su\u00EDtes");
		lblSuites.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSuites.setBounds(554, 312, 250, 30);
		contentPane.add(lblSuites);
		
		JComboBox cbSuites = new JComboBox();
		cbSuites.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbSuites.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		cbSuites.setBounds(554, 342, 120, 45);
		contentPane.add(cbSuites);
		
		JLabel lblGaragem = new JLabel("Vagas na Garagem");
		lblGaragem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGaragem.setBounds(114, 407, 250, 30);
		contentPane.add(lblGaragem);
		
		JComboBox cbGaragem = new JComboBox();
		cbGaragem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbGaragem.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		cbGaragem.setBounds(114, 438, 120, 45);
		contentPane.add(cbGaragem);
		
		lblElevador = new JLabel("Elevador");
		lblElevador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElevador.setBounds(355, 407, 250, 30);
		contentPane.add(lblElevador);
		
		JComboBox cbElevador = new JComboBox();
		cbElevador.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbElevador.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sim"}));
		cbElevador.setBounds(355, 438, 120, 45);
		contentPane.add(cbElevador);
		
		JLabel lblPiscina = new JLabel("Piscina");
		lblPiscina.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPiscina.setBounds(554, 403, 250, 30);
		contentPane.add(lblPiscina);
		
		JComboBox cbPiscina = new JComboBox();
		cbPiscina.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbPiscina.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sim"}));
		cbPiscina.setBounds(554, 438, 120, 45);
		contentPane.add(cbPiscina);
		
		JLabel lblMobiliado = new JLabel("Mobiliado");
		lblMobiliado.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMobiliado.setBounds(114, 506, 250, 30);
		contentPane.add(lblMobiliado);
		
		JComboBox cbMobiliado = new JComboBox();
		cbMobiliado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbMobiliado.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sim"}));
		cbMobiliado.setBounds(114, 541, 120, 45);
		contentPane.add(cbMobiliado);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBairro.setBounds(350, 506, 250, 30);
		contentPane.add(lblBairro);
		
		JComboBox cbBairro = new JComboBox();
		cbBairro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbBairro.setModel(new DefaultComboBoxModel(new String[] {"Artur Alvim", "Belem", "Cangaiba", "Carrao", "Cidade Lider", "Cidade Tiradentes", "Ermelino Matarazzo", "Iguatemi", "Itaim Paulista", "Itaquera", "Jardim Helena", "Jose Bonifacio", "Lajeado", "Parque do Carmo", "Penha", "Ponte Rasa", "Sapopemba", "Sao Lucas", "Sao Mateus", "Sao Miguel", "Sao Rafael", "Tatuape", "Vila Curuca", "Vila Formosa", "Vila Jacui", "Vila Matilde", "Vila Prudente", "Cambuci", "Campo Belo", "Campo Grande", "Campo Limpo", "Capao Redondo", "Cidade Ademar", "Cidade Dutra", "Cursino", "Grajau", "Ipiranga", "Itaim Bibi", "Jabaquara", "Jardim Angela", "Jardim Paulista", "Moema", "Morumbi", "Pedreira", "Sacoma", "Santo Amaro", "Saude", "Socorro", "Vila Andrade", "Vila Mariana", "Vila Sonia", "Alto de Pinheiros", "Anhanguera", "Brasilandia", "Butanta", "Cachoeirinha", "Freguesia do O", "Jaguare", "Jaragua", "Lapa", "Limao", "Perdizes", "Pinheiros", "Pirituba", "Raposo Tavares", "Rio Pequeno", "Vila Leopoldina", "Barra Funda", "Bela Vista", "Bom Retiro", "Bras", "Consolacao", "Liberdade", "Pari", "Republica", "Santa Cecilia", "Se", "Casa Verde", "Jacana", "Mandaqui", "Santana", "Tremembe", "Tucuruvi", "Vila Guilherme", "Vila Maria", "Medeiros", "Agua Rasa", "Aricanduva", "Guaianazes", "Jardim Sao Luis", "Vila Madalena", "Mooca", "Brooklin", "Vila Olimpia"}));
		cbBairro.setBounds(350, 541, 324, 45);
		contentPane.add(cbBairro);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSimular.setBounds(210, 618, 135, 45);
		contentPane.add(btnSimular);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(446, 618, 135, 45);
		contentPane.add(btnSalvar);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setRowHeight(33);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setBounds(786, 244, 519, 398);
		contentPane.add(table);
		table.setVisible(false);
		
		btnSimular.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
				if(tfCondominio.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor preencher todos os campos!");
				}
				else if(tfTamanho.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor preencher todos os campos!");
				}
				else {
					if(cbElevador.getSelectedItem()=="Sim") elevador = 1;
					else elevador = 0;
					if(cbPiscina.getSelectedItem()=="Sim") elevador = 1;
					else piscina = 0;
					if(cbMobiliado.getSelectedItem()=="Sim") elevador = 1;
					else mobiliado = 0;
					
					ap = new Imovel(
							Double.parseDouble(tfCondominio.getText()),
							Integer.parseInt(tfTamanho.getText()),
							Integer.parseInt((String)cbQuartos.getSelectedItem()),
							Integer.parseInt((String)cbBanheiros.getSelectedItem()),
							Integer.parseInt((String)cbSuites.getSelectedItem()),
							Integer.parseInt((String)cbGaragem.getSelectedItem()),
							elevador, mobiliado, piscina,
							(String)cbBairro.getSelectedItem()
							);
					previsor = new Previsor();
					if(cbNegociacao.getSelectedItem()=="Venda") {
						ap.setPreco(previsor.calcularVenda(ap));
						tipoNegociacao = "Venda";
					}
					else {
						ap.setPreco(previsor.calcularAluguel(ap));
						tipoNegociacao = "Aluguel";
					}
					
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{"Tipo de Negocia\u00E7\u00E3o", " "+(String)cbNegociacao.getSelectedItem()},
								{"Condom\u00EDnio", " "+NumberFormat.getCurrencyInstance().format(Double.parseDouble(tfCondominio.getText()))},
								{"Tamanho", " "+(String)tfTamanho.getText()+" m²"},
								{"Quartos", " "+(String)cbQuartos.getSelectedItem()},
								{"Banheiros", " "+(String)cbBanheiros.getSelectedItem()},
								{"Su\u00EDtes", " "+(String)cbSuites.getSelectedItem()},
								{"Vagas na Garagem", " "+(String)cbGaragem.getSelectedItem()},
								{"Elevador", " "+(String)cbElevador.getSelectedItem()},
								{"Piscina", " "+(String)cbPiscina.getSelectedItem()},
								{"Mobiliado", " "+(String)cbMobiliado.getSelectedItem()},
								{"Bairro", " "+(String)cbBairro.getSelectedItem()},
								{"Valor", " "+NumberFormat.getCurrencyInstance().format(ap.getPreco())},
							},
							new String[] {
								"Labels", "Valores"
							}
						) {
							boolean[] columnEditables = new boolean[] {
								false, true
							};
							public boolean isCellEditable(int row, int column) {
								return columnEditables[column];
							}
						});
					table.getColumnModel().getColumn(0).setResizable(false);
					table.getColumnModel().getColumn(0).setPreferredWidth(20);
					table.setVisible(true);
					clique = true;
					
				}
			}
			catch(NumberFormatException erro) {
				try {
					if(Double.parseDouble(tfTamanho.getText()) % 1 != 0) {
						JOptionPane.showMessageDialog(null, "Favor digitar um número inteiro para o Tamanho!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Favor digitar somente valores numéricos!");
					}
				}
				catch(NumberFormatException erro2) {
					JOptionPane.showMessageDialog(null, "Favor digitar somente valores numéricos!");
				}
				check = true;
			}
	
		}
	});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(clique && check == false) {
					JOptionPane.showMessageDialog(null, dao.salvar(ap));
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Simule o preço antes de salvar!");
				}
			}
		});
	}
}
