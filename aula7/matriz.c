#include <stdio.h>
#include <locale.h>
#include <time.h>

int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int matriz [5][5];
	int i,j;
	
	for (i = 0; i < 10; i++){
		for (j = 0; j < 5; j++){
			matriz[i][j] = rand() %100;
		}
	}
	
	for (i = 0; i < 5; i++){
		for (j = 0; j < 5; j++){
			if(matriz[i][j]<10) printf("[%d,%d]:0%d\t", i, j, matriz[i][j]);
			else printf("[%d,%d]:%d\t", i, j, matriz[i][j]);
		}
		printf("\n");
	}
}
