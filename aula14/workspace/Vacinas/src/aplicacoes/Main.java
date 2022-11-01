package aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Vacina> vacinas = new ArrayList<>();
	static int menu = 0;

	public static void main(String[] args) {
		
		
			while (menu != 8) {
				System.out.println("\n1.Cadastrar vacina");
				System.out.println("2.Listar vacinas");
				System.out.println("3.Alterar dados");
				System.out.println("4.Excluir registro");
				System.out.println("5.Buscar por pet");
				System.out.println("6.Buscar por veterinario");
				System.out.println("7.Buscar por vacina");
				System.out.println("8.Terminar programa");
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Nome do pet\tQuem aplicou a vacina\tNome da vacina\tData da aplicação");
					create();
					break;
				case 2:
					System.out.println("Nome do pet\tQuem aplicou a vacina\tNome da vacina\tData da aplicação");
					read();
					break;
				case 3:
					System.out.println("Digite qual pet deseja alterar:");
					update(scan.nextInt());
					break;
				case 4:
					System.out.println("Digite qual registro de pet deseja excluir:");
					delete(scan.nextInt());
					break;
				case 5:
					System.out.println("Digite qual resgistro de pet deseja buscar: ");
					 for(int i = 0; i < vacinas.size(); i++){
	                       Vacina vacinas = vacinas.getNomedoPet();
	                      if(vacinas.contains(vacinas)){
	                          System.out.println("Contém na lista: "+vacinas);
	                      }
					 }
					read();
					break;
				case 6:
					System.out.println("Digite qual veterinario deseja buscar:");
					read();
					break;
				case 7:
					System.out.println("Digite por qual vacina deseja buscar:");
					read();
					break;
				case 8:
					System.out.println("Obrigado por ultilizar nosso registro. Tchau.");
				default:
					break;
			}
		}
	}
	
	public static void create() {
		Vacina v = new Vacina();
		v.setNomedoPet(scan.next());
		v.setVeterinario(scan.next());
		v.setNomeVacina(scan.next());
		v.setData(scan.next());
		vacinas.add(v);
	}
	
	public static void read() {
		for(Vacina v: vacinas) {
			System.out.println(v.toString());
		}
	}
	public static void update(int indice) {
		if(indice >= 0 && indice < vacinas.size()) {
			System.out.println(vacinas.get(indice).toString());
			Vacina v = new Vacina();
			v.setNomedoPet(scan.next());
			v.setVeterinario(scan.next());
			v.setNomeVacina(scan.next());
			v.setData(scan.next());
			vacinas.set(indice, v);
			System.out.println("Venda alterada");
		}else
			System.out.println("Item invalido");
	}
	public static void delete(int indice) {
		if(indice >= 0 && indice < vacinas.size()) {
			vacinas.remove(indice);
			System.out.println("Item excluído");
		}else
			System.out.println("Item invalido");
	}

}
