package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Venda vendas[] = new Venda[10];
		float total=0, total2=0, barato = 0, caro = 0, vendido = 0;
		String pbarato, pcaro, pvendido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome, a quantidade e o preço do produto:\n");
		for(int i = 0; i < 10; i++) 
			vendas[i] = new Venda(leia.next(), leia.nextInt(), leia.nextFloat());
		barato=vendas[0].preco;
		caro=vendas[0].preco;
		vendido=vendas[0].quantidade;
		pbarato=vendas[0].produto;
		pcaro=vendas[0].produto;
		pvendido=vendas[0].produto;
		for(int i = 0; i < 10; i++) {
		System.out.println(vendas[i].toString());
		total += vendas[i].subtotal();
		total2 += vendas[i].preco;
			if(vendas[i].preco < barato) pbarato = vendas[i].produto;
			if(vendas[i].preco > caro) pcaro = vendas[i].produto;
			if(vendas[i].quantidade > vendido) pvendido = vendas[i].produto;
		}
		
		float media = total2/10;
		
		System.out.printf("Total: R$[%.2f]\n", total);
		System.out.printf("Media: R$[%.2f]\n", media);
		System.out.printf("Produto mais barato: %s\n", pbarato);
		System.out.printf("Produto mais caro: %s\n", pcaro);
		System.out.printf("Produto mais vendido: %s\n", pvendido);
	}
	

}
