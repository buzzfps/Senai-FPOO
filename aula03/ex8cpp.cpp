#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float raio, altura, at, volume;
	const float PI = 3.14;
	
	printf("Para descobrir a �rea e volume do cilindro, digite: \n\n");
	printf("-Raio do cilindro(cm):");
	scanf("%f", &raio);
	printf("-Altura do cilindro(cm):");
	scanf("%f", &altura);
	
	at = (2 * PI * raio * altura) + 2 * PI * (raio * raio);
	volume = PI * (raio * raio )* altura;
	
	printf("\nA �rea total de um cilindro com raio %.2f cm e altura %.2f cm � de aproximadamente:\n%.2f cm�", raio, altura, at);
	printf("\n\nO volume de um cilindro com raio %.2f cm e altura %.2f cm � de aproximadamente:\n%.2f cm�", raio, altura, volume);
}
