#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float salario, salfamilia;
	int filhos;
	
	printf("Digite o seu sal�rio:\n");
	scanf("%f", &salario);
	
	printf("Digite a quantidade de filhos:\n");
	scanf("%d", &filhos);
	
	if(salario < 1655.58){
		salfamilia = 56.47 * filhos;
	}
	
	printf("O seu salario � R$ %.2f \n", salario);
	printf("O sal�rio fam�lia � R$ %.2f \n", salfamilia);
	printf("O sal�rio final � de R$ %.2f \n", salario + salfamilia);
}
