#include <stdio.h>
#include <locale.h>
#include <time.h>


int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[10]; //Vetor a ser classificado
	int i, j; //Contadores
	int aux; //Auxiliar para fazer trocas
	
	//10 entradas sem valida��o
	for(i = 0; i < 10; i++){
		v[i] = rand()%1000;
	}
	
	//Processamento - Algoritmo de classifica��o e troca
	for(i = 0; i < 100; i++){
		for(j = i + 1; j < 100; j++){
			if(v[i] > v[j]){
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
		}
	}

	//sa�da com vetor ordenado
		for(i = 0; i < 100; i++){
			printf("[%d]:%d\n", i,v[i]);
		}
}
