package controle;

public class Credito {

	private double valor;
	private int parcelas = 1;
	private double porcLucro = 0.1;
	private double taxaIntermediacao;
	private double taxaParcelamento = 0.0299;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double retornaValorVenda() {
		double valorVenda;
		if (parcelas == 1) {
			this.taxaIntermediacao = 0.0499;
		} else {
			this.taxaIntermediacao = 0.0559;
		}
		valorVenda = this.valor + (this.valor * this.porcLucro) + (this.valor * this.taxaIntermediacao);
		return valorVenda;
	}

	public double valorDescontado() {
		return ((this.valor * this.taxaIntermediacao));
	}
	
	public double valorLucro() {
		return this.porcLucro * this.valor;
	}

	public double retornaCustoFinal() {
		double custoFinal;
		if(this.parcelas == 1) {
			custoFinal = this.retornaValorVenda();
		}else {
			custoFinal = this.retornaValorVenda() * Math.pow((1 + this.taxaParcelamento), this.parcelas);
		}
		return custoFinal;
	}

	public double valorParcela() {
		double valorParcela;
		valorParcela = this.retornaCustoFinal() / this.parcelas;
		return valorParcela;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

}
