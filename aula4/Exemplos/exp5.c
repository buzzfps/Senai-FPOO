#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	char nome1[3] = "Ana";
	char nome2[3] = "Ivo";
	
	printf("A compara��o retornou %d",strcmp(nome1,nome2));
	
