#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int cor, alcool;
	
	printf("Digite a cor do sem�foro \n[1.verde  ]\n[1.amarelo ]\n[1.vermelho]\n");
	scanf("%d",&cor);
	printf("Voc� ingeriu bebida alco�lica?\n[1. Sim]\n[2.N�o]\n");
	scanf("%d",&alcool);
	
	switch(cor){
		case 1:
			printf("Voc� escolheu verde ent�o pode ir.\n");
			break;
		case 2:
			printf("Voc� escolheu amarelo ent�o pode ir.\n");
			break;
		case 3:
			printf("Voc� escolheu vermelho ent�o pode ir.\n");
			break;
		default:
			printf("Op��o inv�lida\n");
	}
	printf("Fim.");
}
