#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int vetor[10];
	int i, x;
	
	for(i = 0; i < 10; i++){
		printf("Digite os números para o vetor: ");
		scanf("%d", &vetor[i]);
	}
	system("cls");
	
	printf("números do vetor: ");
	for(i = 0; i < 10; i++){
		printf("%d ", vetor[i]);
	}
	
	printf("\nDigite o número que deseja localizar: ");
	scanf("%d", &x);
	
	printf("O número do vetor é:%d", vetor[x]);
}
