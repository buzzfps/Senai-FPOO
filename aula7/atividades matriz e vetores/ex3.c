#include <stdio.h>
#include <locale.h>
#include <time.h>

int main(){
	setlocale(LC_ALL,"");
	char mercadoria[5];
	int preco[5], novopreco[5];
	int i;
	
	printf("Digite o nome das 5 mercadorias:\n");
	for(i = 0; i < 5; i++){
		scanf("%s", &mercadoria[i]);
	}
	
	printf("Preço da mercadoria %s:\n", mercadoria[i]);
	for(i = 0; i < 5; i++){
		scanf("%d", &preco[i]);
	}
}
