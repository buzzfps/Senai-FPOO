#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float preco;
	char nome[20];
	
	printf("Digite o nome da merdacoria:\n");
	scanf("%s", &nome);
	printf("Digite o pre�o do produto:\n");
	scanf("%f", &preco);
	
	if(preco < 1000){
		preco = preco + preco * (float) 5 / 100;
	}else{
		preco = preco + preco * (float) 7 / 100;
	}
	
	printf("O novo pre�o da mercadoria %s � de R$ %2.f", nome,preco);
	
}
	
