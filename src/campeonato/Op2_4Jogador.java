package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op2_4Jogador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public Jogador player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op2_4Jogador frame = new Op2_4Jogador();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe realiza a alteração do argumento habilidade do jogadores que jogam no meio de campo, salvo no objeto da classe Jogador
	 * Funciona com a mesma lógica da classe Op2_3Jogador e Op2_3MEIJogador, sendo a diferença somente no atributo de habilidade que vai alterar
	 * Objetos da Classe Jogador que tem o atributo de Posição "MEI" apresenta duas habilidades no qual uma delas é usado no calculo de
	 * possibilidades de chance de gol e a outra é usado no cálculo da possibilidade de se sofrer um gol
	 */
	public Op2_4Jogador(Jogador player) {
		this.player = player;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblMenuJogador_1 = new JLabel("Menu Jogador | Alteração de Poder Potencial Falha");
		lblMenuJogador_1.setBounds(76, 11, 283, 14);
		contentPane.add(lblMenuJogador_1);
		
		JLabel lblNewLabel_1 = new JLabel("Poder Atual:");
		lblNewLabel_1.setBounds(10, 36, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Novo Poder");
		lblNewLabel_2.setBounds(10, 55, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(69, 52, 60, 20);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double poderPotencialFalha = Double.parseDouble(textField.getText());//Adição de conteudo de textfield na varivel
				player.setPoderNegativo(poderPotencialFalha); //Alteração do valor do parâmetro
			}
		});
		btnNewButton_1.setBounds(10, 80, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //fechamento da janela após acionamento do botão
			}
		});
		btnNewButton.setBounds(335, 231, 89, 23);
		contentPane.add(btnNewButton);
	}

}
