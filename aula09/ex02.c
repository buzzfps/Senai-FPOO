#include <stdio.h>
#include <locale.h>
#include <time.h>

int sorteio();

int main(){
	setlocale(LC_ALL,"");
	srand (time(NULL));
	char nomes[10][10];
	int i, x;
	
	for(i = 0; i < 10; i++){	
		printf("Digite o nome: ");
		scanf("%s", &nomes[i]);
	}
	printf("Digite o quantos nomes você deseja sortear: ")
	

}
