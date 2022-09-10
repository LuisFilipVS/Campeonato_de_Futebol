package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op2_1Jogador extends JFrame {

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
					//Op2_1Jogador frame = new Op2_1Jogador();
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
	 * Essa classe realiza a alteração do argumento Idade, salvo no objeto da classe Jogador
	 */
	public Op2_1Jogador(Jogador player) {
		this.player = player;
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes
		JLabel lblNewLabel = new JLabel("Menu Jogador");
		lblNewLabel.setBounds(178, 11, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade Atual do Jogador:  ");
		lblNewLabel_1.setBounds(10, 31, 179, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //fecha Janela apos acionamento do botão
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Nova idade");
		lblNewLabel_2.setBounds(10, 51, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(71, 48, 56, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// fazer try Catch 
				int idade = Integer.parseInt(textField.getText()); //adição do valor do textField na variável idade
				player.setIdade(idade); //alteração do valor no parâmetro idede
			}
		});
		btnNewButton_1.setBounds(10, 76, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
