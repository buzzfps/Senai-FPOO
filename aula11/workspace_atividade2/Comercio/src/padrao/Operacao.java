package padrao;

public class Operacao {
	String produto;
	int qtdComprada;
	int qtdVendida;
	float precoCompra;
	float precoVenda;
	
	Operacao(){}
	Operacao(String pro, int comprada, int vendida, float compra, float venda){
		produto = pro;
		qtdComprada = comprada;
		qtdVendida = vendida;
		precoCompra = compra;
		precoVenda = venda;
	}
	
	float investimento() {
		return precoCompra*qtdComprada;
	}
	
	float faturamento() {
		return precoVenda*qtdVendida;
	} 
	
	float lucroDinheiro() {
		return faturamento()-investimento();
	}
	
	float lucroPorcentagem() {
		return (lucroDinheiro()*100)/investimento();
	}
	
	public String toString() {
		return String.format("[%s]\t[%d]\t\t[%d]\t\t\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[%.2f]", produto, qtdComprada, qtdVendida, precoCompra, precoVenda, investimento(), faturamento(), lucroDinheiro(), lucroPorcentagem());
	}
}
