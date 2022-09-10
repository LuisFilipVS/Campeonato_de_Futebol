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
public class Op2_2Jogador extends JFrame {

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
					//Op2_2Jogador frame = new Op2_2Jogador();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe realiza a alteração do argumento Nº camisa, salvo no objeto da classe Jogador
	 */
	public Op2_2Jogador(Jogador player /*, boolean NumerosDisp[]*/) {
		this.player = player;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Adição dos componentes na janela
		JLabel lblNewLabel = new JLabel("Menu Jogador | Alteração de Nº camisa");
		lblNewLabel.setBounds(122, 11, 205, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nº Camisa atual");
		lblNewLabel_1.setBounds(10, 34, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nova camisa");
		lblNewLabel_2.setBounds(10, 59, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(81, 56, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //fechamento da janela apos acionamento do botão
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numCamisa = Integer.parseInt(textField.getText()); //Adição do valor do textField na variável
				player.setNumCamisa(numCamisa);//mudança do valor na variável
			}
		});
		btnNewButton_1.setBounds(10, 84, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
