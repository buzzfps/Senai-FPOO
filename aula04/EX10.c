#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int a,b,c;
	float media;
	
	printf("Digite as 3 notas do aluno:\n");
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	
	media = (a + b + c) / 3;
	
	printf("\nA sua m�dia �: %1.f", media);
	if(media >= 6){
		printf("O aluno est� aprovado");
	}else if(media >= 4){
		printf("O aluno est� de recupera��o");
	}else{
		printf("o aluno foi reprovado");
		}
}
