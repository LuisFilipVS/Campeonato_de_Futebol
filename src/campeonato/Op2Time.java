package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op2Time extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op2Time frame = new Op2Time();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe utiliza como parametro um objeto da classe Time
	 * Essa janela é acionada a partir da seleção de alteração de dados do jogador, na janela mainTime, e vai listar todos os objetos da
	 * classe Jogador e habilitar a possibilidade de escolher um deles em especifíco, e abrir uma janela específica mainJogador instancionado 
	 * o objeto da classe Jogador, selecionado. 
	 */
	public Op2Time(Time equipe) {
		this.equipe = equipe;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		//adição de componentes na janela
		
		JLabel lblOpesDoTime_1 = new JLabel("OPÇÕES DO TIME | Configurar Jogador");
		lblOpesDoTime_1.setBounds(113, 11, 206, 14);
		contentPane_1.add(lblOpesDoTime_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(24, 31, 380, 160);
		contentPane_1.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Escolha o jogador");
		lblNewLabel.setBounds(234, 197, 85, 14);
		contentPane_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(329, 194, 76, 20);
		contentPane_1.add(textField);
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Código que vai buscar o jogador escolhido na coleção e iniciar a janela mainJogador
				int jogadorEscolhido = Integer.parseInt(textField.getText());
				HashMap<String, ArrayList<Jogador>> temp = equipe.getElenco();
				int j = 1;
				for (String posicao : temp.keySet()) {
					ArrayList<Jogador> temp2 = temp.get(posicao);
					
					for (Jogador player : temp2) {
						if (j == jogadorEscolhido) {
							setVisible(false); //fecha essa janela
							mainJogador frame = new mainJogador(player);
							frame.setVisible(true); //Habilitação de visibilidade da janela mainJogador
							break;
						} else {
							j++;
						}
					}
				}
				
				
			}
		});
		btnSelecionar.setBounds(315, 225, 89, 23);
		contentPane_1.add(btnSelecionar);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(216, 225, 89, 23);
		contentPane_1.add(btnNewButton_1);
		
		
		HashMap<String, ArrayList<Jogador>> temp = equipe.getElenco();
		int i = 1;
		//Trecho de código que mostra em um textArea toda o coleção de jogadores, do objeto time
		for (String posicao : temp.keySet()) {
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
