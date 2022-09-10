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
public class Op2_3MEIJogador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public Jogador player;

	/**
	 * Launch the application.
	 * Essa classe realiza a alteração do argumento habilidade, salvo no objeto da classe Jogador
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op2_3MEIJogador frame = new Op2_3MEIJogador();
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
	 * Funciona com a mesma lógica da classe Op2_3Jogador e Op2_4Jogador, sendo a diferença somente no atributo de habilidade que vai alterar
	 * Objetos da Classe Jogador que tem o atributo de Posição "MEI" apresenta duas habilidades no qual uma delas é usado no calculo de
	 * possibilidades de chance de gol e a outra é usado no cálculo da possibilidade de se sofrer um gol
	 */
	public Op2_3MEIJogador(Jogador player) {
		this.player = player;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblMenuJogador = new JLabel("Menu Jogador | Alteração de Poder Potencial Ataque");
		lblMenuJogador.setBounds(76, 7, 283, 14);
		contentPane.add(lblMenuJogador);
		
		JLabel lblNewLabel_1 = new JLabel("Poder Atual:");
		lblNewLabel_1.setBounds(10, 32, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Novo Poder");
		lblNewLabel_2.setBounds(10, 51, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(69, 48, 60, 20);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Try catch
				double poderPotencialAtaque = Double.parseDouble(textField.getText()); //Adição de conteudo de textfield na varivel
				player.setPoderPositivo(poderPotencialAtaque);//Alteração do valor do parâmetro
			}
		});
		btnNewButton_1.setBounds(10, 76, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //Fechamento da janela ao acionar o botão
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
	}

}
