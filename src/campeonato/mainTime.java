package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class mainTime extends JFrame {

	private JPanel contentPane;
	public Jogador jogadorSelecionado;
	public Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//mainTime frame = new mainTime();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * A classe utiliza um objeto da classe Time com parâmetro para iniciação da Janela
	 */
	public mainTime(Time equipe) {
		this.equipe = equipe;
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adicão de componentes na Janela
		JLabel lblNewLabel = new JLabel("Menu Opções | TIME");
		lblNewLabel.setBounds(135, 11, 164, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha a Opção desejada");
		lblNewLabel_1.setBounds(10, 39, 164, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mostrar Elenco");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op1Time frame = new Op1Time(equipe); //Iniciação da janela que vai listar todos os objetos da classe Jogador que estão armazenados na coleção de jogadores do Time
				frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton.setBounds(10, 60, 200, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Configurar Elenco"); 
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Iniciação da janela que vai listar todos os objetos da classe Jogador que estão armazenados na coleção de jogadores do Time
				 * com possibilidade de habilitar a configuração em cada um
				 */
				Op2Time frame = new Op2Time(equipe);
				frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_1.setBounds(10, 86, 200, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Definir Formação");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Criação da janela de configuração da formação do time
				 */
				Op3Time frame = new Op3Time(equipe);
				frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_2.setBounds(10, 112, 200, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Adicionar Jogador");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op4Time frame = new Op4Time(equipe); //Criação da janela que torna possivel a criação de novo objeto da classe Jogador e adição na coleção
				frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_3.setBounds(10, 138, 200, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Remover Jogador");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op5Time frame = new Op5Time(equipe); //Criação da janela que possibilita a remoção de determinado jogador da coleção
				frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_4.setBounds(10, 164, 200, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JButton btnNewButton = new JButton("Voltar"); 
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	public Jogador getJogador() {
		return jogadorSelecionado;
	}
}
