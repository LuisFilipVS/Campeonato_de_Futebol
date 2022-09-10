package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op5Time extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	//private Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op5Time frame = new Op5Time();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa janela é acionada a partir da seleção de alteração de dados do jogador, na janela mainTime, e vai listar todos os objetos da
	 * classe Jogador e habilitar a possibilidade de escolher um deles ,em especifíco, para remové-lo da coleção do time
	 */
	public Op5Time(Time equipe) {
		//this.equipe = equipe;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Adição dos componentes da janela
		JLabel lblOpesDoTime_1 = new JLabel("OPÇÕES DO TIME | Remover Jogador");
		lblOpesDoTime_1.setBounds(120, 11, 187, 14);
		contentPane.add(lblOpesDoTime_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(24, 31, 380, 160);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Escolha o jogador");
		lblNewLabel.setBounds(234, 197, 85, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(329, 194, 76, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Remover");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Código que vai buscar o jogador escolhido na coleção e vai removê-lo da coleção
				int jogadorEscolhido = Integer.parseInt(textField.getText());
				HashMap<String, ArrayList<Jogador>> temp = equipe.getElenco();
				int j = 1;
				for (String posicao : temp.keySet()) {
					ArrayList<Jogador> temp2 = temp.get(posicao);
					
					for (Jogador player : temp2) {
						if (j == jogadorEscolhido) {
							temp2.remove(player);
							break;
						} else {
							j++;
						}
					}
				}
				
			}
		});
		btnNewButton.setBounds(315, 222, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(218, 222, 89, 23);
		contentPane.add(btnNewButton_1);
		
		HashMap<String, ArrayList<Jogador>> temp = equipe.getElenco();
		int i = 1;
		for (String posicao : temp.keySet()) {
			//Trecho de código que mostra em um textArea toda o coleção de jogadores, do objeto time
			ArrayList<Jogador> temp2 = temp.get(posicao);
			
			for (Jogador player : temp2) {
				//textArea.setText("");
				textArea.append("Nº " + i + "\n");
				player.getAtributosJogador(textArea);
				textArea.append("____________________________" + "\n");
				i++;
			}
		}
	}
}
