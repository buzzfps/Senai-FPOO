#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float salarioanterior, percentual, valoraumento, salarioatual;
	
	printf("Digite seu sal�rio: ");
	scanf("%f", &salarioanterior);
	
	if(salarioanterior <= 280){
		(percentual = 20);
	}else if(salarioanterior <= 700){
		(percentual = 15);
	}else if(salarioanterior <= 1500){
		(percentual = 10);
	}else{
		(percentual = 5);
	}
	
	valoraumento = salarioanterior * (percentual / 100);
	salarioatual = salarioanterior + valoraumento;
	
	printf("\nSalario antes do reajuste: R$%.2f", salarioanterior);
	printf("\nPercentual do aumento aplicado: %.1f", percentual);
	printf("\nValor do aumento: R$%.2f", valoraumento);
	printf("\nO novo sal�rio, ap�s o aumento � de: R$%.2f", salarioatual);
	
}
