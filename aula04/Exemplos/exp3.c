#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int cor;
	
	//entrada
	printf("Digite a cor do sem�foro \n[1.verde]\n[2.amarelo]\n[3.vermelho]");
	scanf("%d", &cor);
	if (cor == 1){
		printf("Voc� escolheu verde ent�o pode ir.\n");
	}else if(cor == 2){
		printf("Voc� escolheu amarelo ent�o fique atento.\n");
	}
	else if(cor == 3){
		printf("Voc� escolheu vermelho ent�o espere.\n");
	}else{
		printf("Op��o inv�lida\n");
	}
	
	printf("acabou.\n");
	
}

