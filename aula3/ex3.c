/*
Desenvolva um programa que leia o nome de um time de futebol, o n�mero de vit�rias e o n�mero de empates. 
O programa dever� calcular e apresentar na tela, o nome do time e o total de pontos. 
Lembrando que a vit�ria vale 3 pontos e o empate vale 1 ponto.
*/
#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	char time[10];
	int v, e, t;
	
	printf("Digite o nome do time: ");
	scanf("%s", &time);
	
	printf("Digite o n�mero de vit�rias: ");
	scanf("%d", &v);
	
	printf("Digite o n�mero de empates: ");
	scanf("%d", &e);
	
	t = (v * 3) + e;
	
	printf("o total de pontos do time �: %d",t);	
}
