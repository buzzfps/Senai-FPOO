#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int i = 2;
	//Contar at� 10 com o la�o enquanto
	while (i <= 10){
		printf("%d\n", i);
		i++;
	}
}
