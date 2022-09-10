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

@SuppressWarnings("serial")
public class Op2Jogador extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Jogador player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op2Jogador frame = new Op2Jogador();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe utiliza como parametro um objeto da classe Jogador
	 * Essa janela cria uma janela que é acionada a partir da seleção da opção "Alterar dados do Jogador" na tela principal da opção
	 * de configuração no time.
	 * Essa janela conta com alguns RadioButton, no qual a medida que são selecionados, aciona uma janela de mudança de dados especifica.
	 */
	public Op2Jogador(Jogador player) {
		this.player = player;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblNewLabel = new JLabel("Jogador");
		lblNewLabel.setBounds(161, 11, 109, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Idade");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2_1Jogador frame = new Op2_1Jogador(player);//Criação da janela de alteração de dados da idade do Jogador
				frame.setVisible(true);//Habilitação de visibilidade da janela
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 54, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nº Camisa");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2_2Jogador frame = new Op2_2Jogador(player); //Criação da janela de alteração de dados do Nº camisa do Jogador
				frame.setVisible(true);//Habilitação de visibilidade da janela
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 80, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha a Opção que dejesa alterar");
		lblNewLabel_1.setBounds(6, 33, 214, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Poder Potencial Ataque");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2_3MEIJogador frame = new Op2_3MEIJogador(player); //Criação da janela de alteração de dados de habilidade de ataque do Jogador(Exclusivo para Jogadores da posição MEI)
				frame.setVisible(true);	//Habilitação de visibilidade da janela
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(6, 106, 149, 23);
		contentPane.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Poder Potencial Falha"); 
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2_4Jogador frame = new Op2_4Jogador(player); //Criação da janela de alteração de dados de habilidade de potencial de falha do Jogador (Exclusivo para Jogadores da posição MEI)
				frame.setVisible(true); //Habilitação de visibilidade da janela
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(6, 132, 137, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Poder");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Op2_3Jogador frame = new Op2_3Jogador(player); //Criação da janela de alteração de dados de habilidade do Jogador
				frame.setVisible(true); //Habilitação de visibilidade da janela
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 106, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		if(player.getPosicao().equals("MEI")) {
			rdbtnNewRadioButton_2.setVisible(false);
		}else {
			rdbtnNewRadioButton_3.setVisible(false);
			rdbtnNewRadioButton_4.setVisible(false);

		}
		
	}
}
