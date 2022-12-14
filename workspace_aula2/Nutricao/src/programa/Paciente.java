package programa;

public class Paciente{
	String nome;
	float peso, altura;

	
	Paciente(){}
	
	Paciente(String nom, float pes, float alt){
		nome = nom;
		peso = pes;
		altura = alt;
	}
	
	float imc(){
		return peso/(altura*altura);
	}
	
	String diagnostico() {
		if (peso/(altura*altura)<16)return "Subpeso Severo";
		else if(peso/(altura*altura)<=19.9f)return "Subpeso";
		else if(peso/(altura*altura)<=24.9f)return "Normal";
		else if(peso/(altura*altura)<=29.9f)return "Sobrepeso";
		else if(peso/(altura*altura)<39.9f)return "Obeso";
		else return "Obeso Mórbido";
	}
	public String toString(){
		return String.format("%s\t%.2f\t%.2f\t%.2f\t%s",nome, peso, altura, imc(), diagnostico());
	}
	
}
