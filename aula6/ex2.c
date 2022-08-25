#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int num [10];
	int i = 0;
	
	for(i = 0; i < 10; i++){
		printf("Digite os números para o vetor: ");
		scanf("%d", &num[i]);
	}
	for(i = 0; i < 10; i++){
		printf(" ");
		printf("%d", num[i]);
	}
	while(num[i]%2 == 0){
		printf("%d", num[i]);
	}
}
