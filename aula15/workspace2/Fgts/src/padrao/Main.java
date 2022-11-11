package padrao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		float salario;
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("Digite o seu nome: ");
		nome = scan.next();
		System.out.println("Digite o seu salario");
		salario = scan.nextFloat();
		
		float valorDeposito = (salario * 8) / 100;
		String inicio = String.format("%s;%.2f", nome, salario);
		String saida = String.format("%s;%.2f;%.2f", nome, salario, valorDeposito);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./fgts/fgts.csv", true));
			bw.write(saida);
			bw.close();
				System.out.println("arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

