package telas;

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

import controle.Credito;
import controle.Dinheiro;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfValorCliente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		super("Simulador");
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
		pValorVenda.setBounds(10, 35, 343, 64);
		pResultado.add(pValorVenda);
		pValorVenda.setLayout(null);

		JLabel lblValorDeVenda = new JLabel("VALOR DE VENDA:");
		lblValorDeVenda.setBounds(136, 11, 105, 14);
		pValorVenda.add(lblValorDeVenda);

		JLabel lblRVVenda = new JLabel("R$: 00,00");
		lblRVVenda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRVVenda.setBounds(150, 30, 114, 14);
		pValorVenda.add(lblRVVenda);

		JPanel pCustoFinal = new JPanel();
		pCustoFinal.setLayout(null);
		pCustoFinal.setBounds(10, 110, 343, 72);
		pResultado.add(pCustoFinal);

		JLabel lblCustoFinal = new JLabel("CUSTO FINAL:");
		lblCustoFinal.setBounds(136, 3, 105, 14);
		pCustoFinal.add(lblCustoFinal);

		JLabel lblRCFinal = new JLabel("R$: 00,00");
		lblRCFinal.setBounds(140, 20, 114, 14);
		pCustoFinal.add(lblRCFinal);

		JLabel lblRefere = new JLabel("referente a taxa de parcelamento comprador de 2,99% ao m\u00EAs");
		lblRefere.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblRefere.setBounds(50, 57, 267, 15);
		pCustoFinal.add(lblRefere);

		JLabel lblXParcelasDe = new JLabel("0 parcelas de R$ 00,00");
		lblXParcelasDe.setBounds(113, 40, 174, 14);
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

		JLabel lblRX = new JLabel("R$: 00,00");
		lblRX.setBounds(10, 36, 80, 14);
		pRecebe.add(lblRX);

		JLabel lblR_1 = new JLabel("R$: 00,00");
		lblR_1.setBounds(130, 36, 88, 14);
		pRecebe.add(lblR_1);

		JLabel lblR_2 = new JLabel("R$: 00,00");
		lblR_2.setBounds(260, 36, 73, 14);
		pRecebe.add(lblR_2);

		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(100, 36, 16, 14);
		pRecebe.add(label_3);

		JLabel label_4 = new JLabel("=");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(220, 36, 16, 14);
		pRecebe.add(label_4);

		JPanel pLucro = new JPanel();
		pLucro.setLayout(null);
		pLucro.setBounds(10, 268, 343, 41);
		pResultado.add(pLucro);

		JLabel lblLucro = new JLabel("LUCRO: R$ 00,00");
		lblLucro.setBounds(10, 11, 141, 14);
		pLucro.add(lblLucro);

		JPanel pDados = new JPanel();
		pDados.setBackground(SystemColor.controlHighlight);
		pDados.setBounds(393, 67, 181, 320);
		contentPane.add(pDados);
		pDados.setLayout(null);

		JLabel lblComprador = new JLabel("Comprador");
		lblComprador.setBounds(15, 215, 80, 14);
		pDados.add(lblComprador);

		tfValorCliente = new JTextField();
		tfValorCliente.setBounds(35, 75, 86, 20);
		pDados.add(tfValorCliente);
		tfValorCliente.setColumns(10);

		JLabel lblResValorVenda = new JLabel("R$ 00,00");
		lblResValorVenda.setBounds(15, 125, 80, 14);
		pDados.add(lblResValorVenda);

		JLabel lblCompradorPagaEm = new JLabel("Comprador paga em:");
		lblCompradorPagaEm.setBounds(15, 150, 126, 14);
		pDados.add(lblCompradorPagaEm);

		JComboBox cbParcela = new JComboBox();
		cbParcela.setBounds(15, 170, 106, 20);
		pDados.add(cbParcela);
		cbParcela.setMaximumRowCount(12);
		cbParcela.setModel(new DefaultComboBoxModel(
				new String[] { "1 parcela", "2 parcelas", "3 parcelas", "4 parcelas", "5 parcelas", "6 parcelas",
						"7 parcelas", "8 parcelas", "9 parcelas", "10 parcelas", "11 parcelas", "12 parcelas" }));

		JLabel lblValorDaVenda = new JLabel("Valor da venda: ");
		lblValorDaVenda.setBounds(15, 110, 106, 14);
		pDados.add(lblValorDaVenda);

		JLabel lblR = new JLabel("R$");
		lblR.setBounds(15, 80, 16, 14);
		pDados.add(lblR);

		JLabel lblTipoDeParcelamento = new JLabel("Tipo de parcelamento:");
		lblTipoDeParcelamento.setBounds(15, 200, 126, 14);
		pDados.add(lblTipoDeParcelamento);

		JComboBox cbFormaPagamento = new JComboBox();
		cbFormaPagamento.setBackground(SystemColor.text);
		cbFormaPagamento.setBounds(15, 25, 80, 20);
		pDados.add(cbFormaPagamento);
		cbFormaPagamento.setModel(new DefaultComboBoxModel(new String[] { "Dinheiro", "Cr\u00E9dito" }));
		cbFormaPagamento.setSelectedIndex(1);

		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
		lblFormaDePagamento.setBounds(15, 8, 146, 14);
		pDados.add(lblFormaDePagamento);

		JButton btnRecalcular = new JButton("RECALCULAR");
		btnRecalcular.setBounds(35, 253, 126, 45);
		pDados.add(btnRecalcular);
		btnRecalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int formaDePagamento = cbFormaPagamento.getSelectedIndex();
				String valor = tfValorCliente.getText().replace(",", ".");
				int parcelas = cbParcela.getSelectedIndex();
				parcelas++;

				switch (formaDePagamento) {
				case 1:
					Credito cartao = new Credito();
					cartao.setValor(Double.parseDouble(valor));
					cartao.setParcelas(parcelas);

					lblResValorVenda.setText("R$ " + String.format("%.2f", cartao.retornaValorVenda()));
					lblRVVenda.setText("R$ " + String.format("%.2f", cartao.retornaValorVenda()));
					lblRCFinal.setText("R$ " + String.format("%.2f", cartao.retornaCustoFinal()));
					lblXParcelasDe.setText(
							cartao.getParcelas() + " parcelas de R$ " + String.format("%.2f", cartao.valorParcela()));

					lblRX.setText("R$ " + String.format("%.2f", cartao.retornaValorVenda()));
					lblR_1.setText("R$ " + String.format("%.2f", cartao.valorDescontado()));

					double recebe = cartao.retornaValorVenda() - cartao.valorDescontado();
					lblR_2.setText("R$ " + String.format("%.2f", recebe));

					lblLucro.setText("LUCRO: R$ " + String.format("%.2f", cartao.valorLucro()));
					
					pRecebe.setVisible(true);
					lblTipoDeParcelamento.setVisible(true);
					lblComprador.setVisible(true);
					lblValorDaVenda.setVisible(true);
					lblResValorVenda.setVisible(true);	
					lblRefere.setVisible(true);
					
					lblCompradorPagaEm.setBounds(15, 150, 126, 14);
					cbParcela.setBounds(15, 170, 106, 20);
					pLucro.setBounds(10, 268, 343, 41);
					break;

				case 0:
					Dinheiro dinheiro = new Dinheiro();
					dinheiro.setValor(Double.parseDouble(valor));
					dinheiro.setParcelas(parcelas);

					lblRVVenda.setText("R$ " + String.format("%.2f", dinheiro.getValor()));
					lblRCFinal.setText("R$ " + String.format("%.2f", dinheiro.custoFinal()));
					lblXParcelasDe.setText(dinheiro.getParcelas() + " parcelas de R$ "
							+ String.format("%.2f", dinheiro.valorParcela(dinheiro.custoFinal())));
					lblLucro.setText("LUCRO: R$ " + String.format("%.2f", dinheiro.lucro()));
					
					pRecebe.setVisible(false);
					lblTipoDeParcelamento.setVisible(false);
					lblComprador.setVisible(false);
					lblValorDaVenda.setVisible(false);
					lblResValorVenda.setVisible(false);	
					lblRefere.setVisible(false);
					
					lblCompradorPagaEm.setBounds(15, 110, 126, 14);
					cbParcela.setBounds(15, 125, 106, 20);
					pLucro.setBounds(10, 193, 343, 41);
					break;

				}
			}
		});

		JLabel lblValorCliente = new JLabel("Valor que o cliente quer: ");
		lblValorCliente.setBounds(15, 60, 156, 14);
		pDados.add(lblValorCliente);
	}
}
