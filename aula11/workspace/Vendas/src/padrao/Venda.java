package padrao;

public class Venda {
	String produto;
	int quantidade;
	float preco;
	
	Venda(){}
	
	Venda(String pro, int quant, float prec){
		produto = pro;
		quantidade = quant;
		preco = prec;
	}
	
	float subtotal() {
		return preco*quantidade;
	}
	
	public String toString() {
		return String.format("[%s]\t[%d]\t\t[R$%.2f]\t\t[R$%.2f]\n", produto, quantidade, preco, subtotal());
	}
}
