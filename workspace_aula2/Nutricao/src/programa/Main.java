package programa;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Paciente pacientes[] = new Paciente[10];
		Scanner leia = new Scanner(System.in);
		float totIMC = 0, totPESO = 0, totALTURA = 0;
		float maismagro = 0, maisobeso = 0, maisalto = 0, maisbaixo = 0;
		int total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0;
		System.out.printf("Digite seu nome, peso e altura:\n");
		for(int i = 0; i < 10; i++) {
			pacientes[i] = new Paciente(leia.next(), leia.nextFloat(), leia.nextFloat());
		}
		maismagro = pacientes[0].peso;
		maisobeso = pacientes[0].peso;
		maisalto = pacientes[0].altura;
		maisbaixo = pacientes[0].altura;
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
			totIMC += pacientes[i].imc();
			totPESO += pacientes[i].peso;
			totALTURA += pacientes[i].altura;
			if(pacientes[i].diagnostico() == "Subpeso Severo")total1++;
			if(pacientes[i].diagnostico() == "Subpeso")total2++;
			if(pacientes[i].diagnostico() == "Normal")total3++;
			if(pacientes[i].diagnostico() == "Sobre peso")total4++;
			if(pacientes[i].diagnostico() == "Obeso")total5++;
			if(pacientes[i].diagnostico() == "Obeso Mórbido")total6++;
				if(pacientes[i].peso < maismagro) maismagro = pacientes[i].peso;
				if(pacientes[i].peso > maisobeso) maisobeso = pacientes[i].peso;
				if(pacientes[i].altura < maisbaixo) maisbaixo = pacientes[i].altura;
				if(pacientes[i].altura > maisalto) maisalto = pacientes[i].altura;
		}
		float mediaIMC = totIMC/10f;
		float mediaPESO = totPESO/10f;
		float mediaALTURA = totALTURA/10f;
		
		
		System.out.printf("Médias:\nIMCs[%.2f]\nPesos[%.2f]\nAlturas[%.2f]\n", mediaIMC, mediaPESO, mediaALTURA);
		System.out.printf("\nTotal Pacientes\nSubpeso Severo[%d]\nSubpeso[%d]\nNormal[%d]\nSobre peso[%d]\nObeso[%d]\nObeso Mórbido[%d]\n", total1, total2, total3, total4, total5, total6);
		System.out.printf("Paciente mais magro:[%.2f]\n", maismagro);
		System.out.printf("Paciente mais obeso:[%.2f]\n", maisobeso);
		System.out.printf("Paciente mais alto:[%.2f]\n", maisalto);
		System.out.printf("Paciente mais baixo:[%.2f]\n", maisbaixo);
	}
}
