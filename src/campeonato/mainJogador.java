package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class mainJogador extends JFrame {


	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Jogador player;
	public Jogador jogadorSelecionado; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//mainJogador frame = new mainJogador(); // Jogar na classe mainTime
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * A classe utiliza um objeto da classe Jogador como parametro para iniciação da Janela
	 * 
	 */
	public mainJogador(Jogador player) {
		this.player = player;
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Adição de componentes na janela
		JLabel lblNewLabel = new JLabel("Menu Jogador");
		lblNewLabel.setBounds(200, 11, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEscolhaAOpo = new JLabel("Escolha a Opção Desejada");
		lblEscolhaAOpo.setBounds(10, 37, 209, 14);
		contentPane.add(lblEscolhaAOpo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mostrar Dados do Jogador");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Op1Jogador frame = new Op1Jogador(player); //Criação da Janela que vai mostrar os dados do Jogador
				frame.setVisible(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 58, 209, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Alterar Dados");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2Jogador frame = new Op2Jogador(player); //Criação da Janela que vai alterar os dados do jogador
				frame.setVisible(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 84, 209, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Vender Jogador"); //Pendente de implementação
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 110, 209, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //Ao acionar o botão, na execução dessa janela, a mesma irá fechar e retornar para a tela principal de configuração do time. 
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
