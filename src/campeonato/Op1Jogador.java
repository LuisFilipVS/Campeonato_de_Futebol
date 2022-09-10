package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op1Jogador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	Jogador Player;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op1Jogador frame = new Op1Jogador();
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
	 * Essa janela vai ser responsável por mostrar os dados de um objetos da classe Jogador
	 */
	public Op1Jogador(Jogador Player) {
		this.Player = Player;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblNewLabel = new JLabel("Listagem de Atributos do Jogador");
		lblNewLabel.setBounds(83, 11, 179, 14);
		contentPane.add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 31, 322, 220);
		contentPane.add(textArea);
		
		Player.getAtributosJogador(textArea);
		
		Button button = new Button("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setBounds(354, 229, 70, 22);
		contentPane.add(button);
	}
}
