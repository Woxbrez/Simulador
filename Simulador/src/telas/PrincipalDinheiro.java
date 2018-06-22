package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class PrincipalDinheiro extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfValorCliente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalDinheiro frame = new PrincipalDinheiro();
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
	public PrincipalDinheiro() {
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
		lblNewLabel.setBounds(86, 11, 201, 14);
		pResultado.add(lblNewLabel);
		
		JPanel pValorVenda = new JPanel();
		pValorVenda.setBounds(10, 35, 343, 64);
		pResultado.add(pValorVenda);
		pValorVenda.setLayout(null);
		
		JLabel lblValorDeVenda = new JLabel("VALOR DE VENDA:");
		lblValorDeVenda.setBounds(136, 11, 89, 14);
		pValorVenda.add(lblValorDeVenda);
		
		JLabel lblR_2 = new JLabel("R$:");
		lblR_2.setBounds(127, 36, 114, 14);
		pValorVenda.add(lblR_2);
		
		JPanel pCustoFinal = new JPanel();
		pCustoFinal.setLayout(null);
		pCustoFinal.setBounds(10, 110, 343, 72);
		pResultado.add(pCustoFinal);
		
		JLabel lblCustoFinal = new JLabel("CUSTO FINAL:");
		lblCustoFinal.setBounds(136, 3, 76, 14);
		pCustoFinal.add(lblCustoFinal);
		
		JLabel label = new JLabel("R$:");
		label.setBounds(127, 20, 114, 14);
		pCustoFinal.add(label);
		
		JLabel lblRefere = new JLabel("referente a taxa de parcelamento comprador de 2,99% ao m\u00EAs");
		lblRefere.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblRefere.setBounds(50, 57, 267, 15);
		pCustoFinal.add(lblRefere);
		
		JLabel lblXParcelasDe = new JLabel("X parcelas de R$ X");
		lblXParcelasDe.setBounds(80, 40, 174, 14);
		pCustoFinal.add(lblXParcelasDe);
		
		JPanel pRecebe = new JPanel();
		pRecebe.setLayout(null);
		pRecebe.setBounds(10, 193, 343, 64);
		pResultado.add(pRecebe);
		
		JLabel lblValorDeVenda_1 = new JLabel("VALOR DE VENDA:");
		lblValorDeVenda_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblValorDeVenda_1.setBounds(10, 11, 96, 14);
		pRecebe.add(lblValorDeVenda_1);
		
		JLabel lblValorDescontado = new JLabel("VALOR DESCONTADO:");
		lblValorDescontado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblValorDescontado.setBounds(116, 11, 119, 14);
		pRecebe.add(lblValorDescontado);
		
		JLabel lblVocRecebe = new JLabel("VOC\u00CA RECEBE:");
		lblVocRecebe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblVocRecebe.setBounds(255, 11, 88, 14);
		pRecebe.add(lblVocRecebe);
		
		JLabel lblRX = new JLabel("R$: X");
		lblRX.setBounds(20, 36, 46, 14);
		pRecebe.add(lblRX);
		
		JLabel label_1 = new JLabel("R$: X");
		label_1.setBounds(145, 36, 46, 14);
		pRecebe.add(label_1);
		
		JLabel label_2 = new JLabel("R$: X");
		label_2.setBounds(265, 36, 46, 14);
		pRecebe.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(100, 36, 16, 14);
		pRecebe.add(label_3);
		
		JLabel label_4 = new JLabel("=");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(228, 36, 16, 14);
		pRecebe.add(label_4);
		
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
		
		JLabel lblComprador = new JLabel("Comprador");
		lblComprador.setBounds(15, 215, 53, 14);
		panel.add(lblComprador);
		
		tfValorCliente = new JTextField();
		tfValorCliente.setBounds(35, 75, 86, 20);
		panel.add(tfValorCliente);
		tfValorCliente.setColumns(10);
		
		JLabel lblR_1 = new JLabel("R$");
		lblR_1.setBounds(15, 125, 80, 14);
		panel.add(lblR_1);
		
		JLabel lblCompradorPagaEm = new JLabel("Comprador paga em:");
		lblCompradorPagaEm.setBounds(15, 150, 101, 14);
		panel.add(lblCompradorPagaEm);
		
		JComboBox cbParcela = new JComboBox();
		cbParcela.setBounds(15, 170, 80, 20);
		panel.add(cbParcela);
		cbParcela.setMaximumRowCount(12);
		cbParcela.setModel(new DefaultComboBoxModel(new String[] {"1 parcela", "2 parcelas", "3 parcelas", "4 parcelas", "5 parcelas", "6 parcelas", "7 parcelas", "8 parcelas", "9 parcelas", "10 parcelas", "11 parcelas", "12 parcelas"}));
		
		JLabel lblValorDaVenda = new JLabel("Valor da venda: ");
		lblValorDaVenda.setBounds(15, 110, 79, 14);
		panel.add(lblValorDaVenda);
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(15, 80, 16, 14);
		panel.add(lblR);
		
		JLabel lblTipoDeParcelamento = new JLabel("Tipo de parcelamento:");
		lblTipoDeParcelamento.setBounds(15, 200, 107, 14);
		panel.add(lblTipoDeParcelamento);
		
		JComboBox cbFormaPagamento = new JComboBox();
		cbFormaPagamento.setBackground(SystemColor.text);
		cbFormaPagamento.setBounds(15, 25, 80, 20);
		panel.add(cbFormaPagamento);
		cbFormaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Dinheiro", "Cr\u00E9dito"}));
		cbFormaPagamento.setSelectedIndex(1);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
		lblFormaDePagamento.setBounds(15, 8, 106, 14);
		panel.add(lblFormaDePagamento);
		
		JButton btnRecalcular = new JButton("RECALCULAR");
		btnRecalcular.setBounds(35, 253, 126, 45);
		panel.add(btnRecalcular);
		btnRecalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblValorCliente = new JLabel("Valor que o cliente quer: ");
		lblValorCliente.setBounds(15, 60, 120, 14);
		panel.add(lblValorCliente);
	}
}
