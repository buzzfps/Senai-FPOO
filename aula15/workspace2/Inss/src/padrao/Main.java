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
				
		System.out.println("Digite o seu nome: ");
		nome = scan.next();
		System.out.println("Digite o seu salario");
		salario = scan.nextFloat();
		
		if(salario <= 1212) n = 7.5f;
		else if(salario <= 2427.35f) n = 9f;
		else if(salario <= 3641.03f) n = 12f;
		else n = 14;
		
		float inss = (salario * n) / 100;
		String inicio = String.format("Nome;Salario;Desconto\r\n");
		String saida = String.format("%s;%.2f;%.2f\r\n", nome, salario, inss);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./inss/inss.csv", true));
			bw.write(inicio + saida);
			bw.close();
				System.out.println("arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
