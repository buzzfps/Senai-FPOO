#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float a,b,c;
	
	printf("Digite o comprimento do primeiro lado do tri�ngulo:\n");
	scanf("%f", &a);
	printf("Digite o comprimento do primeiro lado do tri�ngulo:\n");
	scanf("%f", &b);
	printf("Digite o comprimento do primeiro lado do tri�ngulo:\n");
	scanf("%f", &c);
	
	if( a == b && b == c){
		printf("\nO tri�ngulo � equil�tero");
	}else if(a != b && a != c && b != c){
		printf("\nO tri�ngulo � escaleno");
	}else{
		printf("\O tri�ngulo � is�sceles");
	}
	
}
