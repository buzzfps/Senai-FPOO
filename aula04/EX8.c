#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	int a,b;
	
	printf("Digite 2 n�meros inteiros separados por espa�o:\n");
	scanf("%d", &a);
	scanf("%d", &b);
	
	if(a > b){
		printf("O maior n�mero � %d\n", a);
		printf("O menor n�mero � %d\n", b);
	}else if(b > a){
		printf("O maior n�mero � %d\n", b);
		printf("O maior n�mero � %d\n", a);
	}
}
