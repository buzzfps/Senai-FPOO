/*
Desenvolva um programa que leia tr�s vari�veis (a, b, c) e resolva a express�o: ( a + b ) / c.
*/

#include <stdio.h>
#include <locale.h>
int main(){
	int a,b,c,d;
	printf("Digite um n�mero inteiro: ");
	scanf("%d",&a);
	printf("digite outro n�mero inteiro: ");
	scanf("%d",&b);
	printf("digite outro n�mero inteiro: ");
	scanf("%d",&c);
	d = (a + b) / c;
	printf("o resultado �: %d",d);
}
