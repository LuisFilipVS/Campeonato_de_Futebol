package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.TextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Op1Time extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op1Time frame = new Op1Time();
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
	 * Essa janela é responsável por mostrar todos os objetos da classe Jogador que estão armazenados na coleção de dados(HashMap) do objeto Time 
	 */
	public Op1Time(Time equipe) {
		this.equipe = equipe;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na Janela
		JLabel lblNewLabel = new JLabel("OPÇÃO 1 | Mostrar Elenco");
		lblNewLabel.setBounds(153, 11, 139, 14);
		contentPane.add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(26, 64, 301, 187);
		contentPane.add(textArea);
		
		//Cada RadioButton tem uma posição especifica, e uma vez seleciona, mostra somente os jogadores exclusivos da posição
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Goleiros");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Jogador> temp = equipe.getElenco().get("GOL"); //Amostragem dos jogadores exclusivos da posição especifica
				textArea.setText(""); //Limpa o conteudo do TextArea
				int i = 0;
				for (Jogador player : temp) {
					textArea.append("Nº " + i + "\n");
					player.getAtributosJogador(textArea);
					textArea.append("_______________________________" + "\n");
					i++;
				}
				
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 35, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Defensores");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Jogador> temp = equipe.getElenco().get("DEF");
				textArea.setText("");
				int i = 0;
				for (Jogador player : temp) {
					textArea.append("Nº " + i + "\n");
					player.getAtributosJogador(textArea);
					textArea.append("_______________________________" + "\n");
					i++;
				}
				
			}
				
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(109, 35, 81, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Meios-Campo");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Jogador> temp = equipe.getElenco().get("MEI");
				textArea.setText("");
				int i = 0;
				for (Jogador player : temp) {
					textArea.append("Nº " + i+ "\n");
					player.getAtributosJogador(textArea);
					textArea.append("_______________________________" + "\n");
					i++;
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(222, 35, 89, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Atacantes");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Jogador> temp = equipe.getElenco().get("ATA");
				textArea.setText("");
				int i = 0;
				for (Jogador player : temp) {
					textArea.append("Nº " + i + "\n");
					player.getAtributosJogador(textArea);
					textArea.append("_______________________________" + "\n");
					i++;
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(339, 35, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //Fechamento da janela após selecionar o botão
			}
		});
		btnNewButton.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
