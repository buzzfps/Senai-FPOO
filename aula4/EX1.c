#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float preco;
	
	printf("Digite o pre�o do produto:\n");
	scanf("%f", &preco);
	
	if(preco > 1000){
		preco = preco - preco * 8 / 100;
	}
		
	printf("o pre�o final � R$ %.2f", preco);
		
}
