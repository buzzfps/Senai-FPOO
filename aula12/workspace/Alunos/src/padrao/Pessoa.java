package padrao;

public class Pessoa {
	String nome;
	String sobrenome;
	int idade;
	
	Pessoa(){}
	
	Pessoa(String nom, String sobrenom, int id){
	nome = nom;
	sobrenome = sobrenom;
	idade = id;
	}
	
	String faseDaVida() {
		if(idade < 15)return "Criança";
		else if(idade < 30)return "Jovem";
		else if(idade < 60)return "Adulto";
		else return "Idoso";
	}
	
	public String toString() {
		return String.format("%s %s\t%d\t\t%s\n", nome, sobrenome, idade, faseDaVida());
	}
}

