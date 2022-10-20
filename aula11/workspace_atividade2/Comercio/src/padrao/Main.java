package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operacao venda[] = new Operacao[10];
		float total1 = 0, total2 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto, a quantidade comprada, quantidade vendida, preço da compra e 	o preço da venda: ");
		for(int i = 0; i < 10; i++) {
			venda[i] = new Operacao(leia.next(), leia.nextInt(), leia.nextInt(), leia.nextFloat(), leia.nextFloat());
		}
		System.out.println("\nProduto\t\tQtdCont\t\tQtdVenda\t\tprecoCompra\tprecoVenda\tInvestimento\tFaturamento\tLucro(R$)\tLucro(%)");
		for(int i = 0; i < 10; i++) {
		System.out.println(venda[i].toString());
		total1 += venda[i].investimento();
		total2 += venda[i].faturamento();
		}
		
		float total = total1 - total2; 
		
		System.out.printf("O investimento total do sr Osmar: %.2f \n", total1);
		System.out.printf("O faturamento total do sr Osmar: %.2f\n", total2);
		
		if(total > 0)System.out.println("Está no lucro");
		
	}

}
