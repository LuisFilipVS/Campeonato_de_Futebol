package campeonato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Op3Time extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public Time equipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Op3Time frame = new Op3Time();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Essa classe utiliza como parâmetro um objeto da classe Time e é responsável por habilitar a possibilidade de alteração a formação do time
	 * EX(4-4-2, 5-3-2, 5-4-1)
	 */
	public Op3Time(Time equipe) {
		this.equipe = equipe;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adição de componentes na janela
		JLabel lblNewLabel = new JLabel("OPÇÕES DO TIME | Formação");
		lblNewLabel.setBounds(131, 11, 187, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 36, 52, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 36, 52, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(245, 36, 52, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Recuperção dos dados adicionados no textField / Necessita realizar bloco Try Catch
				int formacaoDef = Integer.parseInt(textField.getText());
				int formacaoMei = Integer.parseInt(textField_1.getText());
				int formacaoAta = Integer.parseInt(textField_2.getText());
				
				int[] tempFormacao = {formacaoDef,formacaoMei,formacaoAta};
				if (equipe.setFormacao(tempFormacao) == true) /*tentativa de alteração com base nos dados informados*/ {
					JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
				}else{
					JOptionPane.showMessageDialog(null, "Erro ao alterar os dados");
				};
			}
		});
		btnNewButton.setBounds(322, 35, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Formação Desejada");
		lblNewLabel_1.setBounds(10, 39, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//fechamento da Janela após seleção do botão
			}
		});
		btnNewButton_1.setBounds(322, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
