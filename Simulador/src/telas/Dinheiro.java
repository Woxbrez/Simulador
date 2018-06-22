package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Dinheiro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfValorCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dinheiro frame = new Dinheiro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dinheiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSimular = new JLabel("SIMULAR");
		lblSimular.setFont(new Font("Arial Black", Font.PLAIN, 26));
		lblSimular.setBounds(20, 11, 156, 37);
		contentPane.add(lblSimular);
		
		JPanel pResultado = new JPanel();
		pResultado.setBackground(SystemColor.controlHighlight);
		pResultado.setBounds(20, 67, 363, 320);
		contentPane.add(pResultado);
		pResultado.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veja abaixo o resultado de sua simula\u00E7\u00E3o:");
		lblNewLabel.setBounds(86, 11, 267, 14);
		pResultado.add(lblNewLabel);
		
		JPanel pValorVenda = new JPanel();
		pValorVenda.setBounds(10, 63, 343, 64);
		pResultado.add(pValorVenda);
		pValorVenda.setLayout(null);
		
		JLabel lblValorDeVenda = new JLabel("VALOR:");
		lblValorDeVenda.setBounds(147, 11, 105, 14);
		pValorVenda.add(lblValorDeVenda);
		
		JLabel lblR_2 = new JLabel("R$:");
		lblR_2.setBounds(127, 36, 114, 14);
		pValorVenda.add(lblR_2);
		
		JPanel pCustoFinal = new JPanel();
		pCustoFinal.setLayout(null);
		pCustoFinal.setBounds(10, 152, 343, 72);
		pResultado.add(pCustoFinal);
		
		JLabel lblCustoFinal = new JLabel("CUSTO FINAL:");
		lblCustoFinal.setBounds(136, 3, 105, 14);
		pCustoFinal.add(lblCustoFinal);
		
		JLabel label = new JLabel("R$:");
		label.setBounds(127, 20, 114, 14);
		pCustoFinal.add(label);
		
		JLabel lblXParcelasDe = new JLabel("X parcelas de R$ X");
		lblXParcelasDe.setBounds(105, 40, 174, 14);
		pCustoFinal.add(lblXParcelasDe);
		
		JPanel pLucro = new JPanel();
		pLucro.setLayout(null);
		pLucro.setBounds(10, 268, 343, 41);
		pResultado.add(pLucro);
		
		JLabel lblLucro = new JLabel("LUCRO:");
		lblLucro.setBounds(10, 11, 76, 14);
		pLucro.add(lblLucro);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(393, 67, 181, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfValorCliente = new JTextField();
		tfValorCliente.setBounds(35, 75, 86, 20);
		panel.add(tfValorCliente);
		tfValorCliente.setColumns(10);
		
		JLabel lblCompradorPagaEm = new JLabel("Comprador paga em:");
		lblCompradorPagaEm.setBounds(15, 105, 126, 14);
		panel.add(lblCompradorPagaEm);
		
		JComboBox cbParcela = new JComboBox();
		cbParcela.setBounds(15, 122, 80, 20);
		panel.add(cbParcela);
		cbParcela.setMaximumRowCount(12);
		cbParcela.setModel(new DefaultComboBoxModel(new String[] {"1 parcela", "2 parcelas", "3 parcelas", "4 parcelas", "5 parcelas", "6 parcelas", "7 parcelas", "8 parcelas", "9 parcelas", "10 parcelas", "11 parcelas", "12 parcelas"}));
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(15, 80, 16, 14);
		panel.add(lblR);
		
		JComboBox cbFormaPagamento = new JComboBox();
		cbFormaPagamento.setBackground(SystemColor.text);
		cbFormaPagamento.setBounds(15, 25, 80, 20);
		panel.add(cbFormaPagamento);
		cbFormaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Dinheiro", "Cr\u00E9dito"}));
		cbFormaPagamento.setSelectedIndex(0);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
		lblFormaDePagamento.setBounds(15, 8, 146, 14);
		panel.add(lblFormaDePagamento);
		
		JButton btnRecalcular = new JButton("RECALCULAR");
		btnRecalcular.setBounds(35, 253, 126, 45);
		panel.add(btnRecalcular);
		btnRecalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblValorCliente = new JLabel("Valor que o cliente quer: ");
		lblValorCliente.setBounds(15, 60, 156, 14);
		panel.add(lblValorCliente);
	}

}
