package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op4Time extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldIdade;
	private JTextField textFieldNumCamisa;
	private JTextField textFieldHabilidade;
	private JTextField textFieldPotencialAcerto;
	private JTextField textFieldPotencialErro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op4Time frame = new Op4Time();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe utiliza como parameto um objeto da classe time e tem como função habilitar a criação de um novo jogador(Objeto da classe Jogador)
	 * e adicionar na coleção de dados do time, do tipo Jogador
	 */
	public Op4Time(Time equipe) {
		this.equipe = equipe;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblOpesDoTime = new JLabel("OPÇÕES DO TIME | Adicionar Jogador");
		lblOpesDoTime.setBounds(122, 11, 187, 14);
		contentPane.add(lblOpesDoTime);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(28, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(28, 62, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblNCamisa = new JLabel("Nº Camisa");
		lblNCamisa.setBounds(28, 87, 86, 14);
		contentPane.add(lblNCamisa);
		
		JLabel lblPosio = new JLabel("Posição");
		lblPosio.setBounds(28, 111, 46, 14);
		contentPane.add(lblPosio);
		
		JLabel lblHabilidade = new JLabel("Habilidade");
		lblHabilidade.setBounds(28, 136, 86, 14);
		contentPane.add(lblHabilidade);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(122, 36, 133, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(122, 59, 46, 20);
		contentPane.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		textFieldNumCamisa = new JTextField();
		textFieldNumCamisa.setColumns(10);
		textFieldNumCamisa.setBounds(122, 84, 46, 20);
		contentPane.add(textFieldNumCamisa);
		
		JLabel lblPotencialDeAcerto = new JLabel("Potencial de acerto");
		lblPotencialDeAcerto.setBounds(193, 139, 104, 14);
		contentPane.add(lblPotencialDeAcerto);
		
		textFieldPotencialErro = new JTextField();
		textFieldPotencialErro.setColumns(10);
		textFieldPotencialErro.setBounds(307, 133, 46, 20);
		contentPane.add(textFieldPotencialErro);
		
		textFieldHabilidade = new JTextField();
		textFieldHabilidade.setBounds(122, 133, 46, 20);
		contentPane.add(textFieldHabilidade);
		textFieldHabilidade.setColumns(10);
		
		JLabel lblPotencialDeFalha = new JLabel("Potencial de falha");
		lblPotencialDeFalha.setBounds(28, 158, 86, 14);
		contentPane.add(lblPotencialDeFalha);
		
		textFieldPotencialAcerto = new JTextField();
		textFieldPotencialAcerto.setColumns(10);
		textFieldPotencialAcerto.setBounds(122, 155, 46, 20);
		contentPane.add(textFieldPotencialAcerto);
		
		JRadioButton rdbtnNewRadioButtonGol = new JRadioButton("GOL");
		rdbtnNewRadioButtonGol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPotencialAcerto.setVisible(false);
				lblPotencialDeAcerto.setVisible(false);
				textFieldPotencialErro.setVisible(false);
				lblPotencialDeFalha.setVisible(false);
				textFieldHabilidade.setVisible(true);
				lblHabilidade.setVisible(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButtonGol);
		rdbtnNewRadioButtonGol.setBounds(122, 107, 59, 23);
		contentPane.add(rdbtnNewRadioButtonGol);
		
		JRadioButton rdbtnDef = new JRadioButton("DEF");
		rdbtnDef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPotencialAcerto.setVisible(false);
				lblPotencialDeAcerto.setVisible(false);
				textFieldPotencialErro.setVisible(false);
				lblPotencialDeFalha.setVisible(false);
				textFieldHabilidade.setVisible(true);
				lblHabilidade.setVisible(true);
			}
		});
		buttonGroup.add(rdbtnDef);
		rdbtnDef.setBounds(183, 107, 59, 23);
		contentPane.add(rdbtnDef);
		
		JRadioButton rdbtnNewRadioButtonMEI = new JRadioButton("MEI");
		rdbtnNewRadioButtonMEI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPotencialAcerto.setVisible(true);
				lblPotencialDeAcerto.setVisible(true);
				textFieldPotencialErro.setVisible(true);
				lblPotencialDeFalha.setVisible(true);
				textFieldHabilidade.setVisible(false);
				lblHabilidade.setVisible(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButtonMEI);
		rdbtnNewRadioButtonMEI.setBounds(244, 107, 59, 23);
		contentPane.add(rdbtnNewRadioButtonMEI);
		
		JRadioButton rdbtnNewRadioButtonAta = new JRadioButton("ATA");
		rdbtnNewRadioButtonAta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPotencialAcerto.setVisible(false);
				lblPotencialDeAcerto.setVisible(false);
				textFieldPotencialErro.setVisible(false);
				lblPotencialDeFalha.setVisible(false);
				textFieldHabilidade.setVisible(true);
				lblHabilidade.setVisible(true);
				
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButtonAta);
		rdbtnNewRadioButtonAta.setBounds(307, 107, 59, 23);
		contentPane.add(rdbtnNewRadioButtonAta);
		
		
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Ao acionar o botão Adicionar, os dados são coletados a partir dos textFields, adicionados nas variáveis e no fim há a tentativa
				//de instanciação de um novo objeto
				
				String tempNome = textFieldNome.getText();
				int tempIdade = Integer.parseInt(textFieldIdade.getText());
				int tempNumCamisa = Integer.parseInt(textFieldNumCamisa.getText());
				double tempPotencialErro = 0;
				double tempPotencialAcerto = 0;
				double tempHabilidade = 0;
				
				if (rdbtnNewRadioButtonMEI.isSelected()) {
					tempPotencialErro = Double.parseDouble(textFieldPotencialErro.getText());;
					tempPotencialAcerto = Double.parseDouble(textFieldPotencialAcerto.getText());;
				}
				else {
					tempHabilidade = Double.parseDouble(textFieldHabilidade.getText());;
				}
				
				Jogador jogadorTemp = null;
				//Estrutura de decisão no qual cria um objeto a partir da posição escolhida
				if(rdbtnNewRadioButtonGol.isSelected()) {
					jogadorTemp = new Jogador(tempNome, tempIdade, tempNumCamisa, "GOL", tempHabilidade);
				}else if(rdbtnDef.isSelected()) {
					jogadorTemp = new Jogador(tempNome, tempIdade, tempNumCamisa, "DEF", tempHabilidade);
				}else if(rdbtnNewRadioButtonMEI.isSelected()) {
					jogadorTemp = new Jogador(tempNome, tempIdade, tempNumCamisa, "MEI", tempPotencialAcerto, tempPotencialErro);
				}else if(rdbtnNewRadioButtonAta.isSelected()) {
					jogadorTemp = new Jogador(tempNome, tempIdade, tempNumCamisa, "ATA", tempHabilidade);
				}
				
				//Adição do objeto na coleção do time
				equipe.getElenco().get(jogadorTemp.getPosicao()).add(jogadorTemp);
			
				
			}
		});
		btnNewButton.setBounds(335, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
