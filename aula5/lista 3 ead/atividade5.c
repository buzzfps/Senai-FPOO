#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float a, b, c, delta, raiz1, raiz2;
	
	printf("Digite o valor de a: ");
	scanf("%f", &a);
	
	if (a == 0){
		printf("A equa��o n�o � do segundo grau.");
	}else{
		printf("Digite o valor de b: ");
		scanf("%f", b);
		printf("Digite o valor de c: ");
		scanf("%f", c);
		
		delta = (b, 2) - (4 * a * c);
		
		if (delta == 0){
			raiz1 = (-b) / (2 * a);
			printf("O delta � 0, a raiz � %f,", raiz1);
		}else{
			raiz1 = (-b + (delta)) /
		}
	}
}
