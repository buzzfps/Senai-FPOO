package padrao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		float salario;
		float n = 0;
		float taxa = 0;
				
		System.out.println("Digite o seu nome: ");
		nome = scan.next();
		System.out.println("Digite o seu salario");
		salario = scan.nextFloat();
		
		if(salario <= 1903.98) {
			n = 0;
			taxa = 0;
		}
		else if(salario <= 2826.65f) { 
			n = 7.5f;
			taxa = 142.80f;
		}
		else if(salario <= 3751.05f) {
			n = 15f;
			taxa = -354.80f;
		}
		else if (salario <= 4664.68f) {
			n = 22.5f;
			taxa = 636.13f;
		}
		else {
			n = 27.5f;
			taxa = 869.36f;
		}
		
		float irrf = (salario * n) / 100 - taxa;
		String inicio = String.format("Nome;Salario;Desconto;Taxa\r\n");
		String saida = String.format("%s;%.2f;%.2f;%.2f\r\n", nome, salario, irrf, taxa);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./irrf/irrf.csv", true));
			bw.write(inicio + saida);
			bw.close();
				System.out.println("arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}