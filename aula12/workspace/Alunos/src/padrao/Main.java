package padrao;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		System.out.printf("Digite o Nome e o sobre nome a idade de quantos pacientes desejar:\n");
		for(int i = 0; i < 11; i++) {
			pessoas.add(new Pessoa(leia.next(), leia.next(), leia.nextInt()));
		}
		
		for (int i = 0; i < 1; i++) {
			System.out.printf(pessoas.toString());
		}
		
		
	}

}
