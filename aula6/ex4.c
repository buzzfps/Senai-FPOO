#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int vetor[10];
	int i, x;
	
	for(i = 0; i < 10; i++){
		printf("Digite os n�meros para o vetor: ");
		scanf("%d", &vetor[i]);
	}
	system("cls");
	
	printf("n�meros do vetor: ");
	for(i = 0; i < 10; i++){
		printf("%d ", vetor[i]);
	}
	
	printf("\nDigite o n�mero que deseja localizar: ");
	scanf("%d", &x);
	
	printf("O n�mero do vetor �:%d", vetor[x]);
}
