package funcionarios;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Funcionarios> funcionarios = new ArrayList<>();
	static int menu = 0;
	static String opcoes[] = { "1. Casastrar", "2. Listar Todas", "3. Alterar", "4. Excluir",
			"5. Buscar por nome", "6. Buscar por matricula", "7. Buscar por nascimento", "8. Terminar" };
	
	public static void itens(String[] itens) {
		for (String i : itens)
			System.out.println(i);
	}
	
	public static void cadastrar() throws ParseException{
		System.out.println("Quantas pessoas deseja cadastrar:");
		int quantas = scan.nextInt();
		System.out.println("Matricula\tNome\tNascimento");
		for (int i = 0; i < quantas; i++)
			funcionarios.add(new Funcionarios(scan.nextInt(), scan.next(), scan.next()));
	}
}