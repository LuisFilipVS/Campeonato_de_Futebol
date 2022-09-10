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
public class Op2_3Jogador extends JFrame {

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
					//Op2_3Jogador frame = new Op2_3Jogador();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Op2_3Jogador(Jogador player) {
		this.player = player;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Adição de componentes na janela
		JLabel lblNewLabel = new JLabel("Menu Jogador | Alteração de Poder");
		lblNewLabel.setBounds(135, 11, 195, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Poder Atual:");
		lblNewLabel_1.setBounds(10, 32, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Novo Poder");
		lblNewLabel_2.setBounds(10, 51, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(69, 48, 60, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //fechamento da janela após acionamento do botão
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Adicionar TryCatch
				double poder = Double.parseDouble(textField.getText());//recuperação do valor no textField e adição na variável
				player.setPoder(poder);//Alteração do valor no parâmetro
			}
		});
		btnNewButton_1.setBounds(10, 76, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
