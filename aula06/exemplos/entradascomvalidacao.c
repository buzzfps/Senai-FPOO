#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int v[10];
	int i;
	for(i = 0; i < 10; i++){
		//Entrada com valida��o s� que com "do while"
		do{
			printf("Digite o %d� valor entre 0 e 1000: ",i+1);		
			scanf("%d", &v[i]);
		}while(v[i] < 0 || v[i] > 1000);

	}
	
}
