package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Venda vendas[] = new Venda[10];
		float total=0, total2=0, barato=0, caro=0, vendido=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome, a quantidade e o preço do produto:\n");
		for(int i = 0; i < 10; i++) 
			vendas[i] = new Venda(leia.next(), leia.nextInt(), leia.nextFloat());
		
		barato=vendas[0].preco;
		caro=vendas[0].preco;
		vendido=vendas[0].quantidade;
		for(int i = 0; i < 10; i++) {
		System.out.println(vendas[i].toString());
		total += vendas[i].subtotal();
		total2 += vendas[i].preco;
			if(vendas[i].preco < barato) barato = vendas[i].preco;
			if(vendas[i].preco > caro) caro = vendas[i].preco;
			if(vendas[i].quantidade > vendido) vendido = vendas[i].quantidade;
			
		}
		
		float media = total2/10;
		
		System.out.printf("Total: R$[%.2f]\n", total);
		System.out.printf("Media: R$[%.2f]\n", media);
		System.out.printf("Produto mais barato: R$%.2f\n", barato);
		System.out.printf("Produto mais caro: R$%.2f\n", caro);
		System.out.printf("Produto mais vendido:R$%.2f\n", vendido);
	}
		

}
