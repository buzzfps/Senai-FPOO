#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int n1 [5];
	int n2 [5];
	int i, p;
	
	for(i=0; i<5; i++){
		printf("Digite os 5 n�meros para o primeiro vetor: ");
		scanf("%d", &n1[i]);
	}
	system("cls");
	printf("O primeiro vetor �: ");
	
	for(i=0; i<5; i++){
		printf("%d", n1[i]);
	}
	printf("\n");
	
		for(p=0; p<5; p++){
		printf("Digite os 5 n�meros para o primeiro vetor: ");
		scanf("%d", &n2[p]);
	}
	system("cls");
	printf("O segundo vetor �: ");
	
	for(p=4; p>=0; p--){
		printf("%d", n2[p]);
	}

	printf("\n");
	printf("A soma dos vetores �: ");
	printf("%d", n1[0] + n2[4]);
	printf("%d", n1[1] + n2[3]);
	printf("%d", n1[2] + n2[2]);
	printf("%d", n1[3] + n2[1]);
	printf("%d", n1[4] + n2[0]);
}
